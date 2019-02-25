import java.util.Scanner;

public class ExceptionEx2Test3 {
	public static void main(String[] args) {

		System.out.println("어서오세요");
		System.out.println("Welcome to");
		System.out.println("이랏샤이마세");

		System.out.println("무한 숫자 타자 연습");
		System.out.println();

		Scanner scan = new Scanner(System.in);
		int inputNum = 0;

		while (true) {
			try {
				System.out.println();
				System.out.println("숫자를 입력하세요");
				System.out.println("-999를 입력하면 프로그램이 종료됩니다.");
				inputNum = scan.nextInt();
				
				if (inputNum == -999) {
					break;
				}
			} catch (Exception e) {
				System.out.println();
				System.out.println("Warning! 숫자만 입력이 가능합니다.");
			}
			
			scan.nextLine();
			
		}
		
		System.out.println();
		System.out.print("***");
		System.out.print("프로그램을 종료합니다");
		System.out.print("***");
		
	}
}
