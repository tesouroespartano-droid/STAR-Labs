package com.star.labs.graal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Small in-process GS2 execution host for the first Android POC. */
public final class StarLabsRuntimeHost {
    private static final Pattern FUNCTION = Pattern.compile(
            "function\\s+([A-Za-z_][A-Za-z0-9_]*)\\s*\\(([^)]*)\\)\\s*\\{([^{}]*)\\}",
            Pattern.DOTALL);

    public Result run(String source) {
        if (source == null || source.trim().isEmpty()) return Result.error("GS2_EMPTY_SOURCE", "Source is empty");
        Map<String, Function> functions = new HashMap<>();
        Matcher matcher = FUNCTION.matcher(source);
        String main = source;
        while (matcher.find()) {
            String[] parameters = splitNames(matcher.group(2));
            String body = matcher.group(3).trim();
            if (!body.matches("(?s)^(?:let\\s+[A-Za-z_][A-Za-z0-9_]*\\s*=\\s*[^;]+;\\s*)*return\\s+.+;?$")) {
                return Result.error("GS2_UNSUPPORTED_FUNCTION", "Only let declarations followed by return are supported in this POC");
            }
            functions.put(matcher.group(1), new Function(parameters, body));
            main = main.replace(matcher.group(0), "");
        }
        try {
            String output = "";
            for (String statement : splitStatements(main)) {
                String trimmed = statement.trim();
                if (trimmed.isEmpty()) continue;
                if (trimmed.startsWith("echo(" ) && trimmed.endsWith(")")) {
                    output = value(new Expression(trimmed.substring(5, trimmed.length() - 1)), functions, new HashMap<>()).toString();
                } else if (trimmed.startsWith("let ")) {
                    parseLet(trimmed, functions, new HashMap<>());
                } else {
                    throw new HostError("GS2_UNSUPPORTED_STATEMENT", "Unsupported statement: " + trimmed);
                }
            }
            return Result.success(output);
        } catch (HostError error) {
            return Result.error(error.code, error.getMessage());
        }
    }

    private static void parseLet(String statement, Map<String, Function> functions, Map<String, Object> variables) throws HostError {
        int equals = statement.indexOf('=');
        if (equals < 5) throw new HostError("GS2_INVALID_LET", "Invalid let declaration");
        String name = statement.substring(4, equals).trim();
        variables.put(name, value(new Expression(statement.substring(equals + 1).trim()), functions, variables));
    }

    private static Object value(Expression expression, Map<String, Function> functions, Map<String, Object> variables) throws HostError {
        return new ExpressionParser(expression.text, functions, variables).parse();
    }

    private static String[] splitNames(String source) {
        if (source.trim().isEmpty()) return new String[0];
        String[] values = source.split(",");
        for (int index = 0; index < values.length; index++) values[index] = values[index].trim();
        return values;
    }

    private static List<String> splitStatements(String source) {
        List<String> result = new ArrayList<>();
        int start = 0;
        for (int index = 0; index < source.length(); index++) {
            if (source.charAt(index) == ';') {
                result.add(source.substring(start, index));
                start = index + 1;
            }
        }
        if (start < source.length()) result.add(source.substring(start));
        return result;
    }

    private static final class Function {
        private final String[] parameters;
        private final String body;

        private Function(String[] parameters, String body) {
            this.parameters = parameters;
            this.body = body;
        }
    }

    private static final class Expression {
        private final String text;

        private Expression(String text) { this.text = text; }
    }

    private static final class ExpressionParser {
        private final String source;
        private final Map<String, Function> functions;
        private final Map<String, Object> variables;
        private int index;

        private ExpressionParser(String source, Map<String, Function> functions, Map<String, Object> variables) {
            this.source = source.trim();
            this.functions = functions;
            this.variables = variables;
        }

        private Object parse() throws HostError {
            Object result = add();
            skip();
            if (index != source.length()) throw new HostError("GS2_INVALID_EXPRESSION", "Unexpected expression tail");
            return result;
        }

        private Object add() throws HostError {
            Object result = multiply();
            while (true) {
                skip();
                if (match('+')) result = number(result) + number(multiply());
                else if (match('-')) result = number(result) - number(multiply());
                else return result;
            }
        }

