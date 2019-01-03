
public class OverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCalc mc = new MyCalc();
		
		int result = 0;
		
		result = mc.add(3, 5);
		System.out.println(result);
		
		result = mc.add(3, 5);
		System.out.println(result);		
				
		
	}

}
