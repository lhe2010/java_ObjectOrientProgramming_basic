// 2020-10-28 수 2교시 설명 
package step6_02.method;
/*
 * return 
 * 1) 값을 반환한다. 
 * 2) 메서드를 종료한다. 
 * 3) 메서드 1개당 return값이 1개이다. 
 * 	
 * 지역변수/멤버변수/매개변수/정적변수
 */

class Student3 {
	
	void setScore1(int score1) {
		score1 = 100;
	}
	
	int setScore2(int score2) {
		score2 = 100;
		return score2;
	}
	
	int testReturn() {
		System.out.println("리턴 전 명령어1");
		System.out.println("리턴 전 명령어2");
		System.out.println("리턴 전 명령어3");
//		return 1,2,3,4,5; // 복수의 리턴값 불가능
		return 1;
		
//		System.out.println("리턴 전 명령어4"); // 불가능 
//		System.out.println("리턴 전 명령어5");
//		System.out.println("리턴 전 명령어6");
	}
}

public class MethodEx03 {

	public static void main(String[] args) {
		
		Student3 std3 = new Student3();
		
		int score1 = 87;
		System.out.println("메서드전의 score1=" + score1);	// 87
		
		std3.setScore1(score1);
		System.out.println("메서드후의 score1=" + score1);	// 87

		System.out.println("--------------------------");
		int score2 = 87;
		System.out.println("메서드전의 score2=" + score2);	// 87
		
		std3.setScore2(score2);
		System.out.println("메서드후의 score2=" + score2);	// 87
		
		score2 = std3.setScore2(score2);
		System.out.println("메서드후의 score2=" + score2);	// 100
		
		System.out.println("--------------------------");
		std3.testReturn();
		
		
	}

}
