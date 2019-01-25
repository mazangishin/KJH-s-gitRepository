package LottoMachine;

import LottoMachine.*;

public class Round {

	CreateLotto lotto1 = new CreateLotto();
	CreateLotto2 lotto2 = new CreateLotto2();
	CreateLotto3 lotto3 = new CreateLotto3();
	CreateLotto4 lotto4 = new CreateLotto4();
	CreateLotto5 lotto5 = new CreateLotto5();

	public void createAsRound(int round) {

		if (round < 1) {
			System.out.println("1 이상의 수를 입력해주세요.");
			return;

		} else if (round < 5) {

			System.out.println("5 이하의 수를 입력해주세요.");
			return;

		} else if (round == 5) {

		} else if (round == 4) {

		} else if (round == 3) {

		} else if (round == 2) {

		} else if (round == 1) {

		}
	}
}
