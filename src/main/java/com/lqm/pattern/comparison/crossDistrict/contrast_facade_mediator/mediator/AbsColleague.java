package com.lqm.pattern.comparison.crossDistrict.contrast_facade_mediator.mediator;

public abstract class AbsColleague {
    //每个同事类都对中介者非常了解
    protected AbsMediator mediator;

    public AbsColleague(AbsMediator _mediator) {
        this.mediator = _mediator;
    }
}

