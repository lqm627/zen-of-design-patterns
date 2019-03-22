package com.lqm.pattern.comparison.crossDistrict.contrast_facade_mediator.facade;

import java.util.Random;

public class Attendance {
    //得到出勤天数
    public int getWorkDays() {
        return (new Random()).nextInt(30);
    }
}
