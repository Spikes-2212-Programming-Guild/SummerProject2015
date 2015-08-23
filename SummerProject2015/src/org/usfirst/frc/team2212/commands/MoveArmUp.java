package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Subsystems;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Moves the arm up
 */
public class MoveArmUp extends Command {

	public MoveArmUp() {
		requires(Subsystems.arm);
	}

	protected void initialize() {
		if (!Subsystems.arm.isUp()) {
			Subsystems.arm.moveUp();
		}
	}

	@Override
	protected void execute() {
	}

	@Override
	protected boolean isFinished() {
		return Subsystems.arm.isUp();
	}

	@Override
	protected void end() {
		Subsystems.arm.stop();
	}

	@Override
	protected void interrupted() {
		end();
	}
}
