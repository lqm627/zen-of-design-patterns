package com.lqm.pattern.comparison.behavioral.contrast_state_strategy.state;

public class ChildState extends HumanState{
    //儿童的工作就是玩耍
    public void work(){
        System.out.println("儿童的工作是玩耍！");
        super.human.setState(Human.ADULT_STATE);
    }
}

