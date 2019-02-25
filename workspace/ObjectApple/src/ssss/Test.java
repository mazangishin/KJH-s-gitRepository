package ssss;

import human.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human h1 = new Human();
		
		h1.age = 1;
		h1.name = "이상한 사람";
		h1.appleColor = "빨간색";
		h1.appleName = "사과";
		
		Human2 h2 = new Human2();
		
		h2.name = "일반 사람";
		h2.age = 2;
		h2.apple = new Apple();
		h2.apple.name = "나만의 특별한 사과";
		
		System.out.println(h2.apple.name);
		
		
	}

}
