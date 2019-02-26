package product.test;

public class MuteTv extends Tv{

	private boolean mute = false;
	private int temp = 0;
	
	public MuteTv() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void power() {
		// TODO Auto-generated method stub
		if (power == false) {
			power = true;
//			System.out.println("전원을 켰습니다.");
//			System.out.println("power의 상태 :" + power);
//			System.out.println();
		}else if (power == true) {
			power = false;
//			System.out.println("전원을 껐습니다.");
//			System.out.println("power의 상태 :" + power);
//			System.out.println();
		}
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		channel++;
//		System.out.println("채널을 1개 올렸습니다.");
//		System.out.println("현재 채널 : " + channel);
//		System.out.println();
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		channel--;
//		System.out.println("채널을 1개 내렸습니다.");
//		System.out.println("현재 채널 : " + channel);
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		volume++;
//		System.out.println("볼륨을 한 단계 올렸습니다.");
//		System.out.println("현재 채널 : " + volume);
//		System.out.println();
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		volume--;
//		System.out.println("볼륨을 한 단계 내렸습니다.");
//		System.out.println("현재 채널 : " + volume);
//		System.out.println();
	}
	
	public void turnMuteButton () {
		if (mute == false) {
			mute = true;
			temp = volume;
			volume = 0;
//			System.out.println("음소거 상태가 되었습니다.");
//			System.out.println("mute의 상태 : " + mute);
//			System.out.println();
		}else if (mute == true) {
			mute = false;
			volume = temp;
//			System.out.println("음소거 기능이 꺼졌습니다.");
//			System.out.println("mute의 상태 : " + mute);
//			System.out.println();
		}
	}

//	public void showTvInfo () {
//		System.out.println("현재 power의 상태 : " + power);
//		System.out.println("현재 channel의 상태 : " + channel);
//		System.out.println("현재 volume의 상태 : " + volume);
//		System.out.println("현재 mute의 상태 : " + mute);
//	}

	@Override
	public String toString() {
		return "MuteTv [mute=" + mute + ", power=" + power + ", channel=" + channel + ", volume=" + volume + "]";
	}
}
