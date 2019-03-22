package com.lqm.pattern.wrapping.decorator;

public class Deny extends Decorator {
    public Deny(IStar _star){
        super(_star);
    }
    public void act(){
        super.act();
        System.out.println("演后：百般抵赖，死不承认");
    }
}
