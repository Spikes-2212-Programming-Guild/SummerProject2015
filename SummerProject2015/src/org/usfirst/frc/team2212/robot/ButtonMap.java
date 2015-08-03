package org.usfirst.frc.team2212.robot;

import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class ButtonMap {

	public static JoystickButton stopArmButton = new JoystickButton(
			JoystickMap.navigatorStick, 3);
	public static JoystickButton moveArmUpButton = new JoystickButton(
			JoystickMap.navigatorStick, 4);
	public static JoystickButton moveArmDownButton = new JoystickButton(
			JoystickMap.navigatorStick, 5);

	public static void init() {
		stopArmButton.whenPressed(CommandMap.stopArm);
		moveArmUpButton.whenPressed(CommandMap.moveArmUp);
		moveArmDownButton.whenPressed(CommandMap.moveArmDown);
	}
}
