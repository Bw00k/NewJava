package com.yedam.java.day0117_3;

public class Main {

	public static void main(String[] args) {
		PlayGame pg = new PlayGame();
		pg.random();
		pg.game();
		while (true) {
			pg.menu();
			pg.gamePlay();
			if (pg.choice == 9) {
				break;
			}
		}
	}
}
