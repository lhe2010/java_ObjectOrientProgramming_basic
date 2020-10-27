// 2020-10-27 화 1교시 15:12-15:31
package step6_01.classObject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 변수
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */

/*
class Ex09{
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	int answerCnt = 0;		
}
*/
public class ClassEx09_정답 {

	public static void main(String[] args) {		
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		Ex09 g = new Ex09();
		
		// front 배열 카드 섞기
		int[] gFront = g.front;
		int temp, tempIdx;
		for (int i = 0; i < 100; i++) {
			tempIdx = ran.nextInt(10);
			temp = gFront[0];
			gFront[0] = gFront[tempIdx];
			gFront[tempIdx] = temp;
		}
		
		while(true) {
			// 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료
			if(g.answerCnt == 5) {
				break;
			}
			System.out.println("[ 인덱스 안내 ]");
			for (int i = 0; i < 10; i++) {
					System.out.printf(" %d ", i);
			}
			System.out.println();
			for (int i = 0; i < gFront.length; i++) {
				switch(gFront[i]) {
				case 1:
					System.out.print(" ■ ");
					break;
				case 2:
					System.out.print(" ◆ ");
					break;
				case 3:
					System.out.print(" ♥ ");
					break;
				case 4:
					System.out.print(" ♠ ");
					break;
				case 5:
					System.out.print(" ♣ ");
					break;
				}
			}
			System.out.println("\n" + Arrays.toString(g.back));
			
			// front배열에서 같은 카드를 골라 카드의 위치를 입력
			System.out.print("카드1의 인덱스 : ");
			int card1 = scan.nextInt();
			System.out.print("카드2의 인덱스 : ");
			int card2 = scan.nextInt();
			
			if(gFront[card1] == gFront[card2]) {
				// 선택한 두장의 카드가 같은 카드이면 back배열에 표시
				g.back[card1] = 1;
				g.back[card2] = 1;
				g.answerCnt++;
			}
		}
		scan.close();
		System.out.println("게임종료");

	}

}
