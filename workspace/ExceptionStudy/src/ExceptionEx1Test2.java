
public class ExceptionEx1Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// null 포인터 예외를 발생시키는데
		// 문제가 발생하였습니다. 
		// 예외 메시지 : 예외 메세지를 출력하시오
		// ex:) 문제가 발생하였습니다. / zero
		
		
		System.out.println(1);
		System.out.println(2);
		
		String nullStr = null;
		
		try {
			nullStr.charAt(2);
		} catch (NullPointerException e) {
			System.out.println("문제가 발생하였습니다.");
			System.out.println("예외 메시지 : /" + e.getMessage());
			 e.printStackTrace();
//		} catch (ArithmeticException e) {
//			System.out.println("문제가 발생하였습니다.");
//			System.out.println("예외 메시지 : /" + e.getMessage());
//		} catch (Exception e) {
//			System.out.println("문제가 발생하였습니다.");
//			System.out.println("예외 메시지 : /" + e.getMessage());
		}
		
		System.out.println("종료");
		

	}

}
