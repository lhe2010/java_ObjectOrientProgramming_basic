// 2020-10-31 토 자습 16:36-16:50 
package step6_02.method;

import java.util.Scanner;

//# 틱택토

class TicTacToe{
	
	Scanner scan = new Scanner(System.in);
	
	String[][] game = new String[3][3];
	
	int turn = 1;		// 1이 X, 2가 O
	int win = 0;		// 1[turn1승리] 2[turn2승리]
	
	void setGame() {
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[0].length; j++) {
				this.game[i][j] = " ";
			}
		}
	}
	
	void showGame() {
		System.out.println("===틱택토===");
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game.length; j++) {
				System.out.printf("[%s]", game[i][j]);
			}
			System.out.println();
		}
	}

	void choiceIdx() {
		int choice;
		while(true) {
			this.showGame();
			System.out.printf("%dp차례 선택 : ", this.turn);
			choice = scan.nextInt();
			if(game[choice/3][choice%3] == " ") {
				// 선택가능
				if(turn == 1) {
					game[choice/3][choice%3] = "X";
					turn = 2;
				} else if(turn == 2) {
					game[choice/3][choice%3] = "O";
					turn = 1;
				}
			} else {
				// 선택불가능한 자리 
				System.out.println("!! Invalid Index !!");
				continue;
			}
		}
		
	}
	
	void exitWidth() {
		for (int i = 0; i < game.length; i++) {
			if(game[i][0].equals(game[i][1]) && game[i][0].equals(game[i][2])) {
				if(game[i][0] == "X") win = 1;
				else win = 2;
			}
		}
	}
	
	void exitHeight() {
		for (int i = 0; i < game.length; i++) {
			if(game[i][0].equals(game[i][1]) && game[i][0].equals(game[i][2])) {
				if(game[i][0] == "X") win = 1;
				else win = 2;
			}
		}
	}
	
	void exitCross() {
	}	
	
	void run() {
		this.setGame();
		while(win == 0) {
			this.choiceIdx();
		}
		System.out.println("게임종료 ");
	}
}

public class MethodEx16_테스트정답 {

	public static void main(String[] args) {
		
		TicTacToe tic = new TicTacToe();
		tic.run();
	}

}