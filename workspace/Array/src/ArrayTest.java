
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] num = new int[5];
		int pat = 0;
				
		for (int i = 0; i < 5; i++) {
			
			num[i] = i + 1;
			
			System.out.println(num[i]);
		}
				
		System.out.println();
				
		while (pat < 5) {
			
			num[pat] = pat + 1;
			
			System.out.println(num[pat]);
			
			pat++;	
			
		}
		
		
	}

}
