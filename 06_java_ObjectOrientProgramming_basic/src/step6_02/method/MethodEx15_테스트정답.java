// 2020-10-31 토 자습 16:22-16:34 
package step6_02.method;

import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 메서드
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */

class MemoryGame{
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	
	int cnt = 0;		// 정답을 맞춘 횟수
	
	void shuffle() {
		for (int i = 0; i < 100; i++) {
			int idx = ran.nextInt(10);
			int temp = front[0];
			front[0] = front[idx];
			front[idx] = temp;
		}
	}
	
	void printCard() {
		for (int i = 0; i < back.length; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 0; i < front.length; i++) {
			if(back[i] == 0) {
				switch (front[i]) {
				case 1: 
					System.out.print("♤︎");
					break;
				case 2:
					System.out.print("♧︎");
					break;
				case 3: 
					System.out.print("♡︎");
					break;
				case 4:
					System.out.print("♢︎");
					break;
				case 5: 
					System.out.print("⭐︎");
					break;
				}
				System.out.print(" ");
			} else {
				System.out.print("[ ]");
			}
		}
		System.out.println();
	}
	
	void choiceCard() {
		System.out.print("같은 모양인 카드의 인덱스를 입력하세요: ");
		int c1 = scan.nextInt();
		int c2 = scan.nextInt();
		if(this.front[c1] == this.front[c2]) {
			System.out.println("정답!");
			this.back[c1] = 1;
			this.back[c2] = 1;
			this.cnt++;
		} else {
			System.out.println("땡!");
		}		
	}
	
	void run() {
		this.shuffle();
		while(this.cnt < 5) {
			printCard();
			choiceCard();
		}
		System.out.println("[게임종료] ");
	}
}

public class MethodEx15_테스트정답 {

	public static void main(String[] args) {
		MemoryGame mg = new MemoryGame();
		mg.run();
	}
}
