package com.test;

import com.GarageDoorOpenCommand.GarageDoor;
import com.GarageDoorOpenCommand.GarageDoorOpenCommand;
import com.LightOnCommand.Light;
import com.LightOnCommand.LightOnCommand;
import com.command.SimpleRemoteControl;

public class RemoteControlTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleRemoteControl remote = new SimpleRemoteControl();
		LightOnCommand lighton = new LightOnCommand(Light.getLightInstance());
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(
				new GarageDoor());

		remote.setCommand(lighton);
		remote.buttonWasPressed();
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
	}

}
