package com.in28minutes.oops;

public class MoterBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();

		ducati.start();
		honda.start();

		ducati.setSpeed(100);
		honda.setSpeed(80);

		ducati.setSpeed(20);
		honda.setSpeed(0);

	}

}
