package org.usfirst.frc.team2212.robot;

import org.usfirst.frc.team2212.robot.DoubleJoystick.Hand;

import edu.wpi.first.wpilibj.Joystick;

public class JoystickMap {

	public static final Hand DRIVER_PRIMARY_HAND = Hand.RIGHT;

	public static DoubleJoystick driver = new DoubleJoystick(
			DRIVER_PRIMARY_HAND, 0, 1);
	public static Joystick navigator = new Joystick(2);

}
