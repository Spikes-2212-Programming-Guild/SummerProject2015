package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Robot;

public class StopDrivetrain extends SingleActionCommand {

	public StopDrivetrain() {
		requires(Robot.drivetrain);
	}

	@Override
	protected void doAction() {
		Robot.drivetrain.straight(0);
	}
}
