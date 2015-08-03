package org.usfirst.frc.team2212.robot;

import org.usfirst.frc.team2212.subsystems.Arm;
import org.usfirst.frc.team2212.subsystems.Drivetrain;
import org.usfirst.frc.team2212.subsystems.Picker;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {

	public static Drivetrain drivetrain;
	public static Arm arm;
	public static Picker picker;

	public void robotInit() {
		ButtonMap.bind();
		drivetrain = new Drivetrain();
		arm = new Arm();
		picker = new Picker();
		printToSmartDashboard();

	}

	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	public void printToSmartDashboard() {
		SmartDashboard.putData("PDP", HardwareMap.pdp);
		SmartDashboard.putData(CommandMap.stopArm);
		SmartDashboard.putData(CommandMap.moveArmUp);
		SmartDashboard.putData(CommandMap.moveArmDown);
		SmartDashboard.putData(CommandMap.stopPicker);
		SmartDashboard.putData(CommandMap.pick);
		SmartDashboard.putData(CommandMap.spit);
	}

}
