
public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CaptionTv ctv = new CaptionTv();
		
		ctv.power();
		
		ctv.channel = 10;
		ctv.channelUp();
		
		System.out.println(ctv.channel);
		
		
		ctv.displayCaption("채널 " + ctv.channel);
		ctv.caption = true;
		ctv.displayCaption("영화의 줄거리는...");
		
		
		
		
	}

}
