
public class GugudanV2 extends Gugudan {

	int dan = 0;
	
	void oneDanGuguPrint() {

		System.out.println(dan + "단");
		System.out.println();

		for (int i = 1; i <= 9; i++) {

			System.out.println(dan + "*" + i + "=" + (dan * i));

		}

		System.out.println();

	}

}
