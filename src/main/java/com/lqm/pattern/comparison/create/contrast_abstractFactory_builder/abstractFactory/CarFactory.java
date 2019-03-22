package com.lqm.pattern.comparison.create.contrast_abstractFactory_builder.abstractFactory;

public interface CarFactory {
    //生产SUV
    public ICar createSuv();
    //生产商务车
    public ICar createVan();
}
