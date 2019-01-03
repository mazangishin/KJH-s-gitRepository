import java.util.Scanner;

public class GugudanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Gugudan ggd = new Gugudan();
		int x = 0;

		System.out.println("숫자를 입력하세요");
		x = scan.nextInt();
		ggd.mul(x);

		ggd.mul();
		
		
	}

}
