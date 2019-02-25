
public class Gugudan {

	void mul(int x) {
		int result = 0;
		for (int i = 1; i < 10; i++) {

			result = i * x;
			System.out.println(x + " * " + i + " = " + result);
		}
		System.out.println();
	}
	
	
	void mul() {
		int result = 0;
		for (int i = 2; i < 10; i++) {
			for (int n = 1; n <10; n++) {
				result = i * n;
				System.out.print(i + " * " + n + " = " + result + "\t");
			}
			System.out.println();
		}
		
		
	}

	
	
}
