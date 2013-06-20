package com.Starbuzz;

public class SteamedMilk extends CondimentDecorator {

	Beverage beverage;

	public SteamedMilk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage + ", SteamedMilk";
	}

	@Override
	public double cost() {
		return beverage.cost() + .10;
	}

}
