package com.Starbuzz;

public class Soy extends CondimentDecorator {
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		switch (beverage.getSize()) {
		case TALL:
			cost+=.10;
		case GRANDE:
			cost+=.15;
		case VENTI:
			cost+=.20;
		}
		return cost;
		/*if (beverage.getSize() == Size.TALL) {
			cost+=.10;
		} else if (beverage.getSize() == Size.GRANDE) {
			cost+=.15;
		} else if (beverage.getSize() == Size.VENTI) {
			cost+=.20;
		} else {
			return .15 + beverage.cost();
		}*/
	}
}
