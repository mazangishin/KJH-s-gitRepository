package game;

import java.util.Scanner;

import game.player.Player;

public class Board {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String turn = ""; Scanner scan = new Scanner(System.in); turn =
		 * scan.nextLine();
		 */
		
		Player player = new Player("1번째 플레이어");
		
		player.playGame();
		
	}

}
