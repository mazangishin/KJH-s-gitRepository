
public class TvTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MuteOptionTv MuteOptionTv = new MuteOptionTv();

		
		for (int i = 0; i < 4; i++) {
			MuteOptionTv.volumeUp();
		}

		System.out.println(MuteOptionTv.volume);
		System.out.println();

		MuteOptionTv.muteOption();

		System.out.println(MuteOptionTv.volume);
		System.out.println();

		MuteOptionTv.muteOption();

		System.out.println(MuteOptionTv.volume);
		System.out.println();

		MuteOptionTv.power();
		MuteOptionTv.channelUp();

		MuteOptionTv.tvInfo();

	}

}
