
public class Time {

	private int hour;
	private int minute;
	private int second;

	public void setHour(int hour) {
		if (hour < 0 || hour > 23) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		this.hour = hour;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		this.minute = minute;
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		this.second = second;
	}

//	public void setClock(int hour, int minute, int second) {
//		if (hour < 0 || hour > 23) {
//			System.out.println("잘못 입력하셨습니다.");
//			return;
//		}
//		this.hour = hour;
//		if (minute < 0 || minute > 59) {
//			System.out.println("잘못 입력하셨습니다.");
//			return;
//		}
//		this.minute = minute;
//		if (second < 0 || second > 59) {
//			System.out.println("잘못 입력하셨습니다.");
//			return;
//		}
//		this.second = second;
//		System.out.println(hour + "시 " + minute + "분 " + second + "초");
//	}

	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
}
