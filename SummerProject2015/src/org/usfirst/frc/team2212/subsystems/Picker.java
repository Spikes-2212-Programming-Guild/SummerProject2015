package org.usfirst.frc.team2212.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Picker extends Subsystem {

	Relay pickMotor;
	DigitalInput ballInside;

	public Picker(Relay pickMotor, DigitalInput ballInside) {
		this.pickMotor = pickMotor;
		this.ballInside = ballInside;
	}

	protected void initDefaultCommand() {
	}

	public void pick() {
		pickMotor.set(Relay.Value.kForward);
	}

	public void spit() {
		pickMotor.set(Relay.Value.kReverse);
	}

	public void stop() {
		pickMotor.set(Relay.Value.kOff);
	}

	public Value getValue() {
		return pickMotor.get();
	}

	public boolean isBallInside() {
		return ballInside.get();
	}
}
