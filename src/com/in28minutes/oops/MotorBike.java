package com.in28minutes.oops;

public class MotorBike {
	private int speed;

//	Right Click > Source > Generate Getters and Setters ...
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	void start() {
		System.out.println("Bike Started");
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
//		데이터 유효성 검사의 중복 발생.
//		if (this.speed - howMuch > 0) {
//			this.speed = speed - howMuch;
//		}
		setSpeed(this.speed - howMuch);
//		setSpeed 메서드에 내장된 유효성 검사를 진행할 수 있음.
	}
}
