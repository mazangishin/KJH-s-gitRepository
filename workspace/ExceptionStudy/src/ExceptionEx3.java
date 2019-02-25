public class ExceptionEx3 {
	public static void main(String[] args) {

		try {
//			Exception e = new Exception("고의로 예외 발생시킴");
//			throw e;
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("에러 메세지: " + e.getMessage());
			e.printStackTrace();
		}

		System.out.println("프로그램이 정상 종료되었습니다.");
	}
}