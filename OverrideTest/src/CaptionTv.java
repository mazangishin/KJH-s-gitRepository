
public class CaptionTv extends Tv {

	boolean caption = false;

	void displayCaption(String text) {

		if (caption == true) {

			System.out.println(text);

		}

	}

	void tvInfo () {
		System.out.println("자막 Tv");
		System.out.println("전원 상태: " + power);
		System.out.println("채널 값: " + channel);
		System.out.println("음소거상태: " + caption);
	}
	
	
	
}
