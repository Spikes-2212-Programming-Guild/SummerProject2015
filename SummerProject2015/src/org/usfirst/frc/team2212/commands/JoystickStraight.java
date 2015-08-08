package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class JoystickStraight extends Command {

	Joystick joystick;

	public JoystickStraight(Joystick joystick) {
		requires(Subsystems.drivetrain);
		this.joystick = joystick;
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	protected void execute() {
		Subsystems.drivetrain.straight(joystick.getY());
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
