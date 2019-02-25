
public class FlowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 방문자 수 체크 처음 방문이면 "처음 오셨군요. 방문해주셔서 감사합니다." 처음 방문이 아니면 "다시 방문해주셔서 감사합니다."
		 * 
		 * 어떤 상황이어도 출력되야함 방문회수가 1번이면 "방문회수는 1번 입니다."
		 * 
		 */

		// 코드 정렬 : ctrl + shift + f

		int visitCount = 0;
		int visitCount2 = visitCount + 1;

		if (visitCount == 0) {

			System.out.println("처음 오셨군요. 방문해주셔서 감사합니다.");
			
		}

		visitCount = 3;

		if (visitCount > 0) {

			System.out.println("다시 방문해주셔서 감사합니다.");

		}

		System.out.println("방문회수는 " + visitCount2 + " 입니다.");
		System.out.println();
		
		
	}

}
