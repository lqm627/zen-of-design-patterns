package com.lqm.pattern.wrapping.bridge;

public class Singer extends AbsStar {
    //歌星的默认活动是唱歌
    public Singer(){
        super(new Sing());
    }
    //也可以重新设置一个新职业
    public Singer(AbsAction _action){
        super(_action);
    }
    //细化歌星的职责
    public void doJob(){
        System.out.println("\n======歌星的工作=====");
        super.doJob();
    }
}
