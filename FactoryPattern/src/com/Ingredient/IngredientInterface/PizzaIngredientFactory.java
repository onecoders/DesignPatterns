package com.Ingredient.IngredientInterface;

import com.Ingredient.Cheese;
import com.Ingredient.Clams;
import com.Ingredient.Dough;
import com.Ingredient.Pepperoni;
import com.Ingredient.Sauce;
import com.Ingredient.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheese();

	public Veggies[] createVeggies();

	public Pepperoni createPepperoni();

	public Clams createClam();

}
