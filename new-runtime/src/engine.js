'use strict';

const { parse } = require('./parser');
const { VM } = require('./vm');
const { LanguageService } = require('./language-service');

class RuntimeEngineError extends Error {}

class RuntimeEngine {
  constructor({ registry, bridge, maxSteps = 100000 } = {}) {
    this.registry = registry;
    this.bridge = bridge;
    this.maxSteps = maxSteps;
    this.languageService = new LanguageService({ registry });
    this.state = 'ready';
    this.activeScript = null;
    this.lastExecution = null;
    this.logs = [];
    this.cancelRequested = false;
  }

  log(level, message, metadata = {}) {
    const entry = { level, message, at: new Date().toISOString(), ...metadata };
    this.logs.push(entry);
    return entry;
  }

  stop() {
    if (this.state === 'running') {
      this.cancelRequested = true;
      this.log('info', 'Runtime cancellation requested');
    }
  }

  run(source, { scriptName = 'script.gs2', context = 'client' } = {}) {
    if (this.state === 'running') throw new RuntimeEngineError('Runtime is already running');
    const started = Date.now();
    this.state = 'running';
    this.activeScript = scriptName;
    this.cancelRequested = false;
    this.log('info', `${scriptName} started`, { script: scriptName });
    const analysis = this.languageService.analyze(source, { scriptName, context });
    if (analysis.diagnostics.length > 0) {
      this.state = 'error';
      this.log('error', analysis.diagnostics[0].message, { script: scriptName, diagnostics: analysis.diagnostics });
      return { state: this.state, diagnostics: analysis.diagnostics, logs: this.logs };
    }
    try {
      const vm = new VM({ bridge: this.bridge, maxSteps: this.maxSteps, shouldCancel: () => this.cancelRequested });
      const globals = vm.run(analysis.program);
      this.lastExecution = { script: scriptName, durationMs: Date.now() - started, steps: vm.steps };
      this.state = 'ready';
      this.log('info', `${scriptName} finished`, { script: scriptName, steps: vm.steps, durationMs: this.lastExecution.durationMs });
      return { state: this.state, globals, diagnostics: [], logs: this.logs, execution: this.lastExecution };
    } catch (error) {
      this.state = error.message === 'Execution cancelled' ? 'ready' : 'error';
      this.log(this.state === 'ready' ? 'info' : 'error', error.message, { script: scriptName });
      return { state: this.state, diagnostics: [{ script: scriptName, line: error.line || 1, column: error.column || 1, category: 'runtime', message: error.message }], logs: this.logs };
    } finally {
      this.activeScript = null;
    }
  }

  runDocuments(documents, options = {}) {
    const results = [];
    for (const document of documents) {
      const result = this.run(document.source, { ...options, scriptName: document.name });
      results.push(result);
      if (result.state === 'error') break;
    }
    return results;
  }
}

module.exports = { RuntimeEngine, RuntimeEngineError };