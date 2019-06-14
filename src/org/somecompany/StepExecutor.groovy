package org.somecompany

class StepExecutor implements IStepExecutor {

    private _step

    StepExecutor(steps) {
        this._step = steps
    }

    @Override
    int sh(String command) {
        this._step.sh returnStatus: true, script: "${command}"
    }

    @Override
    void error(String command) {
        this._step.error(message)
    }
}
