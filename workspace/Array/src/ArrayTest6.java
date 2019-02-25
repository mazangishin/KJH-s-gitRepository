import java.util.Scanner;

public class ArrayTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int[] numArr = new int[5];
		int temp = 0;
		int rndNum = 0;

		for (int i = 0; i < numArr.length; i++) {
			System.out.println(i + "번째 숫자를 입력하세요");
			numArr[i] = scan.nextInt();
		}
//		이 for문은 입력을 담당한다.
		
		for (int i = 0; i < numArr.length; i++) {

			rndNum = (int) (Math.random() * numArr.length);
			temp = numArr[i];
			numArr[i] = numArr[rndNum];
			numArr[rndNum] = temp;
		}
//		이 for문은 랜덤으로 섞는다.
//		A => C, B => A, C => B
		
		System.out.println();
		System.out.println("숫자를 섞는 중");
		System.out.println();

		for (int i = 0; i < numArr.length; i++) {

			System.out.print(numArr[i] + " ");
		}
//		이 for문은 출력을 담당한다.
		
	}
}