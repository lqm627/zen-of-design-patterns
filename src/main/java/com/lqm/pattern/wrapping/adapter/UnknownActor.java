package com.lqm.pattern.wrapping.adapter;

public class UnknownActor implements IActor {
    //普通演员演戏
    public void playact(String context) {
        System.out.println("普通演员："+context);
    }
}

