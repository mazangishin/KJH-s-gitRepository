package Shop;

public class LottoPrint {

	public void lottoInfo(int playerMoney, int playTime, int[] lottoArr) {

		if (playerMoney <= 0) {

			System.out.println("사용자의 소지금이 부족합니다.");
			System.out.println("사용자의 남은 소지금은 " + playerMoney + "원입니다.");
			return;

		} else if (playerMoney > 0) {

			System.out.println("사용자가 보유한 로또 번호는 다음과 같습니다.");
			
			if (playTime == 5) {

				for (int i = 0; i < lottoArr.length; i++) {
					
					if ((i+1) % 6 == 0) {

						System.out.print("[" + lottoArr[i] + "]\t");
						System.out.println();

					} else {

						System.out.print("[" + lottoArr[i] + "]\t");

					}
				}

				
				System.out.println();
				System.out.println("사용자의 남은 소지금은 " + playerMoney + "원입니다.");
				
			} else if (playTime == 4) {

				for (int i = 0; i < lottoArr.length - 6; i++) {
					
					if ((i+1) % 6 == 0) {

						System.out.print("[" + lottoArr[i] + "]\t");
						System.out.println();

					} else {

						System.out.print("[" + lottoArr[i] + "]\t");

					}
				}

				System.out.println();
				System.out.println("사용자의 남은 소지금은 " + playerMoney + "원입니다.");

			} else if (playTime == 3) {

				for (int i = 0; i < lottoArr.length - 12; i++) {
					
					if ((i+1) % 6 == 0) {

						System.out.print("[" + lottoArr[i] + "]\t");
						System.out.println();

					} else {

						System.out.print("[" + lottoArr[i] + "]\t");

					}
				}

				System.out.println();
				System.out.println("사용자의 남은 소지금은 " + playerMoney + "원입니다.");

			} else if (playTime == 2) {

				for (int i = 0; i < lottoArr.length - 18; i++) {
					
					if ((i+1) % 6 == 0) {

						System.out.print("[" + lottoArr[i] + "]\t");
						System.out.println();

					} else {

						System.out.print("[" + lottoArr[i] + "]\t");

					}
				}

				System.out.println();
				System.out.println("사용자의 남은 소지금은 " + playerMoney + "원입니다.");

			} else if (playTime == 1) {

				for (int i = 0; i < lottoArr.length - 24; i++) {
					
					if ((i+1) % 6 == 0) {

						System.out.print("[" + lottoArr[i] + "]\t");
						System.out.println();

					} else {

						System.out.print("[" + lottoArr[i] + "]\t");

					}
				}

				System.out.println();
				System.out.println("사용자의 남은 소지금은 " + playerMoney + "원입니다.");
					
				
			}			
		}
	}
}
