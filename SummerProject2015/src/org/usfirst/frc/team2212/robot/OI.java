package org.usfirst.frc.team2212.robot;

import org.usfirst.frc.team2212.commands.MoveArmDown;
import org.usfirst.frc.team2212.commands.MoveArmUp;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {

	Joystick j = new Joystick(6);
	JoystickButton armUp = new JoystickButton(j, 4);
	JoystickButton armDown = new JoystickButton(j, 5);

	public OI() {
		armUp.whenPressed(new MoveArmUp());
		armDown.whenPressed(new MoveArmDown());
	}

	public Joystick getJoystick() {
		return j;
	}

}
