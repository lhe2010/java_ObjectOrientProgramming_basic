// 2020-10-29 목 3교시 17:00-17:40 (프린트 꼬인것 제외하고 해결완료)
// 2020-11-04 수 1교시 15:41-15:46 (프린트 꼬인 부분 해결)
package step6_01.classObject;

import java.util.Scanner;

/*
 * # 사다리 게임
 * 1. 0을 만나면 아래로 내려간다.
 * 2. 1일 때에는 좌우를 검사해 1인 쪽으로 이동 후 아래로 내려간다.
 * 3. x의 위치를 입력받고 사다리를 표현한다.
 * 		x = 0	x = 4
 * 		x = 1	x = 2
 * 		x = 2	x = 1
 * 		x = 3	x = 3
 * 		x = 4	x = 0
 */


class Ex14{public Ex14() {
}
	int ladder[][]= {
			{0,0,0,0,0},
			{1,1,0,1,1},
			{0,1,1,0,0},
			{0,0,1,1,0},
			{1,1,0,0,0},
			{0,1,1,0,0},
			{1,1,0,0,0},
			{0,0,0,1,1},
			{0,0,0,0,0}};
	
	int x = 0; int y = 0;
	String[] menu = {"죠스떡볶이", "CU편의점", "마라탕", "김밥천국", "명인만두"};
	
	void printLadder() {
		for (int i = 0; i < ladder.length; i++) {
			for (int j = 0; j < ladder[0].length; j++) {
				int temp = ladder[i][j];
				System.out.print(" " + temp);
//				if( temp == 0) 		;
//				else if(temp == 1) 	System.out.print("├");
			}
			System.out.println();
		}
		for (int i = 0; i < ladder.length; i++) { 			// 행
			for (int j = 0; j < ladder[0].length; j++) {	// 열
				int temp = ladder[i][j];
				if(temp == 0) {
					System.out.print(" ┃");
					continue;
				} 
				if(j == 0) 	{					// 양쪽 맨 끝인경우 
					System.out.print(" ┣");
					continue;
				} else if(j == ladder.length-1)	{
					System.out.print("━┫");
					continue;
				}
				
				if(this.ladder[i][j-1] == 1) { 			// 왼쪽 1
					System.out.print("━┫");
				} else if( this.ladder[i][j+1] == 1) { 	// 오른쪽 1
					System.out.print(" ┣");
				}
			}
			System.out.println();
		}
	}
	
	int playLadder(int start) {
		if(start < 0 || start > ladder[0].length ) return -1;
		int y = 0;		// 행
		int x = start; 	// 열	
		while(y != this.ladder.length) {
//			System.out.printf("this.ladder[%d][%d] = %d\n",y,x, this.ladder[y][x]);
			if(this.ladder[y][x] == 0) {
				y++;
				continue;
			} 
			// 1인경우 양옆 검사 후 이동
			if(x == 0) 	{					// 양쪽 맨 끝인경우 
				x++; y++; continue;
			} else if(x == ladder.length-1)	{
				x--; y++; continue;
			}
		
			if(this.ladder[y][x-1] == 1) { 			// 왼쪽 1
				x--; y++;
			} else if( this.ladder[y][x+1] == 1) { 	// 오른쪽 1
				x++; y++;
			}
		}
//		System.out.println("맨 끝까지 내려왔으며 (x,y) end 인덱스는 "+ x);
		return x;
	}
	
	
}

public class ClassEx14_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Ex14 g = new Ex14();
		g.printLadder();
		System.out.print("시작할 인덱스를 입력하세요 : ");
		System.out.println("사다리 게임의 결과는 " + g.menu[g.playLadder(scan.nextInt())]);
		

	}

}
