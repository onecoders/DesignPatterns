package com.compsite;

public class MenuItem extends MenuComponent {
	String name;
	String description;
	boolean vegetarian;
	double price;

	public MenuItem(String name, String description, boolean vegetarian,
			double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean isVegatarian() {
		return vegetarian;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public void print() {
		System.out.print(" " + getName());
		if (isVegatarian()) {
			System.out.print("(v)");
		}
		System.out.print(", " + getPrice());
		System.out.println("  --" + getDescription());
	}

}
