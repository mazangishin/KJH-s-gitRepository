import java.util.Scanner;

public class FlowTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*		switch문으로 코드를 짰다면 if문으로 대부분 구현이 가능하지만 if문으로 짠 코드를 switch문으로 구현이 불가능 할 수도 있다.
 * 		if문은 범위로 지정하기 쉽다. switch문은 코드가 간단하다, 속도가 빠르다.
*/		
		Scanner scan = new Scanner(System.in);
				
		int season = 0;
		String str = "";
		
		System.out.println("1~12달 중 숫자를 입력하세요");	
		season = scan.nextInt();
		
		
		switch (season) {
		
		case 1: case 2: case 12:
			str = " 겨울입니다";
			break;
		
		case 3: case 4: case 5:
			str = " 봄입니다";
			break;
		
		case 6: case 7: case 8:
			str = " 여름입니다";
			break;
		
		case 9: case 10: case 11:
			str = " 가을입니다";
			break;
			
		default:
			str = " 존재하지 않습니다";
			break;
		}
		
		System.out.println();
		System.out.println(season + "월은" + str);
		
		
		
	}

}
