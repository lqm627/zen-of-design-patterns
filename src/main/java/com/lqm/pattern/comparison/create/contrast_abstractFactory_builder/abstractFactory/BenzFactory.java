package com.lqm.pattern.comparison.create.contrast_abstractFactory_builder.abstractFactory;

public class BenzFactory implements CarFactory {
    //生产SUV
    public ICar createSuv() {
        return new BenzSuv();
    }
    //生产商务车
    public ICar createVan(){
        return new BenzVan();
    }
}
