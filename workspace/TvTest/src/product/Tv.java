package product;

public class Tv {

	boolean power = false;
	int volume = 0;

	public Tv () {
		
	}
	
	public void turnTv () {
		
		if (power == false) {
			this.power = true;
		}else if (power == true) {
			this.power = false;
		}
		
	}
	
	public void volumeUp () {
		
		this.volume++;
	}
	
	public void volumeDown () {
		
		this.volume--;
	}
	
	public void showTvInfo () {
		
		System.out.println("텔레비전 상태보기");
		System.out.println("전원: " + power);
		System.out.println("볼륨: " + volume);
		
	}
}
