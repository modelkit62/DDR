package a0_Lynda_STRATEGY_PATTERN;

import a0_Lynda_STRATEGY_PATTERN.a_interfaces_impl_method.FlyNoWay;
import a0_Lynda_STRATEGY_PATTERN.c_concrete_duck_impl.MallardDuck;

public class App {
 
	public static void main(String[] args) {
		MallardDuck mallard = new MallardDuck();
		mallard.display();
		mallard.performFly();
		mallard.setFlyBehavior(new FlyNoWay());
		mallard.performFly();
	}
}
