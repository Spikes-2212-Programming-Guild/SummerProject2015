package org.usfirst.frc.team2212.robot;

import org.usfirst.frc.team2212.commands.MoveArmDown;
import org.usfirst.frc.team2212.commands.MoveArmUp;
import org.usfirst.frc.team2212.commands.StopArm;
import org.usfirst.frc.team2212.commands.StopDrivetrain;
import org.usfirst.frc.team2212.commands.StopPicker;

public class CommandMap {

	public static final StopArm stopArm = new StopArm();
	public static final StopDrivetrain stopDrivetrain = new StopDrivetrain();
	public static final StopPicker stopPicker = new StopPicker();
	public static final MoveArmUp moveArmUp = new MoveArmUp();
	public static final MoveArmDown moveArmDown = new MoveArmDown();

}
