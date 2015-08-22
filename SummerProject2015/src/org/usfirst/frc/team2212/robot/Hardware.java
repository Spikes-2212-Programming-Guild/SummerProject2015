package org.usfirst.frc.team2212.robot;

import org.usfirst.frc.team2212.subsystems.Gearbox;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Talon;

public class Hardware {

	public static Gearbox leftGearbox;
	public static Gearbox rightGearbox;

	public static Talon pickerMotor;

	public static DoubleSolenoid armPiston;

	public static DigitalInput armUpSwitch;
	public static DigitalInput armDownSwitch;
	public static DigitalInput ballInsideSwitch;

	public static PowerDistributionPanel pdp;

	/**
	 * Should be called in the Robot class before any other initialization
	 * happens
	 */
	public static void init() {
		leftGearbox = new Gearbox(ChannelMap.PWM.kLeftFrontMotor,
				ChannelMap.PWM.kLeftRearMotor);
		rightGearbox = new Gearbox(ChannelMap.PWM.kRightFrontMotor,
				ChannelMap.PWM.kRightRearMotor);
		pickerMotor = new Talon(ChannelMap.PWM.kPickerMotor);
		armPiston = new DoubleSolenoid(ChannelMap.PCM.kArmOpenSolenoid,
				ChannelMap.PCM.kArmCloseSolenoid);
		armUpSwitch = new DigitalInput(ChannelMap.DIO.kArmUpSwitch);
		armDownSwitch = new DigitalInput(ChannelMap.DIO.kArmDownSwitch);
		ballInsideSwitch = new DigitalInput(ChannelMap.DIO.kBallInsideSwitch);
		pdp = new PowerDistributionPanel();
	}

}
