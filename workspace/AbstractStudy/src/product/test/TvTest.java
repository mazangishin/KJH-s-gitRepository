package product.test;

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MuteTv muteTv = new MuteTv();
		
		muteTv.power();
		
		for (int i = 0; i < 10; i++) {
			muteTv.volumeUp();
		}
		for (int i = 0; i < 5; i++) {
			muteTv.channelUp();
		}
		
//		muteTv.turnMuteButton();
//		muteTv.showTvInfo();
//		System.out.println(muteTv.toString());
		System.out.println(muteTv);		
		
	}

}
