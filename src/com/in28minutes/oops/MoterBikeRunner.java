package com.in28minutes.oops;

public class MoterBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();

		ducati.start();
		honda.start();

		ducati.setSpeed(100);

		ducati.increaseSpeed(100);

		honda.increaseSpeed(100);

		ducati.decreaseSpeed(50);

		honda.decreaseSpeed(50);

//		캡슐화 2단계 중복되는 로직을 축소하고 객체에 행할 수 있는 다양한 연산을 고안함.
//		아래 복잡하고 반복되는 로직들을 캡슐화를 통하여 위와 같이 효율적으로 만들 수 있음.
//		그런데 만약 증감 메서드로 인해 수정된 데이터가 초기 유효성 검사를 벗어난다면?

		ducati.decreaseSpeed(200);

////		get ducati speed
//		int ducatiSpeed = ducati.getSpeed();
////		increase it by 100
//		ducatiSpeed = ducatiSpeed + 100;
////		set it to ducati speed
//		ducati.setSpeed(ducatiSpeed);
//
//		int hondaSpeed = honda.getSpeed();
//		hondaSpeed = hondaSpeed + 100;
//		honda.setSpeed(hondaSpeed);

//		int ducatiSpeed = ducati.getSpeed();
//		ducatiSpeed = ducatiSpeed - 50;
//		ducati.setSpeed(ducatiSpeed);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

//		honda.setSpeed(80);
//		System.out.println(honda.getSpeed());
	}

}
