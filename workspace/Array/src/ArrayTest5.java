public class ArrayTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//치환치환
		int genNum = 0;
		int rndNum = 0;
		int tempNum = 0;
		
		genNum = 10;
		rndNum = 20;
		
		tempNum = genNum;
		genNum = rndNum;
		rndNum = tempNum;
		
		System.out.println("genNum의 값은 " + genNum);
		System.out.println("rndNum의 값은 " + rndNum);
		System.out.println("tempNum의 값은 " + tempNum);
		
		
	}

}
