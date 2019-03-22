package com.lqm.pattern.wrapping.decorator;

public abstract class Decorator implements IStar {
    //粉饰的是谁
    private IStar star;
    public Decorator(IStar _star){
        this.star = _star;
    }
    public void act() {
        this.star.act();
    }
}
