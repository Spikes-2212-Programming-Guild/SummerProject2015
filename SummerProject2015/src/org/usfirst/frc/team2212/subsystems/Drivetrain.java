package org.usfirst.frc.team2212.subsystems;

import org.usfirst.frc.team2212.commands.DoubleJoystickDrive;
import org.usfirst.frc.team2212.robot.ChannelMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {

	public static final DoubleTalon left = new DoubleTalon(
			ChannelMap.PWM.kLeftFrontMotor, ChannelMap.PWM.kLeftRearMotor);
	public static final DoubleTalon right = new DoubleTalon(
			ChannelMap.PWM.kRightFrontMotor, ChannelMap.PWM.kRightRearMotor);

	public static void stop() {
		left.set(0);
		right.set(0);
	}

	public static void straight(double speed) {
		left.set(-speed);
		right.set(speed);

	}

	public static void turn(double speed) {
		left.set(speed);
		right.set(speed);

	}

	public static void setTwoSides(double leftSpeed, double rightSpeed) {
		left.set(leftSpeed);
		right.set(rightSpeed);

	}

	public static void arcade(double moveValue, double rotateValue) {
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
		setDefaultCommand(new DoubleJoystickDrive());
	}
}
