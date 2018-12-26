import java.util.Scanner;

public class FlowTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int score = 0;
		String str = "";
		
		
		System.out.println("점수를 입력해주세요.");
				
		score = scan.nextInt();
		
		
		
		if (score > 100) {
			System.out.println("100을 초과해서는 안됩니다");
		}else if (score >= 90) {
			str = "A";
		}else if (score >= 80){
			str = "B";
		}else if (score >= 70){
			str = "C";
		}else{ 
			str = "F";
		}

		System.out.println(str);
		
		
		
		
	}

}
