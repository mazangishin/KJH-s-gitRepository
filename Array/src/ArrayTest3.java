public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArr = new int[5];
		int[] numArr2 = new int[10];
		
		numArr[0] = 123;
		numArr[1] = 5633;
		numArr[2] = 643;
		numArr[3] = 395;
		numArr[4] = 12;
		
		
		for (int i = 0; i < numArr.length; i++) {
			numArr2[i] = numArr[i];
			System.out.println("numArr 배열의 "+ i + "번째 값: " + numArr[i]);
		}
		
		System.out.println();
		System.out.println("============================");
		System.out.println();
		
		for (int i = 0; i < numArr2.length; i++) {
			if (i < 5) {
				System.out.println("numArr2 배열의 "+ i + "번째 값: " + numArr2[i]);
			}else{	
				numArr2[i] = i;
				System.out.println("numArr2 배열의 "+ i + "번째 값: " + numArr2[i]);
			}
		}
		
		
		
	}

}
