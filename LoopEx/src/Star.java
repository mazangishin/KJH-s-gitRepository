
public class Star {

	public static void main(String[] args) {

		String str = "";
		str = " ";
		

		for (int i = 0; i < 5; i++) {
			if (i == 0 || i == 5) {

				System.out.print("*");

			} else {

				System.out.print(str);

			}

			for (int n = 0; n < 5; n++) {

				if (n == 0 || n == 5) {

					System.out.print("*");

				} else {

					System.out.print(str);

				}
			}
			
			System.out.println();
		}

	}

}
