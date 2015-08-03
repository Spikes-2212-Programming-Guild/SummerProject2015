package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Robot;

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
		if (!Robot.arm.isUp()) {
			Robot.arm.moveUp();
		}
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return Robot.arm.isUp();
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.arm.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
