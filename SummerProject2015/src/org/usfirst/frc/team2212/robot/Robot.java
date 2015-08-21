package org.usfirst.frc.team2212.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This class is the main class of the robot program
 *
 */
public class Robot extends IterativeRobot {

	@Override
	public void robotInit() {
		Subsystems.init();
		ButtonMap.bind();
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
