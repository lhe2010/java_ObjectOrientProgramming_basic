// 2020-10-26 월 2교시 16:26-16:37
package step6_01.classObject;

import java.util.Scanner;

/*
 * # 학생성적 관리 프로그램[3단계] : 클래스 + 변수
 * 1. 학번을 입력하면, 해당 학생의 성적이 출력된다.
 * 2. 단, 없는 학번 입력에 관한 예외상황을 반드시 처리해야 한다.
 * 3. 1등과 꼴등 학생의 정보를 확인할 수 있다.
 */

class Ex05{
	String name = "";
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};
}

public class ClassEx05_정답 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);

		Ex05 mega = new Ex05();
		mega.name = "메가IT 고등학교";
		
		while (true) {
			
			// 메뉴 출력
			System.out.println("\n=== " + mega.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
			
			// 메뉴 선택
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			
			if		(choice == 1) {
				System.out.println("\n[전교생 성적확인]");
				for (int i = 0; i < mega.arHakbun.length; i++) {
					System.out.printf("학번: %d - 성적: %d\n", mega.arHakbun[i], mega.arScore[i]);
				}
			} else if (choice == 2) { 
				System.out.println("\n[1등학생 성적확인]");
				int maxIdx = 0;
				for (int i = 0; i < mega.arHakbun.length; i++) {
					if(mega.arScore[maxIdx] < mega.arScore[i]) {
						maxIdx = i;
					}
				}
				System.out.printf("...1등학생의 학번: %d - 성적: %d\n", mega.arHakbun[maxIdx], mega.arScore[maxIdx]);
			} else if (choice == 3) { 
				System.out.println("\n[꼴등학생 성적확인]");
				int minIdx = 0;
				for (int i = 0; i < mega.arHakbun.length; i++) {
					if(mega.arScore[minIdx] > mega.arScore[i]) {
						minIdx = i;
					}
				}
				System.out.printf("...꼴등학생의 학번: %d - 성적: %d\n", mega.arHakbun[minIdx], mega.arScore[minIdx]);
			} else if (choice == 4) {
				System.out.println("\n[학생 성적확인]");
				System.out.print("학번을 입력하세요: ");
				int hakbun = scan.nextInt();
				boolean isExist = false;
				for (int i = 0; i < mega.arHakbun.length; i++) {
					if(mega.arHakbun[i] == hakbun) {
						isExist = true;
						System.out.printf("학번이 %d인 학생의 성적은 %d점\n", hakbun, mega.arScore[i]);
					}
				}
				if(!isExist) System.out.println("입력하신 학번은 존재하지 않는 학번입니다.");	
			}
			else if (choice == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
