// 2020-10-27 화 3교시 17:25-17:29
package step6_02.method;

class Ex08 {
	
	void printSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("[1] 전체합출력" + sum);
		
	}
	void printSumMultiple4(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] %4 == 0)
				sum+= arr[i];
		}
		System.out.println("[2] 4의 배수의 총합: " + sum);
	}
	void printCountMultiple4(int[] arr) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] %4 == 0)
				cnt++;
		}
		System.out.println("[3] 4의 배수의 개수: " + cnt);
	}
	void printCountMultiple2(int[] arr) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] %2 == 0)
				cnt++;
		}
		System.out.println("[4] 2의 배수의 개수: " + cnt);
	}
}

public class MethodEx08_정답 {

	public static void main(String[] args) {
		
		Ex08 e = new Ex08();
		int[] arr = { 87, 100, 11, 72, 92 };

		// 문제 1) 전체 합 출력
		// 정답 1) 362
		e.printSum(arr);

		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		e.printSumMultiple4(arr);

		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		e.printCountMultiple4(arr);

		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		e.printCountMultiple2(arr);

	}

}
