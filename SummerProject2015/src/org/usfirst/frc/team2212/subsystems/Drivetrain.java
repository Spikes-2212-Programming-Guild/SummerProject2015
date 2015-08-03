package org.usfirst.frc.team2212.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {

	Gearbox right, left;

	public Drivetrain(Gearbox right, Gearbox left) {
		this.right = right;
		this.left = left;
	}

	public void straight(double speed) {

		right.forward(speed);
		left.forward(-speed);
	}

	public void turn(double speed) {
		right.forward(speed);
		left.forward(speed);
	}

	public void twosides(double leftspeed, double rightspeed) {
		right.forward(rightspeed);
		left.forward(leftspeed);

	}

	protected void initDefaultCommand() {

	}

}
