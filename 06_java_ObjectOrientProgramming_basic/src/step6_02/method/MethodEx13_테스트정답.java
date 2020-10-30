// 2020-10-30 금 1교시 15:40-15:50
// 2020-10-30 금 2교시 16:00-16:18

package step6_02.method;

import java.util.Scanner;

/*
 * # 영화관 좌석예매 : 클래스 + 메서드
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

class Theater{
	
	Scanner scan = new Scanner(System.in);

	int[] seat = new int[10];
	
	String name = "";				// 영화관 이름
	int cnt = 0;					// 예매 수
	int money = 0;					// 매출액
	
	
	void showMenu() { 	// ...메뉴 선택해서 입력받는것을 showMenu에서 받아서 초이스를 리턴해줄것인가
						// 아니면 run()에서 할것인가?  
		System.out.printf("\n[ %s 영화예매 시스템 ]\n", this.name);
		System.out.println("[1] 영화예매");
		System.out.println("[2] 총 매출 출력");
	}
	
	void showSeat() {
		for (int i = 0; i < seat.length; i++) {
			if(i == 0) System.out.print("잔여자리현황 = ");
			if(seat[i] == 0)	System.out.print("O ");	// 예매 가능
			else 				System.out.print("X "); // 예매 불가
			if(i == seat.length-1) System.out.print("\n");
		}
	}
	
	void choiceSeat() {
		int sChoice;
		
		while(true) {
			System.out.print("...자리선택(인덱스) : ");
			sChoice = scan.nextInt();
			
			// 올바르지 않은 인덱스 들어옴
			if(!(sChoice >= 0 && sChoice < seat.length)) 
				continue;
			// 올바른인덱스 들어옴
			if(this.seat[sChoice] == 1) { // 예매 불가능 
				System.out.print("예매불가능합니다. \n");
				continue;
			}
			// 예매할 수 있는 자리
			// ****** 그냥 매번 else를 하는것이랑 continue를 사용해서 매번 끊어주는거... 어떤게 나은가.????
			if(this.seat[sChoice] == 0) {
				seat[sChoice] = 1;
				this.cnt++;
				this.showSeat();
				break;
			}
		}
	}

	void showSales() {
		this.money = this.cnt * 12000;
		System.out.println(this.name + "의 총 매출");
		System.out.printf("총 %d개의 표가 팔렸으며, 총 매출은 %d원 입니다. \n", cnt, money);
	}
	
	void run() {
		while(true) {
			showMenu();
			System.out.print("...메뉴선택 : ");
			int choice = scan.nextInt();
			if(choice != 1 && choice != 2)
				continue;
			if( choice == 1) {
				showSeat();
				choiceSeat();
			} else if( choice == 2) {
				showSales();		
				break;				
			}			
		}
	}
}

public class MethodEx13_테스트정답 {

	public static void main(String[] args) {
		
		Theater mb = new Theater();
		mb.name = "메가박스";
		mb.run();		
	}
}
