
public class TeamProject {

	void multiplyType1() {
		int result = 0;
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				result = i * j;
				System.out.print(i + " * " + j + " = " + result + "\t");
			}
			System.out.println();
		}

	}

	void multiplyType2() {
		int result = 0;
		for (int i = 1; i <= 9 ; i++) {
			for (int j = 2; j <= 9; j++) {
				result = i * j;
				System.out.print(j + " * " + i + " = " + result + "\t");
			}

			System.out.println();
		}

	}
}
