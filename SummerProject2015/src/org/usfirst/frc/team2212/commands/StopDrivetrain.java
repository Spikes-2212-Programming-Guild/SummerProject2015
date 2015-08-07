package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Robot;
import org.usfirst.frc.team2212.subsystems.Drivetrain;

public class StopDrivetrain extends SingleActionCommand {

	public StopDrivetrain() {
		requires(Robot.drivetrain);
	}

	@Override
	protected void doAction() {
		Drivetrain.stop();
	}
}
