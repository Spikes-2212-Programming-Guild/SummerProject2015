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
		Hardware.init();
		Subsystems.init();
		Commands.init();
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
		SmartDashboard.putData("PDP", Hardware.pdp);
		SmartDashboard.putData(Commands.stopArm);
		SmartDashboard.putData(Commands.moveArmUp);
		SmartDashboard.putData(Commands.moveArmDown);
		SmartDashboard.putData(Commands.stopPicker);
		SmartDashboard.putData(Commands.pick);
		SmartDashboard.putData(Commands.spit);
	}

}
