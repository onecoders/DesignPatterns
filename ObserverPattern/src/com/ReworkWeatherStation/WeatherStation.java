package com.ReworkWeatherStation;

import java.util.Observable;
import java.util.Observer;

public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Observable observable = new WeatherData();

		Observer observer = new CurrentConditionsDisplay(observable);

		if (observable instanceof WeatherData) {
			((WeatherData) observable).setMeasurements(80, 65, 30.4f);
		}
	}
}
