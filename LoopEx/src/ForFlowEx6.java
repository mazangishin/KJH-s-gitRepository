import java.util.Scanner;

public class ForFlowEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 업다운게임

		int input = 0;
		int answer = 0;
		Scanner scan = new Scanner(System.in);

		// 1 ~ 100 사이의 임의의 수를 저장

		answer = (int) (Math.random() * 100) + 1;

		while (true) {

			System.out.println("1과 100 사이의 숫자를 입력하세요>>");
			input = scan.nextInt();

			if (input > answer) {
			
				System.out.println("더 작은 수를 입력해주세요");
				System.out.println();
			
			} else if (input < answer) {

				System.out.println("더 큰 수를 입력해주세요");
				System.out.println();
	
			} else {

				System.out.println("정답은 " + answer);
				System.out.println("당첨입니다");
				System.out.println();
				break;

			}

		}

		System.out.println("게임종료");

	}

}
