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

	@Override
	protected void initialize() {
		Subsystems.picker.spit();
	}

	@Override
	protected void execute() {
	}

	@Override
	protected boolean isFinished() {
		return isTimedOut();
	}

	@Override
	protected void end() {
		Subsystems.picker.stop();
	}

	@Override
	protected void interrupted() {
		end();
	}
}
