package com.PizzaStore;

import com.Ingredient.IngredientImpl.NYPizzaIngredientFactory;
import com.Ingredient.IngredientInterface.PizzaIngredientFactory;
import com.Pizza.CheesePizza;
import com.Pizza.ClamPizza;
import com.Pizza.PizzaInterface.Pizza;
import com.PizzaStore.PizzaStoreInterface.PizzaStore;

public class NYStylePizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;

		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		} else if (type.equals("veggie")) {
			return null;
		} else if (type.equals("clam")) {
			return new ClamPizza(ingredientFactory);
		} else if (type.equals("pepperoni")) {
			return null;
		}
		return pizza;
	}

}
