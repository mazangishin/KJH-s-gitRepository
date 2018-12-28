
public class ArrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArr = new int[5];
		int[] backUpNumArr = new int[5];
		int num = 0;
		int backUpNum = 0;

		num = 1;
		backUpNum = 1;
		System.out.println("원본 데이터: " + num);
		System.out.println("원본 데이터: " + backUpNum);

		num = 1000;
		System.out.println("원본 데이터: " + num);
		System.out.println("원본 데이터: " + backUpNum);

		System.out.println("================================");
		numArr[0] = 10;
		backUpNumArr = numArr;

		for (int i = 0; i < numArr.length; i++) {
			System.out.println("원본 데이터: " + numArr[i]);
		}
		
		System.out.println("=================================");
		
		for (int i = 0; i < backUpNumArr.length; i++) {
			System.out.println("백업 데이터: " + backUpNumArr[i]);
		}

		System.out.println("=================================");
		
		backUpNumArr[1] = 500;
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.println("원본 데이터: " + numArr[i]);
		}
		
		System.out.println("=================================");
		
		for (int i = 0; i < backUpNumArr.length; i++) {
			System.out.println("백업 데이터: " + backUpNumArr[i]);
		}

		// 복사

	}

}
