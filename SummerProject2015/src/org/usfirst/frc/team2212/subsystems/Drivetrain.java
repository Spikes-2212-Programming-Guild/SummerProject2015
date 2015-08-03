package org.usfirst.frc.team2212.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {

	Gearbox right, left;

	public Drivetrain(Gearbox right, Gearbox left) {
		this.right = right;
		this.left = left;
	}

	public void straight(double speed) {
		left.set(-speed);
		right.set(speed);

	}

	public void turn(double speed) {
		left.set(speed);
		right.set(speed);

	}

	public void setTwoSides(double leftSpeed, double rightSpeed) {
		left.set(leftSpeed);
		right.set(rightSpeed);

	}

	public void arcade(double moveValue, double rotateValue) {
		double leftSpeed, rightSpeed;
		if (moveValue > 0.0) {
			if (rotateValue > 0.0) {
				leftSpeed = moveValue - rotateValue;
				rightSpeed = Math.max(moveValue, rotateValue);
			} else {
				leftSpeed = Math.max(moveValue, -rotateValue);
				rightSpeed = moveValue + rotateValue;
			}
		} else {
			if (rotateValue > 0.0) {
				leftSpeed = -Math.max(-moveValue, rotateValue);
				rightSpeed = moveValue + rotateValue;
			} else {
				leftSpeed = moveValue - rotateValue;
				rightSpeed = -Math.max(-moveValue, -rotateValue);
			}
		}
		setTwoSides(leftSpeed, rightSpeed);
	}

	protected void initDefaultCommand() {

	}

}
