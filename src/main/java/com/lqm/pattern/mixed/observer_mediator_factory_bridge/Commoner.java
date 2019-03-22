package com.lqm.pattern.mixed.observer_mediator_factory_bridge;

public class Commoner extends EventCustomer {
    //定义平民能够处理的事件的级别
    public Commoner() {
        super(EventCustomType.NEW);
    }

    @Override
    public void exec(ProductEvent event) {
        //事件的源头
        Product p = event.getSource();
        //事件类型
        ProductEventType type = event.getEventType();
        System.out.println("平民处理事件:" + p.getName() + "诞生记,事件类型=" + type);
    }
}
