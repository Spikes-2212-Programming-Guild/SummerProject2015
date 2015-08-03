package org.usfirst.frc.team2212.robot;

import org.usfirst.frc.team2212.commands.MoveArmDown;
import org.usfirst.frc.team2212.commands.MoveArmUp;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class JoystickMap {

	public static Joystick driverRightStick = new Joystick(0);
	public static Joystick driverLeftStick = new Joystick(1);
	public static Joystick navigatorStick = new Joystick(2);

	JoystickButton armUp = new JoystickButton(navigatorStick, 4);
	JoystickButton armDown = new JoystickButton(navigatorStick, 5);

	public JoystickMap() {
		armUp.whenPressed(new MoveArmUp());
		armDown.whenPressed(new MoveArmDown());
	}

}
