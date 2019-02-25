package tg.exam;

import java.util.Scanner;

public class ExamMainOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1번 문제 정사각형 모양을 출력하기 - 사용자의 숫자 입력에 따라 높이와 넓이가 같은 정사각형을 출력
		
		
		Scanner scan = new Scanner(System.in);
		
		int input = 0;			// 스캔으로 입력을 받을 변수 선언
		String str = "";		// 출력 결과1에 들어갈 스트링
		String str2 = "";		// 출력 결과2에 들어갈 스트링
		str = "*";				// 출력 결과1
		str2 = "?";				// 출력 결과2
		
		System.out.println("정사각형의 길이를 입력해주세요");	// 입력 전의 출력 문구
		
		input = scan.nextInt();		// 변수 입력
		
				
		for (int i = 1; i <= input; i++) {			// 정사각형의 세로줄

			for (int n = 0; n < i; n++) {			// 정사각형의 가로줄 중 *의 개수 조절

				System.out.print(str);				// 정사각형의 가로줄에 *을 출력

			}
			
			for (int j = 0; j < (input - i); j++) {	// 정사각형의 가로줄 중 ?의 개수 조절

				System.out.print(str2);				// 정사각형의 가로줄에 ?을 출력
				
			}
			
			System.out.println();					// 세로열 내림
		}
		
		
	}

}
