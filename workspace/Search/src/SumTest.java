
public class SumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			
			sum = sum + i;
	
			if (sum + i > 100) {
				break;
			}				
				
		}
		
		System.out.println(sum);

		
	}

}
