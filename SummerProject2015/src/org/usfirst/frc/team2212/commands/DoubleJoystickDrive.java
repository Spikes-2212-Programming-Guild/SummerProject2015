package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Joysticks;
import org.usfirst.frc.team2212.robot.Subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class DoubleJoystickDrive extends Command {

	private Joystick left, right;

	public DoubleJoystickDrive() {
		requires(Subsystems.drivetrain);
		this.left = Joysticks.driverLeft;
		this.right = Joysticks.driverRight;
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Subsystems.drivetrain.setTwoSides(left.getY(), right.getY());
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {

	}

	@Override
	protected void interrupted() {

	}

}
