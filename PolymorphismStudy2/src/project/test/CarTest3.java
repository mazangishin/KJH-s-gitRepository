package project.test;

import project.car.Ambulance;
import project.car.Car;
import project.car.FireEngine;

public class CarTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FireEngine fe = new FireEngine();
		
		if (fe instanceof FireEngine) {
			System.out.println("이것은 FireEngine 객체다");
		}
		
		if (fe instanceof Car) {
			System.out.println("이것은 Car 객체다");
		}
		
		if (fe instanceof Object) {
			System.out.println("이것은 Object 객체다");
		}
		
		FireEngine fe2 = fe;
		Car c = fe;
		Object o = fe;
		
	}

}
