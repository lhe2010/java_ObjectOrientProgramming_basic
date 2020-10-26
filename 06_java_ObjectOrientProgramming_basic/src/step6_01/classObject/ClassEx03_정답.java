//2020-10-26 월 1교시 15:41-15:45
package step6_01.classObject;

//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

class Ex03{
	int[] arr = {87, 100, 11, 72, 92};
}

public class ClassEx03_정답 {

	public static void main(String[] args) {
		
		Ex03 e = new Ex03();

		// 문제 1) 전체 합 출력
		// 정답 1) 362
		int sum = 0;
		for (int i = 0; i < e.arr.length; i++) {
			sum += e.arr[i];			
		}
		System.out.println("Sum = " + sum);
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		sum = 0;
		for (int i = 0; i < e.arr.length; i++) {
			if(e.arr[i] % 4 == 0) {
				sum += e.arr[i];			
			}
		}
		System.out.println("4의 배수의 합 = " + sum);
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		int cnt = 0;
		for (int i = 0; i < e.arr.length; i++) {
			if(e.arr[i] % 4 == 0) {
				cnt++;
			}
		}
		System.out.println("4의 배수의 개수 = " + cnt);
		
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		cnt = 0;
		for (int i = 0; i < e.arr.length; i++) {
			if(e.arr[i] % 2 == 0) {
				cnt++;
			}
		}
		System.out.println("2의 배수의 개수 = " + cnt);
	}
}