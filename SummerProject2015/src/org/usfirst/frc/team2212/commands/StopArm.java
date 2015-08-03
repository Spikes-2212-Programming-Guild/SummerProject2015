package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Robot;


public class StopArm extends SingleActionCommand {

	public StopArm() {
		requires(Robot.arm);
	}

	@Override
	protected void doAction() {
		Robot.arm.stop();
	}
}
