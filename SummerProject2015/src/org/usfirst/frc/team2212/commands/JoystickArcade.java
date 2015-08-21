package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

/**
 * A neverending command that drives the robot arcadely in the given joystick's
 * values
 *
 */
public class JoystickArcade extends Command {

	Joystick joystick;

	public JoystickArcade(Joystick joystick) {
		requires(Subsystems.drivetrain);
		this.joystick = joystick;
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Subsystems.drivetrain.arcade(joystick.getY(), joystick.getX());
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
