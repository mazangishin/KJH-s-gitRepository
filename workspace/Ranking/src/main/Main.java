package main;

import data.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentScore sScore = new StudentScore();
		StudentRank sRank = new StudentRank();
		
		sScore.setStudent1Info("1", "김준혁", "400", "100", "100", "100", "100");
		sScore.setStudent1Info("2", "김충현", "399", "99", "100", "100", "100");
		
		sScore.showStudent1Info();
		sRank.setIndexOfRank();
		sRank.getRank();
		
	}

}
