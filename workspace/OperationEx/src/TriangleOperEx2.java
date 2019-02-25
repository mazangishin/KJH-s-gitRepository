import java.util.Scanner;

public class TriangleOperEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 삼항 연산자
		표현식
		
		ex : 변수 = (조건식) ? 식1 : 식2
		*/
		
		
		int x = 0;
		
		
		
		System.out.println("숫자를 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		
		int absX = (x >= 0) ? x : -x; // true:false -> asbX = x;
		
		
		System.out.println("x가 "+ x + "일 때 x의 절대값은 " + absX);
		
		
		
		
	}

}
