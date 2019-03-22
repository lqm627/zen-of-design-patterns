package com.lqm.pattern.comparison.behavioral.contrast_state_strategy.strategy;

public class Context {
    private WorkAlgorithm workMethod;
    public WorkAlgorithm getWork() {
        return workMethod;
    }
    public void setWork(WorkAlgorithm work) {
        this.workMethod = work;
    }
    //每个算法都有必须具有的功能
    public void work(){
        workMethod.work();
    }
}
