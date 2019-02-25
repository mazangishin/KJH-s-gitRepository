
public class TvTest3 {
//	기능 - 실행
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 표현식 클래스명 변수명 ; 클래스의 객체를 참조하기 위한 참조변수를 선언 클래스변수명 = new 클래스명(); 클래스의 객체를 생성 후,
		 * 객체의 주소를 참조변수에 저장
		 * 
		 */
		Tv myTv = new Tv();
		Tv partnerTv = new Tv();
		Tv ksTv = new Tv();

		myTv.power = true;
		myTv.channel = 1;

		partnerTv.power = true;
		partnerTv.channel = 7;

		ksTv.power = false;
		ksTv.channel = 24;

		System.out.println("myTv 전원 " + myTv.power);
		System.out.println("myTv 채널은 " + myTv.channel);
		System.out.println();


		System.out.println("partnerTv 전원 " + partnerTv.power);
		System.out.println("partnerTv 채널은 " + partnerTv.channel);
		System.out.println();

		System.out.println("ksTv 전원 " + ksTv.power);

	}

}
