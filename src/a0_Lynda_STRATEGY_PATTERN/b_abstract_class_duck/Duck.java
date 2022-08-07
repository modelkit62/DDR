package a0_Lynda_STRATEGY_PATTERN.b_abstract_class_duck;

import a0_Lynda_STRATEGY_PATTERN.a_interfaces.FlyBehavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior; // HAS-A (COMPOSITION)

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    protected abstract void display();
}
