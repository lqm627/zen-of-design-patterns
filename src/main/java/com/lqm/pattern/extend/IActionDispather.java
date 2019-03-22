package com.lqm.pattern.extend;

public interface IActionDispather {
    //根据Action的名字，返回处理结果
    public String actionInvoke(String actionName);
}
