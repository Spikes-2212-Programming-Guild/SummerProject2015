package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Subsystems;

public class StopDrivetrain extends SingleActionCommand {

	public StopDrivetrain() {
		requires(Subsystems.drivetrain);
	}

	@Override
	protected void doAction() {
		Subsystems.drivetrain.straight(0);
	}
}
