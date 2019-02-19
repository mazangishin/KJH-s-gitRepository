package product;

public class RecTv extends Tv {

	boolean rec = false;

	public RecTv() {

	}

	public void turnRec() {

		if (rec == false) {
			this.rec = true;
		} else if (rec == true) {
			this.rec = false;
		}

	}

	public void showTvInfo() {

		System.out.println("텔레비전 상태보기");
		System.out.println("전원: " + power);
		System.out.println("볼륨: " + volume);
		System.out.println("녹화 상태: " + rec);
	}

}