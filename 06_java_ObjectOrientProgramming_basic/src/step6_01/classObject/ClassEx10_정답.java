// 2020-10-27 화 1교시 15:31-15:50
package step6_01.classObject;

import java.util.Scanner;

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

/*
class Ex10 {
	String name = "";		// 가게 이름
	
	int[] arPrice   = {    2500,       3800,     1500,  1000};
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜      라"};
	
	int[] arCount = new int[4];
	
	int total = 0;
}
*/

public class ClassEx10_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ex10 s = new Ex10();
		s.name = "맘스터치";
		int money;
		
		while(true) {
			System.out.println("\n" + s.name + "주문화면 - 메뉴안내\n[0] 주문완료 영수증 출력");
			for (int i = 0; i < s.arMenu.length; i++) {
				System.out.printf("[%d] %s\t: %d원\n", i+1, s.arMenu[i], s.arPrice[i]);
			}
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			if(sel < 0 || sel > s.arMenu.length) {
				System.out.println("유효한 메뉴 번호를 입력하세요");
				continue;
			} else if(sel > 0) {
				s.arCount[sel-1]++;
				s.total += s.arPrice[sel-1];
			} else if (sel == 0){
				while(true) {
					System.out.print("돈을 입력하세요: ");
					money = scan.nextInt();
					if(s.total > money) {
						System.out.println("돈이 부족하네요!");
						continue;
					} else {
						break;
					}
				}
				//영수증을 출력한다. 
				System.out.println("\n----------"+s.name+"----------");
				System.out.println("ITEM\t\tQTY\tAMT");
				for (int i = 0; i < s.arMenu.length; i++) {
					System.out.printf("%s\t%d\t%d\n", s.arMenu[i], s.arCount[i], s.arPrice[i]*s.arCount[i]);
				}
				System.out.println("----------------------------");
				System.out.println("합계금액\t\t"+s.total);
				System.out.println("받은금액\t\t"+money);
				System.out.println("----------------------------");
				System.out.println("잔    돈\t\t"+ (money-s.total));
				break;
			}
		}
	}
}
