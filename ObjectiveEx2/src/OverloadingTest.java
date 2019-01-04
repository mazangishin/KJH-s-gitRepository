import java.util.Scanner;

public class OverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
		MyCalc mc = new MyCalc();
//		
//		int result = 0;
//		
//		result = mc.add(3, 5);
//		System.out.println(result);
//		
//		result = mc.add(3, 5);
//		System.out.println(result);		
//				
		int[] numArr = new int[4];
		long result = 0;
		int num = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.println("숫자를 입력해주세요");
			num = scan.nextInt();
			numArr[i] = num;
		}
		
		
		result = mc.add(numArr);
		System.out.println(result);
	}
}
