package org.usfirst.frc.team2212.robot;

import org.usfirst.frc.team2212.arm.Arm;
import org.usfirst.frc.team2212.drivetrain.Drivetrain;
import org.usfirst.frc.team2212.drivetrain.Gearbox;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends IterativeRobot {

	public static Drivetrain drivetrain;
	public static Arm arm;
	public static OI oi;

	public void robotInit() {
		Gearbox right = new Gearbox(new Talon(RobotMap.RFPORT), new Talon(
				RobotMap.RRPORT));
		Gearbox left = new Gearbox(new Talon(RobotMap.LFPORT), new Talon(
				RobotMap.LRPORT));
		drivetrain = new Drivetrain(right, left);
		arm = new Arm(new DoubleSolenoid(RobotMap.ARMPORT1,RobotMap.ARMPORT2));
		oi = new OI();
	}

	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

}
