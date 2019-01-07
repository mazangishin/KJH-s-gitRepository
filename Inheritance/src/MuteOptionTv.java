
public class MuteOptionTv extends Tv {

	boolean mute = false;
	int volume = 0;
	int mutedVolume = 0;

	void muteOption () {
		mute = !mute;
		if (mute == true) {
			mutedVolume = volume;
			volume = 0;
		} else {
			volume = mutedVolume;
		}
	}

	void volumeUp() {
		volume++;
	}

	void volumeDown() {
		volume--;
	}

	void tvInfo() {
		System.out.println("파워상태: " + power);
		System.out.println("채널 값: " + channel);
		System.out.println("볼륨 값: " + volume);
		System.out.println("음소거 상태: " + mute);
	}

}
