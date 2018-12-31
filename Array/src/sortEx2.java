
public class sortEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scoreArr = new int[5];

		scoreArr[0] = 15;
		scoreArr[1] = 11;
		scoreArr[2] = 1;
		scoreArr[3] = 3;
		scoreArr[4] = 8;

		System.out.println();
		System.out.println("오름차순으로 정렬");
		System.out.println();
		
		int temp = 0;

		for (int i = 0; i < scoreArr.length - 1; i++) {
			for (int n = 0; n < scoreArr.length - 1 - i; n++) {
				if (scoreArr[n] > scoreArr[n+1]) {
					temp = scoreArr[n];
					scoreArr[n] = scoreArr[n+1];
					scoreArr[n+1] = temp;
					
				}
			}
		}

		
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print(scoreArr[i] + " ");
			
		}
		
		
		
	}

}
