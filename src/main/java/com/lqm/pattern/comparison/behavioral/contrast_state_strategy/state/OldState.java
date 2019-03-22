package com.lqm.pattern.comparison.behavioral.contrast_state_strategy.state;

public class OldState extends HumanState {
    //老年人的工作就是享受天伦之乐
    @Override
    public void work() {
        System.out.println("老年人的工作就是享受天伦之乐！");
    }
}
