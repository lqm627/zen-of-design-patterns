package com.lqm.pattern.wrapping.bridge;

public abstract class AbsStar {
    //一个明星参加哪些活动
    protected final AbsAction action;
    //通过构造函数传递具体活动
    public AbsStar(AbsAction _action){
        this.action = _action;
    }
    //每个明星都有自己的主要工作
    public void doJob(){
        action.desc();
    }
}
