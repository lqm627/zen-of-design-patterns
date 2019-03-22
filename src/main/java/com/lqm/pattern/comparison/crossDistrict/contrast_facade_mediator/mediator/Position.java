package com.lqm.pattern.comparison.crossDistrict.contrast_facade_mediator.mediator;

public class Position extends AbsColleague implements IPosition {
    public Position(AbsMediator _mediator) {
        super(_mediator);
    }

    public void demote() {
        super.mediator.down(this);
    }

    public void promote() {
        super.mediator.up(this);
    }
}
