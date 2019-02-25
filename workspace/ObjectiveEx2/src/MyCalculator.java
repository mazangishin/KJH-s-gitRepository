
/*		클래스 메서드와 인스턴스 메서드		
  		1. 클래스를 설계할 때, 멤버 변수 중 모든 인스턴스에 공통적으로 사용해야 하는 것에 스태틱(static)을 붙인다.
 		2. 클래스 변수는 인스턴스를 생성하지 않아도 사용할 수 있다.
 		3. 클래스 매서드는 인스턴스 변수를 사용할 수 없다.
 		4. 메서드 내에서 인스턴스 변수를 사용하지 않는다면, static을 붙이는 것을 고려한다.
*/

public class MyCalculator {

	int[] calArr = new int[10];

	int add(int x, int y) {
		int result = x + y;
		return result;
	}

	double add(double x, double y) {
		double result = x + y;
		return result;
	}

	double add(double x, int y) {
		double result = x + y;
		return result;
	}

	double add(int x, double y) {
		double result = x + y;
		return result;
	}

	int mul(int x, int y) {
		int result = x * y;
		return result;
	}

	double mul(double x, double y) {
		double result = x * y;
		return result;
	}

	double mul(double x, int y) {
		double result = x * y;
		return result;
	}

	double mul(int x, double y) {
		double result = x * y;
		return result;
	}

	int div(int x, int y) {
		int result = x / y;
		return result;
	}

	double div(double x, double y) {
		double result = x / y;
		return result;
	}

	double div(double x, int y) {
		double result = x / y;
		return result;
	}

	double div(int x, double y) {
		double result = x / y;
		return result;
	}

	int sub(int x, int y) {
		int result = x - y;
		return result;
	}

	double sub(double x, double y) {
		double result = x - y;
		return result;
	}

	double sub(int x, double y) {
		double result = x - y;
		return result;
	}

	double sub(double x, int y) {
		double result = x - y;
		return result;
	}

	void sum (int[] calArr) {
		int result = 0;
		for (int i = 0; i < calArr.length; i++) {
			result = i + calArr[i];
		}
		
		return;
	}
	
}
