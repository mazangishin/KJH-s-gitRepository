
public class ArrayEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 최대값과 최소값
		int max = 0;
		int min = 0;
		int[] scoreArr = {
				79, 88, 91, 33, 100, 55, 95
		};
		
		max = scoreArr[0];
		min = scoreArr[0];
				
		for (int i = 0; i < scoreArr.length; i++) {
			if (scoreArr[i] > max) {
				max = scoreArr[i];
			}else if (scoreArr[i] < min){
				min = scoreArr[i];
			}
		}
		
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
		

	}

}