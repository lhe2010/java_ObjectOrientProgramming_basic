// 2020-10-26 월 3교시 17:13-17:45
package step6_01.classObject;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예) 
 *  0 0 0 0 0 0 0 2 
 *  왼쪽(1) 오른쪽(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */

class Ex08{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
}

public class ClassEx08_정답 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ex08 g = new Ex08();
		
		int move = -1;
		int loc = -1;
		
		for (int i = 0; i < g.game.length; i++) {
			if(g.game[i] == 2)
				loc = i;
		}
		
		while(true) {
			System.out.println("\n" + Arrays.toString(g.game));
			System.out.print("캐릭터 이동(1왼쪽 2오른쪽 3격파) : ");
			move = scan.nextInt();
			if(move > 3 || move < 1) 
				System.out.println("!ERROR! 캐릭터 이동은 1/2/3 중에 선택해야합니다. ");
			
			// 올바른 입력
			if(move == 1) {
				if(loc == 0) {
					System.out.println("현재 왼쪽 끝에있으므로 반대편으로 이동");
					g.game[0] = 0;
					loc = g.game.length-1;
					g.game[loc] = 2;
				} 
				if(g.game[loc -1] == 1){
					System.out.println("벽을 만나서 이동 불가");
				} else {
					System.out.println("... 왼쪽으로 이동중 ...");
					g.game[loc--] = 0;
					g.game[loc] = 2;
				}
			} else if(move == 2) {
				if(loc+1 == g.game.length) {
					System.out.println("현재 오른쪽 끝에있으므로 반대편으로 이동");
					g.game[loc] = 0;
					loc = 0;
					g.game[loc] = 2;
				} 
				if(g.game[loc +1] == 1){
					System.out.println("벽을 만나서 이동 불가");
				} else {
					System.out.println("... 오른쪽으로 이동중 ...");
					g.game[loc++] = 0;
					g.game[loc] = 2;
				}
			} else if(move == 3) {
				if(g.game[loc-1] == 1) {
					// 왼쪽 벽격파
					System.out.println("...벽 격파중!");
					g.game[loc-1] = 0;
				} else if(g.game[loc+1] == 1) {
					// 오른쪽 벽격파
					System.out.println("...벽 격파중!");
					g.game[loc+1] = 0;
				} else {
					System.out.println("격파할 벽이 없는데요?!");
				}
			}
		}
		

	}

}
