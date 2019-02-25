package project.test;

import project.car.Ambulance;
import project.car.Car;
import project.car.FireEngine;

public class CarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.door = 2;
		System.out.println("fe.door: " + fe.door);
		
		car = fe;
		System.out.println("car.foor: " + car.door);
		
		car.door = 4;
		fe2 = (FireEngine)car;
		System.out.println("fe.door: " + fe2.door);
		System.out.println("한바퀴 돌고 온 fe.door: " + fe.door);
		
	}

}
