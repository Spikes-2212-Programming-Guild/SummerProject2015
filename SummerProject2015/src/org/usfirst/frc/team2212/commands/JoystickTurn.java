package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

/**
 * A neverending command that turns the robot in the given joystick's rotation
 * 
 */
public class JoystickTurn extends Command {

	Joystick joystick;

	public JoystickTurn(Joystick joystick) {
		requires(Subsystems.drivetrain);
		this.joystick = joystick;
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Subsystems.drivetrain.turn(joystick.getX());
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
