// 2020-10-27 화 3교시 17:11-17:48 (1-2번)
package step6_01.classObject;
/*
 * # ATM[4단계] : 전체 기능구현
 * 1. 회원가입
 * . id와 pw를 입력받아 가입
 * . 가입 시 돈 1000원 부여
 * . id 중복체크
 * 2. 회원탈퇴
 * . 로그인시에만 이용가능
 * 3. 로그인
 * . id와 pw를 입력받아 로그인
 * . 로그아웃 상태에서만 이용가능
 * 4. 로그아웃
 * . 로그인시에만 이용가능
 * 5. 입금
 * . 로그인시에만 이용가능
 * 6. 이체
 * . 로그인시에만 이용가능
 * 7. 잔액조회
 * . 로그인시에만 이용가능
 */

import java.util.Arrays;
import java.util.Scanner;

class Ex11{
	String name = "";
	
	String[] arAcc = {"1111", "2222", "3333", "4444", "5555"};
	String[] arPw  = {"1234", "2345", "3456", "4567", "5678"};
	int[] arMoney  = {87000, 34000, 17500, 98000, 12500};
	
	int accCnt = 5;
	int identifier = -1;
	
	int isExistIdx(String[] arr, String str) {
		int idx = -1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals(str)) {// 있으면
				idx = i;
			}
		}
		if (idx == -1) 	return -1;
		else  			return idx;
	}
}

public class ClassEx11_정답 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Ex11 e = new Ex11();
		e.name = "Mega Bank";
		
		String myId, myPw;
		
		while (true) {
			
			System.out.println("\n[" + e.name + "]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금하기");
			System.out.println("[6]이체하기");
			System.out.println("[7]잔액조회");
			System.out.println("[0]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				System.out.println("\n...[1] 회원가입");
				while(true) {
					// id를 입력받아 가입
					System.out.print("ID : ");
					myId = scan.next();
					
					// ID중복? 재입력받습니다 : 비밀번호입력받기 
					if(e.isExistIdx(e.arAcc, myId) == -1) {
						break;
					} else {
						System.out.println("!!이미 있는 ID입니다. 다시 입력해주세요.");
						continue;
					}
				}
				// ID중복 아닐때 비밀번호를 입력받는다. 
				System.out.print("PW : ");
				myPw = scan.next();
				
				// 배열 한칸 늘려서 복사하고 마지막 항목에 신규회원 정보 저장 
				String[] newArAcc = new String[++e.accCnt];
				String[] newArPw = new String[e.accCnt];
				int[] newArMoney = new int[e.accCnt];
				for (int i = 0; i < e.arAcc.length; i++) {
					newArAcc[i] = e.arAcc[i];
					newArPw[i] = e.arPw[i];
					newArMoney[i] = e.arMoney[i];
				}
				// 가입시 돈 1000원 부여
				System.out.printf("%s님 환영합니다. 가입축하 1000원 지급합니다. \n", myId);
				newArAcc[e.accCnt-1] = myId;
				newArPw[e.accCnt-1] = myPw;
				newArMoney[e.accCnt-1] = 1000;
				e.arAcc = newArAcc;
				e.arPw = newArPw;
				e.arMoney = newArMoney;
				
			} else if (sel == 2) {
				while(true) {
					System.out.print("탈퇴하실 회원님의 ID : ");
					myId = scan.next();
					
					int temp = e.isExistIdx(e.arAcc, myId);
					if(temp == -1) {
						System.out.println("존재하지 않는 회원ID 입니다. ");
						continue;
					} 
					System.out.print("PW : ");
					myPw = scan.next();
					if(e.arPw[temp].equals(myPw)) {
						// 줄여서 새로 배열 만들어라 
						e.arAcc[temp] = null;
						e.arPw[temp] = null;
						e.arMoney[temp] = 0;
						System.out.println("맞는 비밀번호! 회원 탈퇴를 진행합니다. ");
						break;
					} else {
						System.out.println("비밀번호 오류!");
						continue;
					}
				}
				
			} else if (sel == 3) {
				
			} else if (sel == 4) {
				
			} else if (sel == 5) {
				
			} else if (sel == 6) {
				
			} else if (sel == 7) {
				System.out.println(Arrays.toString(e.arAcc));
				System.out.println(Arrays.toString(e.arPw));
				System.out.println(Arrays.toString(e.arMoney));
				
			} else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}		
		
	}

}
