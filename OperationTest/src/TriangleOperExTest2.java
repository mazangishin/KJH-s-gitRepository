import java.util.Scanner;

public class TriangleOperExTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		사용자의 키보드 입력을 받는다, 숫자만.
//		1이면 양수 -1이면 음수 0이면 0 이라고 출력이 되는  프로그램을 만드시오.
	
		
		
		Scanner scan = new Scanner(System.in);
		
		String str = "";
		
		int x = 1567;
		
		
		
		
		System.out.println("0 또는 -1 또는 1을 입력해주세요.");
		x = scan.nextInt();
		System.out.println();
		
		
		
		str = (x >= 1) ? "양수" : (x <= -1) ? "음수" : "0";
		
		System.out.println(str);
		
		
		
		
		
		
		
	}

}
