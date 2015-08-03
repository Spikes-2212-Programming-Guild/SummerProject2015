package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class JoystickTurn extends Command {

	Joystick joystick;

	public JoystickTurn(Joystick joystick) {
		requires(Robot.drivetrain);
		this.joystick = joystick;
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	protected void execute() {
		Robot.drivetrain.turn(joystick.getX());
	}

	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
