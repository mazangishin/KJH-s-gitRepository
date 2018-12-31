import java.util.Scanner;

public class ArrayTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		2차원 배열
		
		int[][] scoreArr = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50},
			};
		
		
		for (int i = 0; i < 5; i++) {
			
			for (int n = 0; n < 3; n++) {
				
				System.out.print("[" + scoreArr[i][n] + "]");
			
			}
			
			System.out.println();
			
		}
		
		
		
		int[][] numArr = new int[4][3];
		
		int cnt = 1;
		
		System.out.println();
		System.out.println(scoreArr[0].length);
		System.out.println();
		
		for (int i = 0; i < numArr.length; i++) {
			
			for (int n = 0; n < numArr[0].length; n++) {
				
				numArr[i][n] = cnt++;
				
			}
		}
		
		
		for (int i = 0; i < 4; i++) {
			
			for (int n = 0; n < 3; n++) {
			
				System.out.print("[" + numArr[i][n] + "]");
				
			}
			
			System.out.println();
			
		}
		
		
	}
}