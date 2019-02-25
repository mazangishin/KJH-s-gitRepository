
public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Time koreaTime = new Time();
		Time americanTime = new Time();
				
		koreaTime.hour = 5;
		koreaTime.min = 26;
		koreaTime.sec = 31;
		
		americanTime.hour = 3;
		americanTime.min = 26;
		americanTime.sec = 31;
		
		
		System.out.println("한국시간 : " + "시 " + koreaTime.hour + " 분 "
				+ koreaTime.min + " 초 " + koreaTime.sec);
		
		System.out.println();
		
		System.out.println("미국시간 : " + "시 " + americanTime.hour + " 분 "
				+ americanTime.min + " 초 " + americanTime.sec);
		
		System.out.println();
		
		
		
	}

}
