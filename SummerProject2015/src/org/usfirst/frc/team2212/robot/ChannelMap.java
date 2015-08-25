package org.usfirst.frc.team2212.robot;

public class ChannelMap {
	public static class PWM {
		public static final int kRightFrontMotor = 2;
		public static final int kRightRearMotor = 3;
		public static final int kPickerMotor = 4;
		public static final int kLeftFrontMotor = 0;
		public static final int kLeftRearMotor = 1;
	}

	public static class DIO {
		public static final int kArmUpSwitch = 0;
		public static final int kArmDownSwitch = 1;
		public static final int kBallInsideSwitch = 2;
	}

	public static class PCM {
		public static final int kArmOpenSolenoid = 4;
		public static final int kArmCloseSolenoid = 5;
	}

}
