
public class CallStack {

	
	void firstMethod() {
		System.out.println("firstMethod() 시작됨");
		secondMethod();
		System.out.println("firstMethod() 종료됨");
	}
	
	void secondMethod() {
		System.out.println("secondMethod() 시작됨");
		System.out.println("System.out.println() 호출하고 종료");
		System.out.println("secondMethod() 종료됨");
	}
}
