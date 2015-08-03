package org.usfirst.frc.team2212.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem {

	DoubleSolenoid piston;
	DigitalInput up, down;

	public Arm(DoubleSolenoid ds, DigitalInput up, DigitalInput down) {
		this.piston = ds;
		this.down = down;
		this.up = up;
	}

	public void moveUp() {
		piston.set(Value.kForward);
	}

	public void moveDown() {
		piston.set(Value.kReverse);
	}

	public boolean isUp() {
		return up.get();
	}

	public boolean isDown() {
		return down.get();
	}

	public void stop() {

		piston.set(Value.kOff);
	}

	protected void initDefaultCommand() {

	}
}
