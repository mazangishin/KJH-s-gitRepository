package Shop;

public class LottoMachine {

	static int lottoPrice = 1000;
	
	public int[] lottoCreate(int playerMoney, int playTime, int[] lottoArr) {

		if (playerMoney <= 0) {

			System.out.println("사용자의 소지금이 부족합니다.");
			System.out.println("번호 생성을 종료합니다.");
			return null;

		} else if (playerMoney < (playTime * 1000)) {

			System.out.println("사용자의 소지금이 원하시는 구매 횟수보다 적습니다.");
			System.out.println("번호 생성을 종료합니다.");
			return null;

		} else if (playerMoney >= (playTime * 1000)) {

			for (int n = 0; n <= 5; n++) {

				lottoArr[n] = (int) (Math.random() * 45) + 1;

				for (int i = 0; i < n; i++) {

					if (lottoArr[n] == lottoArr[i]) {
						
						n--;
						break;
						
					}
				}					
			}

			for (int n = 6; n <= 11; n++) {

				lottoArr[n] = (int) (Math.random() * 45) + 1;

				for (int i = 0; i < n; i++) {

					if (lottoArr[n] == lottoArr[i]) {
						
						n--;
						break;
						
					}
				}	
			}

			for (int n = 12; n <= 17; n++) {

				lottoArr[n] = (int) (Math.random() * 45) + 1;

				for (int i = 0; i < n; i++) {

					if (lottoArr[n] == lottoArr[i]) {
						
						n--;
						break;
						
					}
				}
			}

			for (int n = 18; n <= 23; n++) {

				lottoArr[n] = (int) (Math.random() * 45) + 1;

				for (int i = 0; i < n; i++) {

					if (lottoArr[n] == lottoArr[i]) {
						
						n--;
						break;
						
					}
				}	
			}

			for (int n = 24; n <= 29; n++) {

				lottoArr[n] = (int) (Math.random() * 45) + 1;

				for (int i = 0; i < n; i++) {

					if (lottoArr[n] == lottoArr[i]) {
						
						n--;
						break;
						
					}
				}
			}
		}

		return lottoArr;

	}
	
	public int payment (int playerMoney, int playTime) {
		
		playerMoney = playerMoney - (lottoPrice * playTime);
		
		return playerMoney;
		
	}
	
}
