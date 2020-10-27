// 2020-10-27 화 3교시 17:04-17:08
package step6_02.method;
import java.util.Scanner;

class Ex05{

	void test1() {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	void test2() {
		Scanner scan = new Scanner(System.in);

		System.out.print("정수를 세개 입력하세요: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		if(num1 >= num2 && num1 >= num3)
			System.out.println(num1);
		else if(num2 >= num3 && num2 >= num1)	
			System.out.println(num2);
		else if(num3 >= num2 && num3 >= num1)	
			System.out.println(num3);
	}
}

public class MethodEx05_정답 {

	public static void main(String[] args) {

		Ex05 e = new Ex05();
					
		// 문제 1) 1부터 5까지의 합을 출력하는 메서드
		e.test1();
		
		// 문제 2) 정수 3개를 입력받아 최대값을 출력하는 메서드
		e.test2();
	}
}
