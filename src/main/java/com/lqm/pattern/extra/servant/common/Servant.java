package com.lqm.pattern.extra.servant.common;

public class Servant {
    //服务内容
    public void service(IServiced serviceFuture) {
        serviceFuture.serviced();
    }
}
