package com.Ingredient.IngredientImpl;

import com.Ingredient.Cheese;
import com.Ingredient.Clams;
import com.Ingredient.Dough;
import com.Ingredient.FreshClams;
import com.Ingredient.Garlic;
import com.Ingredient.MarinaraSauce;
import com.Ingredient.Mushroom;
import com.Ingredient.Onion;
import com.Ingredient.Pepperoni;
import com.Ingredient.RedPepper;
import com.Ingredient.ReggianoCheese;
import com.Ingredient.Sauce;
import com.Ingredient.SlicedPepperoni;
import com.Ingredient.ThinCrustDough;
import com.Ingredient.Veggies;
import com.Ingredient.IngredientInterface.PizzaIngredientFactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		return new Veggies[] { new Garlic(), new Onion(), new Mushroom(),
				new RedPepper() };
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}

}
