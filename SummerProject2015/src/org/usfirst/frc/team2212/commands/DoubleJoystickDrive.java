package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class DoubleJoystickDrive extends Command {

	private Joystick left, right;

	public DoubleJoystickDrive(Joystick left, Joystick right) {
		requires(Robot.drivetrain);
		this.left = left;
		this.right = right;
	}

	@Override
	protected void initialize() {
		Robot.drivetrain.setTwoSides(left.getY(), right.getY());
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub

	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
