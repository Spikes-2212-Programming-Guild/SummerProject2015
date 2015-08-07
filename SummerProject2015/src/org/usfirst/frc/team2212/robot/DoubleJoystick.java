package org.usfirst.frc.team2212.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;

public class DoubleJoystick extends GenericHID {

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

	@Override
	public double getX(Hand hand) {
		return choose(hand).getX();
	}

	@Override
	public double getY(Hand hand) {
		return choose(hand).getY();
	}

	@Override
	public double getZ(Hand hand) {
		return choose(hand).getZ();
	}

	@Override
	public double getTwist() {
		return primary.getTwist();
	}

	@Override
	public double getThrottle() {
		return primary.getThrottle();
	}

	@Override
	public double getRawAxis(int which) {
		return primary.getRawAxis(which);
	}

	@Override
	public boolean getTrigger(Hand hand) {
		return choose(hand).getTrigger();
	}

	@Override
	public boolean getTop(Hand hand) {
		return choose(hand).getTop();
	}

	@Override
	public boolean getBumper(Hand hand) {
		return choose(hand).getBumper();
	}

	@Override
	public boolean getRawButton(int button) {
		int primaryCount = primary.getButtonCount();
		return button < primaryCount ? primary.getRawButton(button) : secondary
				.getRawButton(button - primaryCount);
	}

	@Override
	public int getPOV(int pov) {
		return primary.getPOV(pov);
	}

}
