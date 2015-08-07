package org.usfirst.frc.team2212.subsystems;

import org.usfirst.frc.team2212.robot.ChannelMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Picker extends Subsystem {

	public static Relay motor = new Relay(ChannelMap.Relay.kPickerMotor);
	public static DigitalInput ballInsideSwitch = new DigitalInput(
			ChannelMap.DIO.kBallInsideSwitch);

	protected void initDefaultCommand() {
	}

	public static void pick() {
		motor.set(Relay.Value.kForward);
	}

	public static void spit() {
		motor.set(Relay.Value.kReverse);
	}

	public static void stop() {
		motor.set(Relay.Value.kOff);
	}

	public static Value getValue() {
		return motor.get();
	}

	public static boolean isBallInside() {
		return ballInsideSwitch.get();
	}
}
