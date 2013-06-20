package com.ReworkWeatherStation;

import java.util.Observable;
import java.util.Observer;

import com.ObserverInterface.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	Observable observable;
	private float temperature;
	private float humidity;
	private float pressure;

	public CurrentConditionsDisplay(Observable obs) {
		this.observable = obs;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.pressure = weatherData.getPressure();
			display();
		}

	}

	@Override
	public void display() {
		System.out.println("Current conditions:" + temperature
				+ "F degrees and " + humidity + "% humidity ,pressure "
				+ pressure);

	}

}
