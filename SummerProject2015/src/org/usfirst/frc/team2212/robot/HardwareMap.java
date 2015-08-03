package org.usfirst.frc.team2212.robot;

import org.usfirst.frc.team2212.subsystems.Gearbox;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Relay;

public class HardwareMap {

	public static Gearbox leftGearbox = new Gearbox(
			ChannelMap.PWM.kLeftFrontMotor, ChannelMap.PWM.kLeftRearMotor);
	public static Gearbox rightGearbox = new Gearbox(
			ChannelMap.PWM.kRightFrontMotor, ChannelMap.PWM.kRightRearMotor);

	public static Relay pickerMotor = new Relay(ChannelMap.Relay.kPickerMotor);

	public static DoubleSolenoid armPiston = new DoubleSolenoid(
			ChannelMap.PCM.kArmOpenSolenoid, ChannelMap.PCM.kArmCloseSolenoid);

	public static DigitalInput armUpSwitch = new DigitalInput(
			ChannelMap.DIO.kArmUpSwitch);
	public static DigitalInput armDownSwitch = new DigitalInput(
			ChannelMap.DIO.kArmDownSwitch);
	public static DigitalInput ballInsideSwitch = new DigitalInput(
			ChannelMap.DIO.kBallInsideSwitch);

}
