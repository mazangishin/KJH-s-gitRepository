import java.util.Scanner;

public class TimeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time t = new Time();

		Scanner scan = new Scanner(System.in);
		int hour = 0;
		int minute = 0;
		int second = 0;
//		int cnt = 0;

		/*
		  while (true) { cnt++;
		  
		  System.out.println("1~24 사이의 시간을 입력해주세요."); hour = scan.nextInt();
		  
		  t.setHour(hour);
		  
		  if (!(t.hour < 1 || t.hour > 24)) { break; }
		  
		  System.out.println("총 수행 횟수: " + cnt);
		 
		  }
		 */
		
		t.setHour(22);
		hour = t.getHour();
		System.out.print(hour + "시 ");
		t.setMinute(54);
		minute = t.getMinute();
		System.out.print(minute + "분 ");
		t.setSecond(34);
		second = t.getSecond();
		System.out.print(second + "초 ");

	}

}
