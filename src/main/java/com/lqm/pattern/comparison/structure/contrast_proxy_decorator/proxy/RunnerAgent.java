package com.lqm.pattern.comparison.structure.contrast_proxy_decorator.proxy;

import com.lqm.pattern.comparison.structure.contrast_proxy_decorator.IRunner;

import java.util.Random;

public class RunnerAgent implements IRunner {
    private IRunner runner;
    public RunnerAgent(IRunner _runner){
        this.runner = _runner;
    }
    //代理人是不会跑的
    public void run() {
        Random rand = new Random();
        if(rand.nextBoolean()){
            System.out.println("代理人同意安排运动员跑步");
            runner.run();
        }else{
            System.out.println("代理人心情不好，不安排运动员跑步");
        }
    }
}
