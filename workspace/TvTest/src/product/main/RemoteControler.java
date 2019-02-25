package product.main;

import product.*;

public class RemoteControler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RecTv recTv = new RecTv();
		
		recTv.turnTv();
		
		for (int i = 0; i < 11; i++) {
			recTv.volumeUp();
		}
		
		recTv.turnRec();
		recTv.turnRec();
		recTv.showTvInfo();
		
		
	}

}
