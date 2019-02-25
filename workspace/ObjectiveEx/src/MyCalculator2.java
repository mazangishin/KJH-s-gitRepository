
public class MyCalculator2 {

	int sum(int x) {
		int result = 0;
		for (int i = 1; i <= x; i++) {
			result = i + result;
		}
		return result;
	}
	
	void sum (int x, int y) {
		int result = 0;
		result = x + y;
		
		System.out.println("void sum(int x, int y)를 호출 : ");
		System.out.println();
	}
	
	
}
