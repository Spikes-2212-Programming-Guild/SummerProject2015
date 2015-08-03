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

public class Robot extends IterativeRobot {

	public static Drivetrain drivetrain;
	public static Arm arm;
	public static OI oi;
	public static Picker picker;

	public void robotInit() {
		Gearbox right = new Gearbox(new Talon(RobotMap.RIGHT_FRONT_TALON),
				new Talon(RobotMap.RIGHT_REAR_TALON));
		Gearbox left = new Gearbox(new Talon(RobotMap.LEFT_FRONT_TALON),
				new Talon(RobotMap.LEFT_RIGHT_TALON));
		drivetrain = new Drivetrain(right, left);
		arm = new Arm(new DoubleSolenoid(RobotMap.ARM_OPEN_SOLENOID,
				RobotMap.ARM_CLOSE_SOLENOID), new DigitalInput(
				RobotMap.UP_LIMIT_SWITCH), new DigitalInput(
				RobotMap.DOWN_LIMIT_SWITCH));
		oi = new OI();
	}

	public void teleopPeriodic() {
		Scheduler.getInstance().run();

	}

}
