package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Subsystems;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Moves the arm down
 */
public class MoveArmDown extends Command {

	public MoveArmDown() {
		requires(Subsystems.arm);
	}

	@Override
	protected void initialize() {
		if (!Subsystems.arm.isDown()) {
			Subsystems.arm.moveDown();
		}
	}

	@Override
	protected void execute() {
	}

	@Override
	protected boolean isFinished() {
		return Subsystems.arm.isDown();
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
