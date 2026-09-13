package com.star.labs.graal;

public final class StarLabsRuntimeHostTest {
    public static void main(String[] args) {
        StarLabsRuntimeHost host = new StarLabsRuntimeHost();
        StarLabsRuntimeHost.Result success = host.run("function add(a, b) { return a + b; } echo(add(10, 20));");
        if (!success.success || !"30.0".equals(success.output)) {
            throw new AssertionError("POC failed: " + success.code + " " + success.output);
        }
        StarLabsRuntimeHost.Result failure = host.run("echo(missing(1));");
        if (failure.success || !"GS2_UNKNOWN_FUNCTION".equals(failure.code)) {
            throw new AssertionError("Error path failed: " + failure.code);
        }
        System.out.println("StarLabsRuntimeHost POC: PASS");
    }
}
