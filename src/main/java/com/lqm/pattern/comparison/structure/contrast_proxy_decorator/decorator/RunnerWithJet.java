package com.lqm.pattern.comparison.structure.contrast_proxy_decorator.decorator;

import com.lqm.pattern.comparison.structure.contrast_proxy_decorator.IRunner;

public class RunnerWithJet implements IRunner {
    private IRunner runner;
    public RunnerWithJet(IRunner _runner){
        this.runner = _runner;
    }
    public void run() {
        System.out.println("加快运动员的速度：为运动员增加喷气装置");
        runner.run();
    }
}
