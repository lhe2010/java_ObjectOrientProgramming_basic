// 2020-10-27 화 3교시 17:10-17:15
package step6_02.method;

import java.util.Arrays;

class Ex06{
	
	void test1(int x, int y) {
		int sum = 0;
		for (int i = x; i <= y; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	void test2(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i])
				max = arr[i];
		}
		System.out.println("[2] arr의 최대값은 " + max);
	}
	
	void test3(int[] arr, int idx1, int idx2) {
		System.out.println(Arrays.toString(arr));
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		System.out.println(Arrays.toString(arr));
	}
	
}

public class MethodEx06_정답 {

	public static void main(String[] args) {
		
		Ex06 e = new Ex06();
		
		// 문제 1) x부터 y까지의 합을 출력하는 메서드
		int x = 1;
		int y = 10;
		e.test1(x, y);
		
		// 문제 2) arr배열을 전달받아 최대값을 출력하는 메서드
		int[] arr = {87, 100, 35, 12, 46};
		e.test2(arr);
		
		// 문제 3) arr배열을 전달받아 인덱스 2개를 입력받고, 해당 위치의 값을 교체하는 메서드
		int idx1 = 1;
		int idx2 = 4;
		e.test3(arr, idx1, idx2);

	}

}
