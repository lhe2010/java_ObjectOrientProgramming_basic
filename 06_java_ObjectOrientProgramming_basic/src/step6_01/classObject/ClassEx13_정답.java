// 2020-10-27 화 자습 21:24-22:00
package step6_01.classObject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* 
 * # 1 to 50[3단계] : 1 to 18
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */


class Ex13{
	
	Random ran = new Random();
	final int SIZE = 9;
	
	int[] front = new int[SIZE];
	int[] back  = new int[SIZE];
	
	int cnt = 1;
	
	void initNmix() {
		// init
		for (int i = 0; i < SIZE; i++) {
			front[i] = i+1;
			back[i] = SIZE+1+i;
		}
//		System.out.println(Arrays.toString(front));
//		System.out.println(Arrays.toString(back));

		// mix
		int temp;
		for (int i = 0; i < 100; i++) {
			int nRand = ran.nextInt(SIZE-1)+1;
			temp = front[0];
			front[0] = front[nRand];
			front[nRand] = temp;
			
			nRand = ran.nextInt(SIZE-1)+1;
			temp = back[0];
			back[0] = back[nRand];
			back[nRand] = temp;
		}
//		System.out.println(Arrays.toString(front));
//		System.out.println(Arrays.toString(back));
	}
	
	void start(int arg1) {
		System.out.println("arg1=" + arg1);
		System.out.println("cnt=" + cnt);
		if(front[arg1] == cnt) {
			if(cnt <= SIZE) 	front[arg1] = back[arg1];
			else				front[arg1] = 0;
			
			cnt++;
		} else {
			System.out.println("wrong answer!");
		}
	}
	
	void printGame() {
		for (int i = 0; i < front.length; i++) {
			if(i%3 == 0) System.out.print("\n");
			if(front[i] == 0)		System.out.print("  X  ");
			else					System.out.printf("  %d  ", front[i]);
		}
		System.out.println();
	}
}



public class ClassEx13_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ex13 g = new Ex13();
		int num;
		
		g.initNmix();
		
		while(true) {
			g.printGame();
			System.out.print("\n인덱스 : ");
			num = scan.nextInt();
			if(g.cnt == 18) {
				g.printGame();
				System.out.println("GOOD JOB!");
				break;
			}
			
			if(num < 0 || num >= g.SIZE) {
				System.out.println("system: invalid index");
				continue;
			} 
			g.start(num);
		}
	}

}
