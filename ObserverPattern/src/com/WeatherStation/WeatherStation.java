package com.WeatherStation;

import com.ObserverImplememt.CurrentConditionsDisplay;
import com.ObserverImplememt.WeatherData;

public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(
				weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
	}

}
