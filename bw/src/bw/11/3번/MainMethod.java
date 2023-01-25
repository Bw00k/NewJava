package homeWork06_03;

import java.util.Scanner;

public class MainMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int startGame = (int) (Math.random() * 2) + 1; // 1과2만 나옴

		Keypad game = null;

		// 50% 확률로 두개의 게임중 하나가 셋팅
		if (startGame == 1) {
			game = new RPGgame();
		} else if (startGame == 2) {
			game = new ArcadeGame();
		}
		
		while (true) {
			System.out.println("============================================================================================");
			System.out.println("<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
			System.out.println("============================================================================================");
			
			System.out.print("choice>>");
			int choiceNo = Integer.parseInt(sc.nextLine());
			
			if(choiceNo == 1) {
				
				game.leftUpButton();
				
			}else if(choiceNo == 2) {
				
				game.leftDownButton();
				
			}else if(choiceNo == 3) {
				
				game.rightUpButton();
				
			}else if(choiceNo == 4) {
				
				game.rightDownButton();
				
			}else if(choiceNo == 5) {
				
				game.changeMode();
				
			}else if(choiceNo == 0) {
				// 게임체인지
				if(startGame == 1) {
					game = new ArcadeGame();
				}else if(startGame == 2) {
					game = new RPGgame();
				}
			}else if(choiceNo == 9) {
				
				System.out.println("EXIT");
				break;
				
			}
		}
	}
}
