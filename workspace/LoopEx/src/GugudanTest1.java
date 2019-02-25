import java.util.Scanner;

public class GugudanTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int dan = 0;
		
		
		for (int i = 0; i <= 2; i++) {

			System.out.println("숫자를 입력하세요");
			System.out.println();
			
			dan = scan.nextInt();
			
			System.out.println(dan + "단");
			System.out.println();
			
			for (int j = 1; j <= 9; j++) {

				if (j % 2 != 0) {
					
					System.out.println(dan + " * " + j + " = " + (dan * j));

				} else if (j % 2 == 0) {

				}
			}
			
			System.out.println();
			System.out.println(dan + "단 끝");
			System.out.println();
			
		}

		System.out.println("실행 끝");
		
	}

}
