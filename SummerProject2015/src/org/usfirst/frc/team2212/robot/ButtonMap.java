package org.usfirst.frc.team2212.robot;

import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class ButtonMap {

	public static JoystickButton stopArmButton = new JoystickButton(
			Joysticks.navigatorStick, 3);
	public static JoystickButton moveArmUpButton = new JoystickButton(
			Joysticks.navigatorStick, 4);
	public static JoystickButton moveArmDownButton = new JoystickButton(
			Joysticks.navigatorStick, 5);
	public static JoystickButton stopPickerButton = new JoystickButton(
			Joysticks.navigatorStick, 6);
	public static JoystickButton pickButton = new JoystickButton(
			Joysticks.navigatorStick, 1);
	public static JoystickButton spitButton = new JoystickButton(
			Joysticks.navigatorStick, 2);

	// TODO: Add drivetrain commands here

	/**
	 * This method binds each command to its operating button
	 */
	public static void bind() {
		stopArmButton.whenPressed(Commands.stopArm);
		moveArmUpButton.whenPressed(Commands.moveArmUp);
		moveArmDownButton.whenPressed(Commands.moveArmDown);
		stopPickerButton.whenPressed(Commands.stopPicker);
		pickButton.whenPressed(Commands.pick);
		spitButton.whenPressed(Commands.spit);
	}
}
