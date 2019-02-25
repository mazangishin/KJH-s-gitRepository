import java.util.Scanner;

public class ForFlowTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		홀짝 판별 프로그램
		사용자의 입력을 받는다.
		숫자만 들어가고 0이라고 넣으면 짝수 1이라고 넣으면 홀수 2라고 넣으면 짝수 총 3번 수행을 한다.
		결과출력
		
		홀짝 게임 시작
		숫자를 입력하세요
		2
		
		2는 짝수입니다

		숫자를 입력하세요
		0
		
		0은 짝수입니다
		
		숫자를 입력하세요
		11
		
		11은 홀수입니다

*/
		
		
		System.out.println("홀짝 게임 시작");
		
		
		Scanner scan = new Scanner(System.in);
		int value = 0;
		String str = "";
				
		
		for (int i = 0; i <= 2; i++) {
			
			System.out.println("숫자를 입력하세요");
						
			value = scan.nextInt();
			
			if (value % 2 == 0) {
				str = "짝수";
			}
			else if (value % 2 != 0){ 
				str = "홀수";
			}
			System.out.println();
			System.out.println(value + "는 " + str + "입니다.");
			System.out.println();
			
		}
		
		
	}

}
