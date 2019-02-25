import java.util.Scanner;

public class MyCalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		MyCalculator calc = new MyCalculator();

		double x = 0;
		double y = 0;
		double result = 0;
		
		
		System.out.println("덧셈 항목입니다");
		System.out.println("x의 값을 입력하세요");
		x = scan.nextDouble();
		System.out.println("y의 값을 입력하세요");
		y = scan.nextDouble();
		
		result = calc.add(x, y);
		System.out.println("x와 y의 값을 더한 결과는 " + result + "입니다");
		System.out.println();
		System.out.println();
		
		
		System.out.println("뺄셈 항목입니다");
		System.out.println("x의 값을 력하세요");
		x = scan.nextDouble();
		System.out.println("y의 값을 입력하세요");
		y = scan.nextDouble();
		
		result = calc.sub(x, y);
		System.out.println("x와 y의 값을 뺀 결과는 " + result + "입니다");
		System.out.println();
		System.out.println();

		
		System.out.println("나눗셈 항목입니다");
		System.out.println("x의 값을 입력하세요");
		x = scan.nextDouble();
		System.out.println("y의 값을 입력하세요");
		y = scan.nextDouble();
		
		result = calc.div(x, y);
		System.out.println("x와 y의 값을 나눈 결과는 " + result + "입니다");
		System.out.println();
		System.out.println();
		
		
		System.out.println("곱셈 항목입니다");
		System.out.println("x의 값을 입력하세요");
		x = scan.nextDouble();
		System.out.println("y의 값을 입력하세요");
		y = scan.nextDouble();
		
		result = calc.mul(x, y);
		System.out.println("x와 y의 값을 곱한 결과는 " + result + "입니다");
		System.out.println();
		System.out.println();
		
		
		
	}

}
