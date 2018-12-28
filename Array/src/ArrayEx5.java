
public class ArrayEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArr = new int[5];
		int[] backUpNumArr = new int[5];
		numArr[0] = 10;
		backUpNumArr[0] = numArr[0];
		

		System.out.println("================================");
		numArr[0] = 10;
		backUpNumArr = numArr;

/*		for (int i = 0; i < numArr.length; i++) {
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
*/
		numArr[0] = 120;
		numArr[1] = 650;
		numArr[2] = 9670;
		numArr[3] = 230;
		numArr[4] = 231;
		
		
		for (int i = 0; i < numArr.length; i++) {
			backUpNumArr[i] = numArr[i];
			System.out.println("backUpNumArr의 각 값은 " + backUpNumArr[i] + " 이고 " + "numArr의 각 값은" + numArr[i] + " 이다");
			
		}
		
		
		
		
		
		
	}

}
