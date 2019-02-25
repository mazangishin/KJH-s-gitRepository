package tg.exam.three;

public class GugudanService {

	public void showGugudan(int gugu) {			// 숫자를 입력하면 그 숫자의 단을 출력하는 메서드

		System.out.println("    " + gugu + "단");	// 메세지 출력

		for (int i = 1; i <= 9; i++) {			// 구구단을 출력하는 for문

			System.out.println(gugu + " * " + i + " = " + (gugu * i));

		}

	}

	public void showGugudan(int gugu, int gugu2) {	// 숫자 2개를 입력할 수 있는 오버로딩 메서드

		if (gugu <= gugu2) {		// 뒤에 입력된 숫자가 더 크거나 같다면
			for (int i = gugu; i <= gugu2; i++) {	// 1번째 숫자 이상 2번째 숫자 이하의 단을  
													// 출력한다는 메세지
				System.out.print("    " + i + "단\t\t");

			}

			System.out.println();	// 줄바꿈
			for (int n = 1; n <= 9; n++) {			// // 1번째 숫자 이상 2번째 숫자 이하의 단을  
				
				for (int i = gugu; i <= gugu2; i++) {	// 출력하는 for문
					
					System.out.print(i + " * " + n + " = " + (i * n) + "\t");

				}

				System.out.println();	//줄바꿈

			}

		} else {	// 2번째 숫자가 1번째 숫자보다 작을 때
					// 메세지를 출력
			System.out.println("처음 숫자가 마지막 숫자보다 클 수 없습니다.");

		}

	}

}
