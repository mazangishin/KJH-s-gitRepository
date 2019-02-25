
public class VarEx2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int num1 = 400;
			int num2 = 300;
			int num3 = 200;
			int blank = 0;
		
			System.out.println("num1:" + num1 + " num2:" + num2 + " num3:" + num3);
			System.out.println();
			
			blank = num1;
			num1 = num2;
			num2 = blank;
			
			System.out.println("num1:" + num1 + " num2:" + num2 + " num3:" + num3);
			System.out.println();
			
			blank = num2;
			num2 = num3;
			num3 = blank;
			
			System.out.println("num1:" + num1 + " num2:" + num2 + " num3:" + num3);
			System.out.println();
			
			blank = num1;
			num1 = num2;
			num2 = blank;
			
			System.out.println("num1:" + num1 + " num2:" + num2 + " num3:" + num3);
			System.out.println();
			
			
			
	}

}
