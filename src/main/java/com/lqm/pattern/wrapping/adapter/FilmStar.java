package com.lqm.pattern.wrapping.adapter;

public class FilmStar implements IStar {
    public void act(String context) {
        System.out.println("明星演戏：" + context);
    }
}
