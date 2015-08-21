package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Subsystems;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Spits the ball
 */
public class Spit extends Command {

	public Spit() {
		super();
		requires(Subsystems.picker);
	}

	public Spit(double timeout) {
		super(timeout);
		requires(Subsystems.picker);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		Subsystems.picker.spit();
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return isTimedOut();
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Subsystems.picker.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		end();
	}
}
