// 2020-10-27 화 3교시 17:17-17:24
package step6_02.method;

class Ex07 {
	
	void printEvenOrOdd(int x) {
		if(x%2 == 1)
			System.out.println("홀수");
		else
			System.out.println("짝수");
		
	}
	
	void sumBetweenValues(int x, int y) {
		int sum = 0;
		for (int i = x; i <= y; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	void printPrimeNums(int primeNumber) {
		for (int i = 2; i <= primeNumber; i++) {
			int primeCnt = 0;
			for (int j = 1; j <= i; j++) {
				if(i % j == 0)
					primeCnt++;
			}
			if(primeCnt == 2)
				System.out.print(i + ", ");
		}
	}
}

public class MethodEx07_정답 {

	public static void main(String[] args) {
		
		Ex07 e = new Ex07();
		
		// 문제 1) a 가 홀수인지 짝수인지 출력 
		int a = 19;
		e.printEvenOrOdd(a);

		// 문제 2) x부터 y까지의 합을 출력하는 메서드
		int x = 1;
		int y = 10;
		e.sumBetweenValues(x, y);

		// 문제3) 숫자 1개를 인자로 사용해서 2부터 인자까지의  소수 전부 출력 
		int primeNumber = 20;
		e.printPrimeNums(primeNumber);
	}
}
