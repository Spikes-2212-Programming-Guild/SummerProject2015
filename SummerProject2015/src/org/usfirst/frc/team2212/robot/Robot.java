package org.usfirst.frc.team2212.robot;

import org.usfirst.frc.team2212.subsystems.Arm;
import org.usfirst.frc.team2212.subsystems.Drivetrain;
import org.usfirst.frc.team2212.subsystems.Gearbox;
import org.usfirst.frc.team2212.subsystems.Picker;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {

	public static Drivetrain drivetrain;
	public static Arm arm;
	public static OI oi;
	public static Picker picker;

	public void robotInit() {
		Gearbox right = new Gearbox(new Talon(RobotMap.RFPORT), new Talon(
				RobotMap.RRPORT));
		Gearbox left = new Gearbox(new Talon(RobotMap.LFPORT), new Talon(
				RobotMap.LRPORT));
		drivetrain = new Drivetrain(right, left);
		arm = new Arm(new DoubleSolenoid(RobotMap.ARMPORT1, RobotMap.ARMPORT2),
				new DigitalInput(RobotMap.UPRobotMap.DOWN));
		oi = new OI();
	}

	public void teleopPeriodic() {
		Scheduler.getInstance().run();

	}

}
