// 2020-10-27 화 자습 22:00-22:47
package step6_01.classObject;

import java.util.Scanner;

/* 
 * # 틱택토
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */

class Ex12{
	String[][] game = new String[3][3];	// p1이 X, p2가 O
	
	int turn = 0;
	int win = 0;	
	
	void print() {
		System.out.println("===틱택토===");
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[0].length; j++) {
				if(game[i][j] == null) 	System.out.print("[ ]");
				else 					System.out.printf("[%s]", game[i][j]);
			}
			System.out.println();
		}
	}
	
	void startGame(int turnStart) {
		turn = turnStart;
		Scanner scan = new Scanner(System.in);
		while(true) {
			if(this.checkWinner()!=0) break;
			print();
			System.out.printf("\n[p%d]인덱스입력 : ", turn);
			int choice = scan.nextInt();
			
			if(choice > 8) {
				System.out.println("system : invalid index");
				continue;
			} 
			// 올바른 입력 
			if(game[choice/3][choice%3] != null) {
				System.out.println("system : place already taken");
				continue;
			} else {
				game[choice/3][choice%3] = (turn == 1 ? "X":"O");
				// turn교체
				if(turn == 1) 	turn = 2;
				else 			turn = 1;	
			}
		}
		System.out.println("system: winner is p"+ win);
	}
	
	int checkWinner() {
		// 가로 체크
		for (int i = 0; i < game.length; i++) {
			// 가로체크 
			if(game[i][0] != null && game[i][1] != null && game[i][2] != null
					&& game[i][0].equals(game[i][1]) && game[i][0].equals(game[i][2])) {
				this.win = this.turn;
				return this.win;
			}
			// 세로체크 
			if(game[0][i] != null && game[1][i] != null && game[2][i] != null
					&& game[0][i].equals(game[1][i]) && game[i][0].equals(game[i][2])) {
				this.win = this.turn;
				return this.win;
			}
			
		}
	}
	
}

public class ClassEx12_정답 {
	
	public static void main(String[] args) {
			
		Ex12 g = new Ex12();
		g.startGame(1);		
		

	}
}
