package com.iterator;

import java.util.Iterator;

public class Waitress {

	private Menu pancakeHouseMenu, dinerMenu, cafeMenu;

	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}

	public void printMenu() {
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeHouseMenu.createIterator());
		System.out.println("\nLUNCH");
		printMenu(dinerMenu.createIterator());
		System.out.println("\nDINNER");
		printMenu(cafeMenu.createIterator());
	}

	private void printMenu(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println("Name:" + menuItem.getName() + ","
					+ "Description:" + menuItem.getDescription() + ","
					+ "Vegatarian:" + menuItem.isVegatarian() + "," + "Price:"
					+ menuItem.getPrice());
		}
	}

	public static void main(String[] args) {
		new Waitress(new PancakeHouseMenu(), new DinerMenu(), new CafeMenu())
				.printMenu();
	}

}
