
public class Tv {

	boolean power = false;
	boolean rec = false;
	int volume = 0;

	Tv () {
		
	}
	
	public void turnTv () {
		
		if (power == false) {
			this.power = true;
		}else if (power == true) {
			this.power = false;
		}
		
	}
	
	public void turnRec () {
		
		if (rec == false) {
			this.rec = true;
		}else if (rec == true) {
			this.rec = false;
		}
		
	}
	
	public void showTvInfo () {
		
		System.out.println("텔레비전 상태보기");
		System.out.println("전원: " + power);
		System.out.println("볼륨: " + volume);
		System.out.println("녹화 상태: " + rec);
	}
}
