package org.usfirst.frc.team2212.robot;

import org.usfirst.frc.team2212.subsystems.Arm;
import org.usfirst.frc.team2212.subsystems.Drivetrain;
import org.usfirst.frc.team2212.subsystems.Picker;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends IterativeRobot {

	public static Drivetrain drivetrain;
	public static Arm arm;
	public static Picker picker;
	public static JoystickMap oi;

	public void robotInit() {
		drivetrain = new Drivetrain();
		arm = new Arm();
		picker = new Picker();
	}

	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

}
