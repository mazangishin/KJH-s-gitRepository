package exce.test;

public class ExceptionEx4 {
	public static void main(String[] args) {

		OtherClass oc = new OtherClass();
		
		try {
			oc.method1();
		} catch (Exception e) {
			System.out.println("고생했어 여기서 끝내자");
			e.printStackTrace();
		}
		
		
	}
}