package com.PizzaTest;

import com.Pizza.PizzaInterface.Pizza;
import com.PizzaStore.ChicagoStylePizzaStore;
import com.PizzaStore.NYStylePizzaStore;
import com.PizzaStore.PizzaStoreInterface.PizzaStore;

public class PizzaTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PizzaStore nyStore = new NYStylePizzaStore();
		PizzaStore chicagoStore = new ChicagoStylePizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName());
		System.out.println("//" + pizza.toString() + "//");
		
		System.out.println();

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName());
		System.out.println("//" + pizza.toString() + "//");

	}

}
