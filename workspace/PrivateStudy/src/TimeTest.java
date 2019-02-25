import java.util.Scanner;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time t = new Time();

		t.hour = 25;
		Scanner scan = new Scanner(System.in);
		int hour = 1;
		int minute = 1;
		int second = 1;
		int cnt = 0;

		while (true) {
			cnt++;

			System.out.println("1~24 사이의 시간을 입력해주세요.");
			hour = scan.nextInt();
			
			t.setHour(hour);

			if (!(t.hour < 1 || t.hour > 24)) {
				break;
			}

			System.out.println("총 수행 횟수: " + cnt);

		}
		
		
		

	}

}
