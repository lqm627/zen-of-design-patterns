package com.lqm.pattern.comparison.create.contrast_abstractFactory_builder.abstractFactory;

public abstract class AbsBenz implements ICar {
    private final static String BENZ_BAND = "奔驰汽车";
    public String getBand() {
        return BENZ_BAND;
    }
    //具体型号由实现类完成
    public abstract String getModel();
}
