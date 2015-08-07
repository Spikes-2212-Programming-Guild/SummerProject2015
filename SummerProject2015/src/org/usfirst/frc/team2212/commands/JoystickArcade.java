package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.JoystickMap;
import org.usfirst.frc.team2212.robot.Robot;
import org.usfirst.frc.team2212.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.command.Command;

public class JoystickArcade extends Command {

	public JoystickArcade() {
		requires(Robot.drivetrain);
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Drivetrain.arcade(JoystickMap.driver.getY(), JoystickMap.driver.getX());
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
