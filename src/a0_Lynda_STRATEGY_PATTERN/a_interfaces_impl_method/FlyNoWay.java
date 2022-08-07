package a0_Lynda_STRATEGY_PATTERN.a_interfaces_impl_method;

import a0_Lynda_STRATEGY_PATTERN.a_interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
		System.out.println("I can't fly");
    }
}
