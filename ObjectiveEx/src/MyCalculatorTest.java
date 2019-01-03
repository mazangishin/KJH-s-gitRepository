import java.util.Scanner;

public class MyCalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCalculator2 myCalc = new MyCalculator2();
		Scanner scan = new Scanner(System.in);
	
		int x = 0;
		int y = 0;
		int result = 0;
		
		System.out.println("숫자를 입력해주세요");
		x = scan.nextInt();
		result = myCalc.sum(x);
		System.out.println("int sum(int x)를 호출 ");
		System.out.println(result);
		System.out.println();
		
		
		System.out.println("x의 값을 입력해주세요");
		x = scan.nextInt();
		System.out.println("y의 값을 입력해주세요");
		y = scan.nextInt();
		myCalc.sum(x, y);
		
		
		
		
		
		
	}

}
