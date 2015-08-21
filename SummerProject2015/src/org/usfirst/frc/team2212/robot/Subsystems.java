package org.usfirst.frc.team2212.robot;

import org.usfirst.frc.team2212.subsystems.Arm;
import org.usfirst.frc.team2212.subsystems.Drivetrain;
import org.usfirst.frc.team2212.subsystems.Picker;

public class Subsystems {

	public static Picker picker;
	public static Drivetrain drivetrain;
	public static Arm arm;

	/**
	 * Should be called in the Robot class before any command is initialized and
	 * before any bind happens
	 */
	public static void init() {
		drivetrain = new Drivetrain();
		arm = new Arm();
		picker = new Picker();
	}

}
