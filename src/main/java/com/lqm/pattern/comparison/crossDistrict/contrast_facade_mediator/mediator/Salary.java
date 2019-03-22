package com.lqm.pattern.comparison.crossDistrict.contrast_facade_mediator.mediator;

public class Salary extends AbsColleague implements ISalary {
    public Salary(AbsMediator _mediator) {
        super(_mediator);
    }

    public void decreaseSalary() {
        super.mediator.down(this);
    }

    public void increaseSalary() {
        super.mediator.up(this);
    }
}
