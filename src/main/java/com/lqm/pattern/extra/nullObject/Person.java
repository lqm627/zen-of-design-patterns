package com.lqm.pattern.extra.nullObject;

public class Person {
    //听到动物叫声
    public void hear(Animal animal) {
        if (animal != null) {
            animal.makeSound();
        }
    }
}
