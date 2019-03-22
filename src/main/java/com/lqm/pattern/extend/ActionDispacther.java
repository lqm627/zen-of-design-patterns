package com.lqm.pattern.extend;

import java.util.ArrayList;

public class ActionDispacther implements IActionDispather {
    //需要执行的Action
    private ActionManager actionManager = new ActionManager();
    //拦截器链
    private ArrayList<Interceptors> listInterceptors = InterceptorFactory.createInterceptors();

    public String actionInvoke(String actionName) {
        //前置拦截器
        return actionManager.execAction(actionName);
        //后置拦截器
    }
}
