package com.lqm.pattern.comparison.structure.contrast_adapter_decorator.adapter;

public class Decorator implements Swan {
    private Swan swan;
    //修饰的是谁
    public Decorator(Swan _swan){
        this.swan =_swan;
    }
    public void cry() {
        swan.cry();
    }
    public void desAppearance() {
        swan.desAppearance();
    }
    public void fly() {
        swan.fly();
    }
}