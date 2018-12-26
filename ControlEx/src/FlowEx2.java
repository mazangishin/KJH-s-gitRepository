
public class FlowEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		int score = 0;
		
		
		if (score >= 60) {
			
			System.out.println("합격입니다.");
			System.out.println();
			System.out.println("축하합니다.");
			System.out.println();
			
		}
		
		// if문 다음에 {}(블럭)으로 범위를 지정하지 않는다면 그 다음에 오는 한 줄만 if문으로 인식한다.
		// 이 경우에 score의 값이 60 미만이 된다면 합격입니다.는 출력되지 않고 축하합니다.만 출력된다.
		
		if (score == 60) {		
			System.out.println("아슬아슬하셨네요.");
			
		}
		
		
		
	}

}
