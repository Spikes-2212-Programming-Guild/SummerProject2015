package org.usfirst.frc.team2212.arm;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem {

	DoubleSolenoid ds;

	public Arm(DoubleSolenoid ds) {

		this.ds = ds;

	}

	public void moveUp() {

		ds.set(Value.kForward);
	}

	public void moveDown() {

		ds.set(Value.kReverse);
	}

	public void stop() {

		ds.set(Value.kOff);
	}

	protected void initDefaultCommand() {
		
	}
}
