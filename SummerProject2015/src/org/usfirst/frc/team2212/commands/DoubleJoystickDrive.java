package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.DoubleJoystick.Hand;
import org.usfirst.frc.team2212.robot.JoystickMap;
import org.usfirst.frc.team2212.robot.Robot;
import org.usfirst.frc.team2212.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.command.Command;

public class DoubleJoystickDrive extends Command {

	public DoubleJoystickDrive() {
		requires(Robot.drivetrain);
	}

	@Override
	protected void initialize() {
		Drivetrain.setTwoSides(JoystickMap.driver.getY(Hand.LEFT),
				JoystickMap.driver.getY(Hand.RIGHT));
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
