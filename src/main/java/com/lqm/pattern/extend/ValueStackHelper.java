package com.lqm.pattern.extend;

import com.opensymphony.xwork2.util.ValueStack;

import javax.servlet.http.HttpServletRequest;

public class ValueStackHelper {


    //接受从HTTP传递过来的值，并放入堆栈中
    public ValueStack putIntoStack(HttpServletRequest req) {
        return null;
    }

    //得到当前的值栈
    public static ValueStack getValueStack() {
        return null;
    }
}
