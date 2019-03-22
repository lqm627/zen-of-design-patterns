package com.lqm.pattern.wrapping.adapter;

public class Standin implements IStar {
    private IActor actor;
    //替身是谁
    public Standin(IActor _actor){
        this.actor = _actor;
    }
    public void act(String context) {
        actor.playact(context);
    }
}
