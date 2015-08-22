package org.usfirst.frc.team2212.subsystems;

import org.usfirst.frc.team2212.robot.HardwareMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Picker extends Subsystem {

	public static final double PICK_SPEED = 0.5;
	public static final double SPIT_SPEED = -0.5;

	Talon motor;
	DigitalInput ballInside;

	public Picker() {
		this.motor = HardwareMap.pickerMotor;
		this.ballInside = HardwareMap.ballInsideSwitch;
	}

	protected void initDefaultCommand() {
	}

	public void pick() {
		motor.set(PICK_SPEED);
	}

	public void spit() {
		motor.set(SPIT_SPEED);
	}

	public void stop() {
		motor.set(0);
	}

	public double getMotorSpeed() {
		return motor.get();
	}

	public boolean isBallInside() {
		return ballInside.get();
	}
}
