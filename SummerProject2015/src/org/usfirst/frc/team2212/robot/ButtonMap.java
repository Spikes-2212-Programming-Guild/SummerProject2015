package org.usfirst.frc.team2212.robot;

import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class ButtonMap {

	public static JoystickButton stopArmButton = new JoystickButton(
			JoystickMap.navigator, 3);
	public static JoystickButton moveArmUpButton = new JoystickButton(
			JoystickMap.navigator, 4);
	public static JoystickButton moveArmDownButton = new JoystickButton(
			JoystickMap.navigator, 5);
	public static JoystickButton stopPickerButton = new JoystickButton(
			JoystickMap.navigator, 6);
	public static JoystickButton pickButton = new JoystickButton(
			JoystickMap.navigator, 1);
	public static JoystickButton spitButton = new JoystickButton(
			JoystickMap.navigator, 2);

	public static void bind() {
		stopArmButton.whenPressed(CommandMap.stopArm);
		moveArmUpButton.whenPressed(CommandMap.moveArmUp);
		moveArmDownButton.whenPressed(CommandMap.moveArmDown);
		stopPickerButton.whenPressed(CommandMap.stopPicker);
		pickButton.whenPressed(CommandMap.pick);
		spitButton.whenPressed(CommandMap.spit);
	}
}
