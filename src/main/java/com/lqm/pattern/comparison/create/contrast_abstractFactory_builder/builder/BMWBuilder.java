package com.lqm.pattern.comparison.create.contrast_abstractFactory_builder.builder;

public class BMWBuilder extends CarBuilder {
    public String buildEngine() {
        return super.getBlueprint().getEngine();
    }
    public String buildWheel() {
        return super.getBlueprint().getWheel();
    }
}

