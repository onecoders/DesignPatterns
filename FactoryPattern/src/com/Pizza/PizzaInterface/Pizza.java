package com.Pizza.PizzaInterface;

import com.Ingredient.Cheese;
import com.Ingredient.Clams;
import com.Ingredient.Dough;
import com.Ingredient.Pepperoni;
import com.Ingredient.Sauce;
import com.Ingredient.Veggies;

public abstract class Pizza {

	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Veggies[] veggies;
	protected Cheese cheese;
	protected Pepperoni pepperoni;
	protected Clams clams;

	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "This's " + getName();
	}
}