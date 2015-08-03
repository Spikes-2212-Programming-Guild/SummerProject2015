package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class JoystickArcade extends Command {

	Joystick joystick;

	public JoystickArcade(Joystick joystick) {
		requires(Robot.drivetrain);
		this.joystick = joystick;
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Robot.drivetrain.arcade(joystick.getY(), joystick.getX());
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
