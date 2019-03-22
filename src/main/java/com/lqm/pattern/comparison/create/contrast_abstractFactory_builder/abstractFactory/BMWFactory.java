package com.lqm.pattern.comparison.create.contrast_abstractFactory_builder.abstractFactory;

public class BMWFactory implements CarFactory {
    //生产SUV
    public ICar createSuv() {
        return new BMWSuv();
    }
    //生产商务车
    public ICar createVan(){
        return new BMWVan();
    }
}
