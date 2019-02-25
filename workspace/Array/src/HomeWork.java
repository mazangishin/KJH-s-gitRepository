
public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] triArr = new int[8][9];

		for (int i = 0; i < triArr.length; i++) {
			for (int n = 0; n < triArr[0].length; n++) {

				triArr[i][n] = (i + 2) * (n + 1);

			}
		}

		for (int i = 0; i < triArr.length; i++) {
			for (int n = 0; n < triArr[0].length; n++) {

				System.out.print(triArr[i][n] + "\t");

			}

			System.out.println();

		}

		System.out.println();
		System.out.println();

		for (int i = 0; i < triArr[0].length; i++) {
			for (int n = 0; n < triArr.length; n++) {

				System.out.print((n + 2) + " * " + (i + 1) + " = " + triArr[n][i] + "\t");

			}

			System.out.println();
		}
	}

}
