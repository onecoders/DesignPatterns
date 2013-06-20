package com.Pizza;

import com.Ingredient.IngredientInterface.PizzaIngredientFactory;
import com.Pizza.PizzaInterface.Pizza;

public class ClamPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + getName());
		this.dough = ingredientFactory.createDough();
		this.sauce = ingredientFactory.createSauce();
		this.cheese = ingredientFactory.createCheese();
		this.clams = ingredientFactory.createClam();
	}

}
