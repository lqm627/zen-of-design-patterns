package com.lqm.pattern.comparison.crossDistrict.contrast_facade_mediator.facade;

import java.util.Random;

public class Performance {
    //基本工资
    private BasicSalary salary = new BasicSalary();

    //绩效奖励
    public int getPerformanceValue() {
        //随机绩效
        int perf = (new Random()).nextInt(100);
        return salary.getBasicSalary() * perf / 100;
    }
}
