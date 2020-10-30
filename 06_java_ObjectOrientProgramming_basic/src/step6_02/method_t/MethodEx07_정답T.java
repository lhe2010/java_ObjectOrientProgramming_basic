package step6_02.method_t;

class Ex07 {
	
	void printEvenOrOdd(int x) {
		
		if (x % 2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
	}
	
	
	
	void sumBetweenValues(int x, int y) {
		
		int total = 0;
		for (int i = x; i <= y; i++) {
			total += i;
		}
		System.out.println("total : " + total);
		
	}

	void printPrimeNums(int primeNumber) {
		
		for (int i = 2; i <= primeNumber; i++) {
			int count  = 0;
			for (int n = 1; n <= i; n++) {
				if (i % n == 0) {
					count += 1;
				}
			}
			if (count == 2) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
	}
}



public class MethodEx07_정답T {

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
