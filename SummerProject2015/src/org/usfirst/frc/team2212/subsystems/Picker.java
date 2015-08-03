package org.usfirst.frc.team2212.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Picker extends Subsystem {

	Relay pickMotor;

	protected void initDefaultCommand() {
	}

	public void take() {
		pickMotor.set(Relay.Value.kForward);
	}

	public void throwball() {
		pickMotor.set(Relay.Value.kReverse);
	}

	public void stop() {
		pickMotor.set(Relay.Value.kOff);
	}

	public Value getValue() {
		return pickMotor.get();
	}
}
