package org.usfirst.frc.team2212.subsystems;

import org.usfirst.frc.team2212.robot.ChannelMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem {

	public static DoubleSolenoid piston = new DoubleSolenoid(
			ChannelMap.PCM.kArmOpenSolenoid, ChannelMap.PCM.kArmCloseSolenoid);

	public static DigitalInput upSwitch = new DigitalInput(
			ChannelMap.DIO.kArmUpSwitch);
	public static DigitalInput downSwitch = new DigitalInput(
			ChannelMap.DIO.kArmDownSwitch);

	public static void moveUp() {
		piston.set(Value.kForward);
	}

	public static void moveDown() {
		piston.set(Value.kReverse);
	}

	public static boolean isUp() {
		return upSwitch.get();
	}

	public static boolean isDown() {
		return downSwitch.get();
	}

	public static void stop() {
		piston.set(Value.kOff);
	}

	protected void initDefaultCommand() {

	}
}
