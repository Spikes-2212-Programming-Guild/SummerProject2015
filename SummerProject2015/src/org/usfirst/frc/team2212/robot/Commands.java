package org.usfirst.frc.team2212.robot;

import org.usfirst.frc.team2212.commands.DoubleJoystickDrive;
import org.usfirst.frc.team2212.commands.JoystickArcade;
import org.usfirst.frc.team2212.commands.JoystickStraight;
import org.usfirst.frc.team2212.commands.JoystickTurn;
import org.usfirst.frc.team2212.commands.MoveArmDown;
import org.usfirst.frc.team2212.commands.MoveArmUp;
import org.usfirst.frc.team2212.commands.Pick;
import org.usfirst.frc.team2212.commands.Spit;
import org.usfirst.frc.team2212.commands.StopArm;
import org.usfirst.frc.team2212.commands.StopDrivetrain;
import org.usfirst.frc.team2212.commands.StopPicker;

public class Commands {

	public static StopArm stopArm;
	public static StopPicker stopPicker;
	public static MoveArmUp moveArmUp;
	public static MoveArmDown moveArmDown;
	public static Pick pick;
	public static Spit spit;
	public static DoubleJoystickDrive doublejoystickdrive;
	public static JoystickArcade joystickarcade;
	public static JoystickStraight joystickstraight;
	public static JoystickTurn joystickturn;
	public static StopArm stoparm;
	public static StopPicker stoppicker;
	public static StopDrivetrain stopdrivetrain;

	public static void init() {
		stopArm = new StopArm();
		stopPicker = new StopPicker();
		moveArmUp = new MoveArmUp();
		moveArmDown = new MoveArmDown();
		pick = new Pick();
		spit = new Spit();
		doublejoystickdrive = new DoubleJoystickDrive();
		joystickarcade = new JoystickArcade(Joysticks.driverRight);
		joystickstraight = new JoystickStraight(Joysticks.driverRight);
		joystickturn = new JoystickTurn(Joysticks.driverRight);
		stoparm = new StopArm();
		stopdrivetrain = new StopDrivetrain();
		stoppicker = new StopPicker();
	}
}
