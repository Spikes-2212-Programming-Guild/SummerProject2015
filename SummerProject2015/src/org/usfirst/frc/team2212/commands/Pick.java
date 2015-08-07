package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Robot;
import org.usfirst.frc.team2212.subsystems.Picker;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Pick extends Command {

	public Pick() {
		requires(Robot.picker);
	}

	protected void initialize() {
		if (!Picker.isBallInside()) {
			Picker.pick();
		}
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
	}

	protected boolean isFinished() {
		return Picker.isBallInside();
	}

	// Called once after isFinished returns true
	protected void end() {
		Picker.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
