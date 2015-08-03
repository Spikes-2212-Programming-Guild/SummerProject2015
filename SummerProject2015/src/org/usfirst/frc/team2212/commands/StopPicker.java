package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Robot;

public class StopPicker extends SingleActionCommand {

	public StopPicker() {
		requires(Robot.picker);
	}
	
	@Override
	protected void doAction() {
		Robot.picker.stop();
	}
}