        private Object multiply() throws HostError {
            Object result = primary();
            while (true) {
                skip();
                if (match('*')) result = number(result) * number(primary());
                else if (match('/')) result = number(result) / number(primary());
                else return result;
            }
        }

        private Object primary() throws HostError {
            skip();
            if (match('(')) {
                Object result = add();
                expect(')');
                return result;
            }
            if (index < source.length() && (source.charAt(index) == '"' || source.charAt(index) == '\'')) return string();
            if (index < source.length() && (Character.isDigit(source.charAt(index)) || source.charAt(index) == '-')) return numberLiteral();
            String name = identifier();
            skip();
            if (match('(')) {
                List<Object> args = new ArrayList<>();
                skip();
                if (!match(')')) {
                    do { args.add(add()); skip(); } while (match(','));
                    expect(')');
                }
                return call(name, args);
            }
            if (!variables.containsKey(name)) throw new HostError("GS2_UNKNOWN_IDENTIFIER", "Unknown identifier: " + name);
            return variables.get(name);
        }

        private Object call(String name, List<Object> args) throws HostError {
            Function function = functions.get(name);
            if (function == null) throw new HostError("GS2_UNKNOWN_FUNCTION", "Unknown function: " + name);
            if (args.size() != function.parameters.length) throw new HostError("GS2_ARGUMENT_COUNT", "Wrong argument count for: " + name);
            Map<String, Object> local = new HashMap<>();
            for (int position = 0; position < args.size(); position++) local.put(function.parameters[position], args.get(position));
            for (String statement : splitStatements(function.body)) {
                String trimmed = statement.trim();
                if (trimmed.startsWith("let ")) parseLet(trimmed, functions, local);
                else if (trimmed.startsWith("return ")) return new ExpressionParser(trimmed.substring(7), functions, local).parse();
            }
            throw new HostError("GS2_MISSING_RETURN", "Function has no return: " + name);
        }

        private String identifier() throws HostError {
            skip();
            int start = index;
            while (index < source.length() && (Character.isLetterOrDigit(source.charAt(index)) || source.charAt(index) == '_')) index++;
            if (start == index) throw new HostError("GS2_EXPECTED_IDENTIFIER", "Expected identifier");
            return source.substring(start, index);
        }

        private Object string() throws HostError {
            char quote = source.charAt(index++);
            int start = index;
            while (index < source.length() && source.charAt(index) != quote) index++;
            if (index >= source.length()) throw new HostError("GS2_UNTERMINATED_STRING", "Unterminated string");
            String result = source.substring(start, index);
            index++;
            return result;
        }

        private Number numberLiteral() throws HostError {
            int start = index;
            if (source.charAt(index) == '-') index++;
            while (index < source.length() && (Character.isDigit(source.charAt(index)) || source.charAt(index) == '.')) index++;
            try { return Double.parseDouble(source.substring(start, index)); }
            catch (NumberFormatException error) { throw new HostError("GS2_INVALID_NUMBER", "Invalid number"); }
        }

        private double number(Object value) throws HostError {
            if (value instanceof Number) return ((Number) value).doubleValue();
            throw new HostError("GS2_TYPE_ERROR", "Arithmetic requires numbers");
        }

        private boolean match(char expected) { if (index < source.length() && source.charAt(index) == expected) { index++; return true; } return false; }
        private void expect(char expected) throws HostError { skip(); if (!match(expected)) throw new HostError("GS2_EXPECTED_TOKEN", "Expected '" + expected + "'"); }
        private void skip() { while (index < source.length() && Character.isWhitespace(source.charAt(index))) index++; }
    }

    private static final class HostError extends Exception {
        private final String code;
        private HostError(String code, String message) { super(message); this.code = code; }
    }

    public static final class Result {
        public final boolean success;
        public final String code;
        public final String message;
        public final String output;

        private Result(boolean success, String code, String message, String output) {
            this.success = success; this.code = code; this.message = message; this.output = output;
        }

        public static Result success(String output) { return new Result(true, "OK", "Execution completed", output); }
        public static Result error(String code, String message) { return new Result(false, code, message, ""); }
    }
}