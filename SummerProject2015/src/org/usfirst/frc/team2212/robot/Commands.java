package org.usfirst.frc.team2212.robot;

import org.usfirst.frc.team2212.commands.MoveArmDown;
import org.usfirst.frc.team2212.commands.MoveArmUp;
import org.usfirst.frc.team2212.commands.Pick;
import org.usfirst.frc.team2212.commands.Spit;
import org.usfirst.frc.team2212.commands.StopArm;
import org.usfirst.frc.team2212.commands.StopPicker;

public class Commands {

	public static StopArm stopArm;
	public static StopPicker stopPicker;
	public static MoveArmUp moveArmUp;
	public static MoveArmDown moveArmDown;
	public static Pick pick;
	public static Spit spit;

	public static void init() {
		stopArm = new StopArm();
		stopPicker = new StopPicker();
		moveArmUp = new MoveArmUp();
		moveArmDown = new MoveArmDown();
		pick = new Pick();
		spit = new Spit();
	}
}
