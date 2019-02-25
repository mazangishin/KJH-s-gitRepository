package data;

public class StudentRank extends StudentScore {

	private String[] rankingArr = new String[12];
	private String[] nameArr = new String[12];

	public StudentRank() {

	}

	public void putData() {

		rankingArr[0] = studentArr1[1];
		rankingArr[1] = studentArr2[1];
		rankingArr[2] = studentArr3[1];
		rankingArr[3] = studentArr4[1];
		rankingArr[4] = studentArr5[1];
		rankingArr[5] = studentArr6[1];
		rankingArr[6] = studentArr7[1];
		rankingArr[7] = studentArr8[1];
		rankingArr[8] = studentArr9[1];
		rankingArr[9] = studentArr10[1];
		rankingArr[10] = studentArr11[1];
		rankingArr[11] = studentArr12[1];
		rankingArr[12] = studentArr13[1];

		nameArr[0] = studentArr1[2];
		nameArr[1] = studentArr2[2];
		nameArr[2] = studentArr3[2];
		nameArr[3] = studentArr4[2];
		nameArr[4] = studentArr5[2];
		nameArr[5] = studentArr6[2];
		nameArr[6] = studentArr7[2];
		nameArr[7] = studentArr8[2];
		nameArr[8] = studentArr9[2];
		nameArr[9] = studentArr10[2];
		nameArr[10] = studentArr11[2];
		nameArr[11] = studentArr12[2];
		nameArr[12] = studentArr13[2];

		System.out.println("자료 입력 완료");
	}

	public void setIndexOfRank() {

		for (int i = 0; i < rankingArr.length; i++) {
			String temp = "";
			for (int j = i + 1; j < rankingArr.length; j++) {
				int valueOfI = Integer.parseInt(rankingArr[i].toString());
				int valueOfJ = Integer.parseInt(rankingArr[j].toString());
				if (valueOfI < valueOfJ) {
					temp = rankingArr[i];
					rankingArr[i] = rankingArr[j];
					rankingArr[j] = temp;
					temp = nameArr[i];
					nameArr[i] = nameArr[j];
					nameArr[j] = temp;
				}
			}
		}
	}

	public void getRank() {
		for (int i = 0; i < rankingArr.length; i++) {
			System.out.println(i + "등은 " + rankingArr[i] 
					+ "점을 기록한" + nameArr[i] + "님입니다.");
		}
	}
}