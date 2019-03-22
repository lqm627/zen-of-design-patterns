package com.lqm.pattern.wrapping.proxy;

public class Agent implements IStar {
    //定义是谁的经纪人
    private IStar star;
    //构造函数传递明星
    public Agent(IStar _star){
        this.star = _star;
    }
    //经纪人是不会签字的，签字了歌迷也不认
    public void sign() {
        star.sign();
    }
}