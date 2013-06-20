package com.Starbuzz;

public abstract class Beverage {

	public enum Size {
		TALL, GRANDE, VENTI
	}

	String description = "Unknown Beberage";
	Size size = Size.VENTI;

	public String getDescription() {
		return description;
	}

	public abstract double cost();

	public void setSize(Size size) {
		this.size = size;
	}

	public Size getSize() {
		return this.size;
	}

}
