package org.usfirst.frc.team2212.subsystems;

import edu.wpi.first.wpilibj.Talon;

public class Gearbox {
	Talon front, rear;

	public Gearbox(Talon front, Talon rear) {
		this.front = front;
		this.rear = rear;
	}

	public Gearbox(int frontPort, int rearPort) {
		this(new Talon(frontPort), new Talon(rearPort));

	}

	public void forward(double speed) {
		front.set(speed);
		rear.set(speed);
	}
}