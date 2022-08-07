package a0_Lynda_STRATEGY_PATTERN.c_concrete_duck_impl;

import a0_Lynda_STRATEGY_PATTERN.a_interfaces_impl_method.FlyWithWings;
import a0_Lynda_STRATEGY_PATTERN.b_abstract_class_duck.Duck;

public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehavior = new FlyWithWings();
	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
