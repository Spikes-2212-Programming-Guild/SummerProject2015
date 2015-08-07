package org.usfirst.frc.team2212.subsystems;

import edu.wpi.first.wpilibj.Talon;

public class DoubleTalon {
	private Talon front, rear;

	public DoubleTalon(int frontPort, int rearPort) {
		front = new Talon(frontPort);
		rear = new Talon(rearPort);
	}

	public void set(double speed) {
		front.set(speed);
		rear.set(speed);
	}
}