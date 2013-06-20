package com.template;

public class TestTemplate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CaffeineBeverage beverage = new Tea();
		beverage.prepareRecipe();

		System.out.println();

		beverage = new Coffee();
		beverage.prepareRecipe();
	}

}
