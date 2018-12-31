
public class ArrayEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		2차원 배열
		
//		int형 타입 4행 3열의 2차원 배열을 생성한다.
		
		int[][] scoreArr = new int[4][3];
		
		scoreArr[0][0] = 1;
		scoreArr[3][2] = 12;
		
		System.out.println(scoreArr[0][0]);
		System.out.println(scoreArr[1][1]);
		System.out.println(scoreArr[3][2]);
		System.out.println();
		
		for (int i = 0; i < 4; i++) {
			
			for (int n = 0; n < 3; n++) {
			
				System.out.print("[" + scoreArr[i][n] + "]");
				
			}
			
			System.out.println();
			
		}
		
		
		
	}

}
