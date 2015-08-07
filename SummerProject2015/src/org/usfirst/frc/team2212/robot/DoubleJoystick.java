package org.usfirst.frc.team2212.robot;

import edu.wpi.first.wpilibj.Joystick;

public class DoubleJoystick {

	public enum Hand {
		LEFT, RIGHT
	}

	private Joystick primary, secondary;
	private Hand primaryHand;

	public DoubleJoystick(Hand primaryHand, int primaryPort, int secondaryPort) {
		this.primaryHand = primaryHand;
		primary = new Joystick(primaryPort);
		secondary = new Joystick(secondaryPort);
	}

	private Joystick choose(Hand hand) {
		return hand == primaryHand ? primary : secondary;
	}

	public double getX() {
		return getX(primaryHand);
	}

	public double getX(Hand hand) {
		return choose(hand).getX();
	}

	public double getY() {
		return getY(primaryHand);
	}

	public double getY(Hand hand) {
		return choose(hand).getY();
	}

	public double getZ(Hand hand) {
		return choose(hand).getZ();
	}

	public double getTwist(Hand hand) {
		return choose(hand).getTwist();
	}

	public double getThrottle(Hand hand) {
		return choose(hand).getThrottle();
	}

	public boolean getTrigger(Hand hand) {
		return choose(hand).getTrigger();
	}

	public boolean getTop(Hand hand) {
		return choose(hand).getTop();
	}

	public boolean getBumper(Hand hand) {
		return choose(hand).getBumper();
	}

	public boolean getRawButton(Hand hand, int button) {
		return choose(hand).getRawButton(button);
	}

	public int getPOV(Hand hand, int pov) {
		return choose(hand).getPOV(pov);
	}

}
