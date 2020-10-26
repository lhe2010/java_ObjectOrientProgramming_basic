// 2020-10-26 월 2교시 16:47-16:51
// 2020-10-26 월 3교시 17:03-17:13

package step6_01.classObject;
import java.util.Arrays;
import java.util.Scanner;
/*
 * # 영화관 좌석예매 : 클래스 + 변수
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */


class Ex07 {
	int[] seat = new int[7];
	int money = 0;		// 매출액
	int bookCnt = 0;
}

public class ClassEx07_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ex07 theater = new Ex07();
		
		while (true) {
			
			System.out.println("\n[MEGA MOVIE]");
			System.out.println("[1]좌석예매");
			System.out.println("[2]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			int idx;
			
			if		(sel == 1) {
				System.out.println("\n...[좌석예매페이지]");
				while(true) {
					System.out.println("현재 좌석 상태\t= "+ Arrays.toString(theater.seat));
					System.out.print("\n좌석선택 : ");
					idx = scan.nextInt();
					
					if(theater.seat[idx] == 0) {
						System.out.println("...예약진행중");
						theater.seat[idx] = 1;
						theater.bookCnt++;
						theater.money += 12000;
						System.out.println("현재 좌석 상태\t= "+ Arrays.toString(theater.seat));
						break;
					} else if(theater.seat[idx] == 1) {
						System.out.println("[ERROR] 이미 예약된 좌석입니다. ");
					}
				}
			}
			else if (sel == 2) {
				System.out.println("---------------------------");
				System.out.print("매출액 : " + theater.money);
				break;
			}
		}
	}
}