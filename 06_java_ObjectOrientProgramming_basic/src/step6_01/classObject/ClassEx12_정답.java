// 2020-10-27 화 자습 22:00-22:47
// 2020-10-28 수 1교시 15:03-15:20
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
		int idx4print = 0;
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[0].length; j++) {
//				if(game[i][j] == null) 	System.out.print("[ ]");
				if(game[i][j] == null) 	System.out.printf("[%d]", idx4print);
				else 					System.out.printf("[%s]", game[i][j]);
				idx4print++;
			}
			System.out.println();
		}
	}
	
	void startGame(int turnStart) {
		turn = turnStart;
		Scanner scan = new Scanner(System.in);
		while(this.checkWinner() == 0) {
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
			}
			// turn교체
			if(turn == 1) 	turn = 2;
			else 			turn = 1;	
		}
		// 승자가 결정됨
		print();
		System.out.println("system: winner is p"+ win);
	}
	
	int checkWinner() {
		// 가로 체크
		for (int i = 0; i < game.length; i++) {
			// 가로체크
			if((game[i][0] != null && game[i][0].equals(game[i][1]) && game[i][0].equals(game[i][2]))) {
				if(game[i][0] == "X") 	this.win = 1;
				else 					this.win = 2;
				return this.win;
			}
			// 세로체크
			if((game[0][i] != null && game[0][i].equals(game[1][i]) && game[0][i].equals(game[2][i]))) {
				if(game[0][i] == "X") 	this.win = 1;
				else 					this.win = 2;
				return this.win;
			}
		}
		// 대각선 체크
		if((game[0][0] != null && game[0][0].equals(game[1][1]) && game[0][0].equals(game[2][2]))
				|| (game[2][0] != null && game[2][0].equals(game[1][1]) && game[2][0].equals(game[0][2]))){
			if(game[0][0] == "X") 	this.win = 1;
			else 					this.win = 2;
			return this.win;
		}
		return 0;
	}
	
}

public class ClassEx12_정답 {
	
	public static void main(String[] args) {
			
		Ex12 g = new Ex12();
		g.startGame(1);		

	}
}
