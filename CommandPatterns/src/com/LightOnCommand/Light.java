package com.LightOnCommand;

public class Light {

	private static Light light = null;

	private Light() {
	}

	public static Light getLightInstance() {
		if (light == null) {
			light = new Light();
		}
		return light;
	}

	public void on() {
		System.out.println("Turn the light on");
	}

	public void off() {
		System.out.println("Turn the light off");
	}
}
