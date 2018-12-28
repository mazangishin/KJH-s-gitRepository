import java.util.Scanner;

public class HomeWorkTestAccp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] numArr = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
//
//		for (int i = 0; i < numArr.length; i++) {
//
//			System.out.println(numArr[i]);
//
//		}

		Scanner scan = new Scanner(System.in);

		int input1 = 0;
		int input2 = 0;
		int input3 = 0;

		System.out.println("첫번째 정수 입력");
		input1 = scan.nextInt();
		System.out.println();

		System.out.println("두번째 정수 입력");
		input2 = scan.nextInt();
		System.out.println();

		System.out.println("세번째 정수 입력");
		input3 = scan.nextInt();
		System.out.println();

		if (input1 > input2 && input1 > input3) {
			System.out.println("3개의 정수 중 가장 큰수는 아래와 같습니다");
			System.out.println(input1);

		} else if (input2 > input1 && input2 > input3) {
			System.out.println("3개의 정수 중 가장 큰수는 아래와 같습니다");
			System.out.println(input2);
			
		} else if (input3 > input2 && input3 > input1) {
			System.out.println("3개의 정수 중 가장 큰수는 아래와 같습니다");
			System.out.println(input3);
			
		}

	}

}
