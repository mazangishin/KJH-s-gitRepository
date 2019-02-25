
public class ExceptionEx1Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 100을 0 ~10 까지의 랜덤한 수로 10번 나누는 프로그램을 작성하시오

		int num = 100;
		int randomNum = 0;
		int resultNum = 0;

		try {
			for (int i = 0; i < 10; i++) {
				randomNum = (int) ((Math.random() * 11));
				resultNum = num / randomNum;
				System.out.println((i + 1) + "번째 수행: " + num + " / " 
				+ randomNum + " = " + resultNum);
			}
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("오류로 인해 예외처리 되었습니다.");
			System.out.println("수행 결과: " + num + " / " 
					+ randomNum + " = " + resultNum);
		} catch (RuntimeException re) {
			System.out.println("오류로 인해 예외처리 되었습니다.");
			System.out.println("수행 결과: " + num + " / " 
					+ randomNum + " = " + resultNum);
		}

	}

}
