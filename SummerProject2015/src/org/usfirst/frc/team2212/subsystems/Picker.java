package org.usfirst.frc.team2212.subsystems;

import org.usfirst.frc.team2212.robot.HardwareMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Picker extends Subsystem {

	Relay motor;
	DigitalInput ballInside;

	public Picker() {
		this.motor = HardwareMap.pickerMotor;
		this.ballInside = HardwareMap.ballInsideSwitch;
	}

	protected void initDefaultCommand() {
	}

	public void pick() {
		motor.set(Relay.Value.kForward);
	}

	public void spit() {
		motor.set(Relay.Value.kReverse);
	}

	public void stop() {
		motor.set(Relay.Value.kOff);
	}

	public Value getValue() {
		return motor.get();
	}

	public boolean isBallInside() {
		return ballInside.get();
	}
}
