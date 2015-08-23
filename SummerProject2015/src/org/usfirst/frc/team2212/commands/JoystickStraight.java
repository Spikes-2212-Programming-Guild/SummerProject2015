package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

/**
 * A neverending command that drives the robot forward in the given joystick's
 * forward value
 *
 */
public class JoystickStraight extends Command {

	Joystick joystick;

	public JoystickStraight(Joystick joystick) {
		requires(Subsystems.drivetrain);
		this.joystick = joystick;
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Subsystems.drivetrain.straight(joystick.getY());
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
