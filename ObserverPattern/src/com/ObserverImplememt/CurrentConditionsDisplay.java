package com.ObserverImplememt;

import com.ObserverInterface.DisplayElement;
import com.ObserverInterface.Observer;
import com.ObserverInterface.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherDataSub) {
		this.weatherData = weatherDataSub;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current conditions:" + temperature
				+ "F degrees and " + humidity + "% humidity " + "pressure "
				+ pressure);
	}

}
