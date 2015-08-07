package orf.usfirst.frc.team2212.triggers;

import org.usfirst.frc.team2212.robot.DoubleJoystick;
import org.usfirst.frc.team2212.robot.DoubleJoystick.Hand;

import edu.wpi.first.wpilibj.buttons.Button;

/**
 *
 */
public class DoubleJoystickButton extends Button {

	private DoubleJoystick doubleJoystick;
	private Hand hand;
	private int num;

	public DoubleJoystickButton(DoubleJoystick doubleJoystick, Hand hand,
			int num) {
		this.doubleJoystick = doubleJoystick;
		this.hand = hand;
		this.num = num;
	}

	@Override
	public boolean get() {
		return doubleJoystick.getRawButton(hand, num);
	}

}
