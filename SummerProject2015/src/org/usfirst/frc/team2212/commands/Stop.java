package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Stop extends Command {

	public Stop() {
		requires(Robot.drivetrain);
	}

	protected void initialize() {
	}

	protected void execute() {

		Robot.drivetrain.straight(0);
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
	}

	protected void interrupted() {
	}
}
