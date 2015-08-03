package org.usfirst.frc.team2212.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {

	Gearbox right, left;

	public Drivetrain(Gearbox right, Gearbox left) {
		this.right = right;
		this.left = left;
	}

	public void straight(double speed) {

		right.set(speed);
		left.set(-speed);
	}

	public void turn(double speed) {
		right.set(speed);
		left.set(speed);
	}

	public void setTwoSides(double leftSpeed, double rightSpeed) {
		right.set(rightSpeed);
		left.set(leftSpeed);

	}

	public void arcade(double y, double x) {
		
	}

	protected void initDefaultCommand() {

	}

}
