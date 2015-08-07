package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Robot;
import org.usfirst.frc.team2212.subsystems.Arm;

public class StopArm extends SingleActionCommand {

	public StopArm() {
		requires(Robot.arm);
	}

	@Override
	protected void doAction() {
		Arm.stop();
	}
}
