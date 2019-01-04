import java.util.Scanner;

public class MaxFindTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaxFind mf = new MaxFind();
		Scanner scan = new Scanner(System.in);

		int num = 0;
		int num2 = 0;
		int result = 0;
		
		System.out.println("num의 값을 입력하시오");
		num = scan.nextInt();
		System.out.println("num2의 값을 입력하시오");
		num2 = scan.nextInt();

		
		result = mf.compare(num, num2);
		System.out.println(result + " 가 더 큽니다");
		
		

	}

}
