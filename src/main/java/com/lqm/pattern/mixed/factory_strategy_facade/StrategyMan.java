package com.lqm.pattern.mixed.factory_strategy_facade;

public enum StrategyMan {
    STEADY_DEDUCTION(SteadyDeduction.class.getName()),
    FREE_DEDUCTION(FreeDeduction.class.getName());
    String value = "";

    private StrategyMan(String _value) {
        this.value = _value;
    }

    public String getValue() {
        return this.value;
    }
}
