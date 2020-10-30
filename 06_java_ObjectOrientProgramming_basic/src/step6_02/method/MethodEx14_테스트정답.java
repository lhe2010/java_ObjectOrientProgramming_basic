// 2020-10-30 금 3교시 17:30-17:37
package step6_02.method;

import java.util.Scanner;

/*
 * # 숫자 이동하기 : 클래스 + 메서드
 * 1. 숫자 8은 캐릭터이다.
 * 2. 숫자 1을 입력하면, 캐릭터가 왼쪽으로 이동한다.
 * 3. 숫자 2를 입력하면, 캐릭터가 오른쪽으로이동한다.
 * 4. 좌우 끝에 도달했을 때 에러가 발생하지 않도록 예외처리를 해준다.
 */

class NumberGame{
	
	Scanner scan = new Scanner(System.in);

	int[] move = {0, 0, 0, 0, 8, 0, 0, 0, 0, 0};
	int player = 4; // player의 위치
	
	void printPlay() {
		for (int i = 0; i < move.length; i++) {
			if(move[i] == 0) 	System.out.print("□ ");
			else 				System.out.print("▲ ");
		}
		System.out.println();
	}
	
	void showMenu() {
		System.out.println("[ 숫자 이동하기 게임 ] ");
		System.out.println(" [1] 왼쪽으로 이동");
		System.out.println(" [2] 오른쪽으로 이동");
		System.out.println(" [3] 종료");
	}
	
	void moveLeft() {
		if(this.player == 0) {
			// 맨끝인경우 
			System.out.println("맨끝이라 이동불가!");
			return;
		}
		move[player--] = 0;
		move[player] = 1;
	}

	void moveRight() {
		if(this.player == this.move.length-1) {
			// 맨끝인경우 
			System.out.println("맨끝이라 이동불가!");
			return;
		}
		move[player++] = 0;
		move[player] = 1;
	}
	
	void run() {
		while(true) {
			showMenu();
			printPlay();
			System.out.print("...이동 방향 : ");
			int choice = scan.nextInt();
			if(choice == 1) {
				moveLeft();
			} else if(choice == 2) {
				moveRight();
			} else if(choice == 3) {
				break;
			} else
				continue;			
		}
			
		
		
	}
}

public class MethodEx14_테스트정답 {

	public static void main(String[] args) {
		
		NumberGame g = new NumberGame();
		g.run();
	}
}
