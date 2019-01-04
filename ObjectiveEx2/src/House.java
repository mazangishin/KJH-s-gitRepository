
public class House {

	int window = 0;
	int door = 0;
	int room = 0;

	public House() {

	}

	public House(int cusWindow) {
		window = cusWindow;
	}

	public House(int cusWindow, int cusDoor) {
		window = cusWindow;
		door = cusDoor;
	}

	public House(int cusWindow, int cusDoor, int cusRoom) {
		window = cusWindow;
		door = cusDoor;
		room = cusRoom;
	}

	void info() {
		if (window > 0) {
			System.out.print(" 창문  " + window);
		}
		if (door > 0) {
			System.out.print(" 문  " + door);
		}
		if (room > 0) {
			System.out.print(" 방  " + room);
		}

		System.out.println(" 개인 집이 지어졌습니다.");
	}

}
