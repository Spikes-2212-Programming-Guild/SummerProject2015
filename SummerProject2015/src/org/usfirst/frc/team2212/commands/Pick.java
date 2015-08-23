package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Subsystems;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Picks the ball
 */
public class Pick extends Command {

	public Pick() {
		requires(Subsystems.picker);
	}

	@Override
	protected void initialize() {
		if (!Subsystems.picker.isBallInside()) {
			Subsystems.picker.pick();
		}
	}

	@Override
	protected void execute() {
	}

	@Override
	protected boolean isFinished() {
		return Subsystems.picker.isBallInside();
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
