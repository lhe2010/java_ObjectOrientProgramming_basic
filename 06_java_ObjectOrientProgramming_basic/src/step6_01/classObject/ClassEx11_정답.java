// 2020-10-28 수 3교시 17:11-17:48 (1-2번)
// 2020-10-29 목 1교시 15:06-15:55 

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
		// String배열에 매개변수 str이 있는지 확인하고 있다면 요소로 넘기고 없으면 -1을 리턴 
		int idx = -1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals(str)) {// 있으면
				idx = i;
			}
		}
		if (idx == -1) 	return -1;
		else  			return idx;
	}
	
	void printAll() {
		System.out.println(Arrays.toString(this.arAcc));
		System.out.println(Arrays.toString(this.arPw));
		System.out.println(Arrays.toString(this.arMoney));
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
					System.out.print("가입하실 회원님의 ID : ");
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
				System.out.print("가입하실 회원님의 PW : ");
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
				System.out.println("\n...[2] 회원탈퇴");
				if(e.identifier == -1) {
					System.out.println("!!해당 메뉴는 로그인 시에만 이용가능합니다. ");
					continue;
				}
				while(true) {
					System.out.print("...탈퇴하실 회원님의 PW : ");
					myPw = scan.next();
					if(e.arPw[e.identifier].equals(myPw)) {
						System.out.println("맞는 비밀번호! 회원 탈퇴를 진행합니다. ");
						break;
					} else {
						System.out.println("!!비밀번호 오류!");
						continue;
					}
				}
				// 배열 한칸 줄여서 복사
				String[] newArAcc = new String[e.accCnt-1];
				String[] newArPw = new String[e.accCnt-1];
				int[] newArMoney = new int[e.accCnt-1];
				for (int i = 0; i < e.identifier; i++) {
					newArAcc[i] = e.arAcc[i];
					newArPw[i] = e.arPw[i];
					newArMoney[i] = e.arMoney[i];
				}
				for (int i = e.identifier+1; i < e.accCnt; i++) {
					newArAcc[i-1] = e.arAcc[i];
					newArPw[i-1] = e.arPw[i];
					newArMoney[i-1] = e.arMoney[i];
				}
				e.arAcc = newArAcc;
				e.arPw = newArPw;
				e.arMoney = newArMoney;
				e.accCnt--;
				e.identifier = -1;
			} else if (sel == 3) {
				System.out.println("\n...[3] 로그인");
				if(e.identifier != -1) {
					System.out.println("!!이미 로그인 상태입니다. ");
					continue;
				}
				while(true) {
					System.out.print("...로그인 하실 회원님의 ID : ");
					myId = scan.next();
					
					int temp = e.isExistIdx(e.arAcc, myId);
					if(temp == -1) {
						System.out.println("!!존재하지 않는 회원 ID입니다. ");
						continue;
					}
					System.out.print("...로그인 하실 회원님의 PW : ");
					myPw = scan.next();
					if(e.arPw[temp].equals(myPw)) {	// 로그인 완료
						e.identifier = temp;
						System.out.printf("...%s님 환영합니다.\n", e.arAcc[temp]);
						break;
					} else {
						System.out.println("!!비밀번호 오류!");
						continue;
					}
				}
			} else if (sel == 4) {
				System.out.println("\n...[4] 로그아웃");
				if(e.identifier == -1) {
					System.out.println("!!해당 메뉴는 로그인 시에만 이용가능합니다. ");
					continue;
				}
				System.out.printf("%s님 로그아웃 되셨습니다.\n", e.arAcc[e.identifier]);
				e.identifier = -1;
				
			} else if (sel == 5) {
				System.out.println("\n...[5] 입금메뉴");
				if(e.identifier == -1) {
					System.out.println("!!해당 메뉴는 로그인 시에만 이용가능합니다. ");
					continue;
				}
				System.out.print("...입금하실 금액 : ");
				int amount = scan.nextInt();
				e.arMoney[e.identifier] += amount;
				System.out.printf("입금 후 고객님의 잔액은 %d원 입니다. \n", e.arMoney[e.identifier]);
				
			} else if (sel == 6) {
				System.out.println("\n...[6] 이체메뉴");
				if(e.identifier == -1) {
					System.out.println("!!해당 메뉴는 로그인 시에만 이용가능합니다. ");
					continue;
				}
				// 계좌 잔액확인
				int amount;
				while(true) {
					System.out.print("...이체하실 금액 : ");
					amount = scan.nextInt();
					if(amount > e.arMoney[e.identifier]) {
						System.out.println("!!이체가능 금액을 초과하였습니다. ");
						continue;
					} else
						break;
				}
				String temp = "";
				int tempIdx;
				while(true) {
					System.out.print("...이체대상 고객 : ");
					temp = scan.next();
					tempIdx = e.isExistIdx(e.arAcc, temp);
					if( tempIdx == -1 || tempIdx == e.identifier) {
						System.out.println("!!존재하지 않는 고객님입니다. ");
						continue;
					} else 
						break;
				}
				e.arMoney[tempIdx] += amount;
				e.arMoney[e.identifier] -= amount;		
				System.out.printf("이체 후 고객님의 잔액은 %d원 입니다. \n", e.arMoney[e.identifier]);
				
			} else if (sel == 7) {
				System.out.println("\n...[7] 잔액조회");
				if(e.identifier == -1) {
					System.out.println("!!해당 메뉴는 로그인 시에만 이용가능합니다. ");
					continue;
				}
				System.out.printf("%s고객님의 잔액은 %d원 입니다. \n", e.arAcc[e.identifier], e.arMoney[e.identifier]);
				e.printAll();
			} else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
//				e.printAll();
			}
		}		
		scan.close();
	}
}
