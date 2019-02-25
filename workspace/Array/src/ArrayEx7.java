
public class ArrayEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 총합과 평균
		
/*		관련있는 정수들의 변수
		scoreArr[0] = 성적 국어
		scoreArr[1] = 성적 영어
		scoreArr[2] = 성적 수학
*/		
		
		// 국영수국코
		
		int[] scoreArr = { 100, 88, 100, 100, 90, 78, 56, 83 };
		int sum = 0;
		double ave = 0.0;
		
		
		for (int i = 0; i < scoreArr.length; i++) {
//			sum = sum + scoreArr[i];
			sum+= scoreArr[i];
		}
		
						
		ave = (int)((sum / (double)scoreArr.length) * 1000.0) / 1000.0 ;
		
		System.out.println();
		
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + ave); //소수점 셋째자리에서 내림
		System.out.println();
	}

}
