// 2020-10-27 화 2교시 설명
// 그룹화 조직화 체계화 메뉴얼화
// 호출
package step6_02.method;
import java.util.Random;
/*
 * # 클래스의 구성요소
 *  [1] 변수
 *  [2] 메서드(method)
 *  	2-1) void 	: return 타입 (int, doouble, char, int[], String...)
 *  	2-2) say 	: 메서드명 (주로 소문자로 시작하고 동사형태로 작성)
 *  	2-3) ()		: 입력값을 받는 부분
 *  	2-4) {} 	: 메서드의 영역
 *  	2-5) return	: 반환값
 *  
 */

class Student1 {
	
	void say() {
		System.out.println("안녕하세요. ");
//		return; // return값이 void일 때는 생략 가능
	}
}
public class MethodEx01 {

	public static void main(String[] args) {
		
		Student1 std = new Student1();
		std.say();

		Random ran = new Random();
		ran.nextInt();
		
		int[] arr = new int[5];
		int len = arr.length;
		
		String name = "HAYLEY";
		name.length();
	}

}
