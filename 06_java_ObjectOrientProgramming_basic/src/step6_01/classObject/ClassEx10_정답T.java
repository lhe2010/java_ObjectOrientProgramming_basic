package step6_01.classObject;
/*
 * # 영수증 출력하기 : 클래스 + 변수
 * 1. 햄버거 주문을 받아 영수증을 출력한다.
 * 2. 출력내용은 각 메뉴의 주문 수량과 총 금액 및 잔돈을 표시한다.
 * 
 * 	맘스터치
 *----------------------
 *ITEM	QTY	AMT
 *치즈버거	1	2500
 *불고기버거	1	3800
 *감자튀김	1	1500
 *콜      라	1	1000
 *----------------------
 *합계금액		8800
 *받은금액		10000
 *----------------------
 *잔       돈		1200
 */

import java.util.Scanner;

class Ex10 {
	String name = "";		// 가게 이름
	
	int[] arPrice   = {    2500,       3800,     1500,  1000};
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜      라"};
	
	int[] arCount = new int[4];
	
	int total = 0;
}


public class ClassEx10_정답T {
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Ex10 e = new Ex10();
		
		e.name = "맘스터치";
		int size = e.arPrice.length;
		
		while (true) {
			
			System.out.println("    [" + e.name + " 햄버거]");
			for (int i=0; i<size; i++) {
				System.out.println((i+1) + "." + e.arMenu[i] + "\t" + e.arPrice[i] + "원");
			}
			System.out.println("----------------------");
			System.out.println("5.주문하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (1 <= sel && sel <= size) {
				sel--;
				e.arCount[sel]++;
			}
			else if (sel == 5) {
				
				for (int i=0; i<size; i++) {
					e.total += e.arPrice[i] * e.arCount[i];
				}

				System.out.print("총 금액은 " + e.total + "원 입니다.");
				System.out.print("돈을 입력하세요 : ");
				int money = scan.nextInt();
				
				if (money >= e.total) {
					
					int charge = money - e.total;
					
					System.out.println("\t맘스터치");
					System.out.println("----------------------");
					System.out.println("ITEM\tQTY\tAMT");
					for (int i=0; i<size; i++) {
						System.out.println(e.arMenu[i] + "\t" + e.arCount[i] + "\t" + (e.arPrice[i]*e.arCount[i]));
					}
					System.out.println("----------------------");
					System.out.println("합계금액\t\t" + e.total);
					System.out.println("받은금액\t\t" + money);
					System.out.println("----------------------");
					System.out.println("잔       돈\t\t" + charge);
					
				}
				else {
					System.out.println("돈이 부족합니다.");
				}
				
				break;
			}
		}	
		
		scan.close();
	}

}
