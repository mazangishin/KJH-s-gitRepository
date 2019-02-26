
public interface Tv {

//	인터페이스
//	일종의 추상클래스이다.
//	인터페이스는 추상클래스처럼 추상메서드를 갖지만 추상클래스보다
//	추상화 정도가 높아서 추상클래스와 달리 몸통을 갖춘 일반 메서드
//	or 멤버변수를 구성원으로 가질 수 없다.
//	오직 추상메서드와 상수만을 멤버로 가질 수 있으며, 그 외의 다른 어떠한 요소도 허용하지 않는다.
//	일반적인 클래스의 멤버들과 다르다 
//	제약사항
//	- 모든 멤버변수는 public static final 이어야 하며, 이를 생략할 수 있다.
//	- 모든 메서드는 public abstract 여야 하며, 이를 생략할 수 있다.
//	단, static메서드와 디폴트 메서드는 예외(jdk 1.8부터 변경)
	
	public static final boolean power = false;
	final int CHANNEL = 0;
	static int VOLUME = 0;
	String NAME = "";
	
	public abstract void power();
	int getVolume();
	
	
	
}
