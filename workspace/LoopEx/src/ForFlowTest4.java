import java.util.Scanner;

public class ForFlowTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		String input = "";

		Scanner scan = new Scanner(System.in);

		while (num <= 2) {

			System.out.println("내용을 입력해주세요");
			System.out.println();

			input = scan.nextLine();
			
			System.out.println(input);
			System.out.println();
			
			num++;
						
		}

		System.out.println("프로그램을 종료합니다");
	
	
		num = 4;
		
		while (num >= 0) {
			
			System.out.println(num + " - I can do it");
			
			num--;
			
		}
	
	
	}

}
