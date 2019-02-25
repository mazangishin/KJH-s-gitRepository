package LottoMachine;

import User.UserExecutive;

public class RandomMachine {

	UserExecutive userEx = new UserExecutive();
	
	int[] lottoArr = new int[6];

	public RandomMachine () {
		
	}
	
	public void drawLotto (int round, int money) {	// round 수 만큼 생성된 lotto 배열에 랜덤으로 설정된 값을 넣는다.

		if (money <= 0) {	// money가 0이하라면 lotto 배열에 숫자를 넣지 않고 끝이 난다.

			return;

		} else {	// money가 0이하가 아니라면 lotto 배열에 숫자를 넣는다.

			for (int i = 0; i < round; i++) {
				
				for (int n = 0; n < lottoArr.length; n++) {

					lottoArr[n] = (int)(Math.random() * 45 + 1);

				}
			}
		}
	}

	public void dealing(int money, int round) {	// round를 실행시킨 횟수 만큼 money를 감소시킨다.
		money = money - (round * 1000);

	}

	public void userInfo(String playerName, int money, int round) {	// 사용자가 가진 lotto 배열의 값과 money의 값을 출력시킨다.  

		System.out.println(playerName + "님은 현재 " + round + " 장의 복권을 가지고 계시며, 그 번호는 ");

		for (int i = 0; i < lottoArr.length; i++) {	// round 만큼 생성된 lotto 배열의 값을 출력한다.
			
			for (int n = 0; n < lottoArr.length; n++) {
				
			}
			if (i < lottoArr.length) {	// lotto 배열의 마지막 값이 아닌 경우  ,를 붙인다.

				System.out.print(lottoArr[i] + ", ");

			} else if (i >= lottoArr.length) {	// lotto 배열의 마지막 값이 아닌 경우  ,를 붙이지 않는다.

				System.out.print(lottoArr[i]);

			}
		}

		System.out.println("입니다.");
		System.out.println("또한, " + playerName + "님의 소지금은 현재 " + money + " 원입니다.");
		
	}

}
