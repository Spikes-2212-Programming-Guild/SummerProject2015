package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Subsystems;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Pick extends Command {

	public Pick() {
		requires(Subsystems.picker);
	}

	protected void initialize() {
		if (!Subsystems.picker.isBallInside()) {
			Subsystems.picker.pick();
		}
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
	}

	protected boolean isFinished() {
		return Subsystems.picker.isBallInside();
	}

	// Called once after isFinished returns true
	protected void end() {
		Subsystems.picker.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
