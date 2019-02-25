/*		오버로딩 vs 오버라이딩
 * 		오버로딩 : 기존에 없는 새로운 메서드를 정의하는 것 (new)
 *		오버라이딩 : 상속받은 메서드의 내용을 변경하는 것(change, modify) 
 */

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv tv = new Tv();
		CaptionTv ctv = new CaptionTv();
		
		tv.power();
		tv.channelUp();
		tv.tvInfo();
	
		
		
		ctv.power();
		ctv.channelUp();
		ctv.channelUp();
		ctv.tvInfo();
		
		
		
	}

}
