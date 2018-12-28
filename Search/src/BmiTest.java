import java.util.Scanner;

public class BmiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 몸무게 / (0.1키의 제곱)
		 * 
		 * 20미만 저체중 20~24 정상 25~30 경도 비만 30 이상 비만
		 */

		Scanner scan = new Scanner(System.in);

		double weight = 0;
		double height = 0;

		System.out.println("비만도 체크");
		System.out.println();
		System.out.println("체중은 얼마?");
		weight = scan.nextDouble();
		System.out.println("신장은 얼마?");
		height = scan.nextDouble() * 0.01;

		double bmi = weight / (height * height);

		System.out.println();
		System.out.println("당신의 bmi 지수 : " + bmi);
		System.out.println();

		if (bmi < 20) {
			System.out.println("당신은 저체중입니다");

		} else if (bmi < 25) {
			System.out.println("당신은 정상입니다");

		} else if (bmi <= 30) {
			System.out.println("당신은 경도 비만입니다");

		} else if (bmi > 30) {
			System.out.println("당신은 비만입니다");
		}

	}

}
