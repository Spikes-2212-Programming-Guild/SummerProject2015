package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Robot;
import org.usfirst.frc.team2212.subsystems.Arm;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MoveArmUp extends Command {

	public MoveArmUp() {
		requires(Robot.arm);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		if (!Arm.isUp()) {
			Arm.moveUp();
		}
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return Arm.isUp();
	}

	// Called once after isFinished returns true
	protected void end() {
		Arm.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
