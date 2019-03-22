package com.lqm.pattern.comparison.structure.contrast_adapter_decorator.adapter;

public class StrongBehavior extends Decorator {
    //强化谁
    public StrongBehavior(Swan _swan){
        super(_swan);
    }
    //会飞行了
    public void fly(){
        System.out.println("会飞行了！");
    }
}
