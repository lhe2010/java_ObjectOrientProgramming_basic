// 2020-10-28 수 3교시 17:08-17:11
package step6_02.method;

//# 학생성적관리 프로그램[1단계] : 클래스 + 메서드

class Ex11{
	
	int test1(int[] arr) { 
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum; 
	}
	
	int test2(int[] arr) { 
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0)
				sum += arr[i];
		}
		return sum; 
	}
	
	int test3(int[] arr) { 
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0)
				cnt++;
		}
		return cnt; 
	}
	
	int test4(int[] arr) { 
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0)
				cnt++;
		}
		return cnt; 
	}
}

public class MethodEx11_정답 {

	public static void main(String[] args) {

		Ex11 e = new Ex11();
		
		int[] arr = {87, 100, 11, 72, 92};

		// 문제 1) 전체 합 리턴
		// 정답 1) 362
		e.test1(arr);
		System.out.println(e.test1(arr));
		
		// 문제 2) 4의 배수의 합 리턴
		// 정답 2) 264
		e.test2(arr);
		System.out.println(e.test2(arr));
		
		// 문제 3) 4의 배수의 개수 리턴
		// 정답 3) 3
		e.test3(arr);
		System.out.println(e.test3(arr));
		
		// 문제 4) 짝수의 개수 리턴
		// 정답 4) 3
		e.test4(arr);
		System.out.println(e.test4(arr));
	}

}
