// 2020-10-29 목 설명 - 메소드 오버로딩/오버라이딩 
package step6_02.method;
/*
 * 
 */

class MethodOverloadingEx {
//	int add2(int x, int y) 			{ return x+y; }
//	int add3(int x, int y, int z) 	{ return x+y+z; }	
//	double add(double x, double y) 	{ return x+y; }
// 매개변수 개수만 다른경우 
// 매개변수 자료형 다른데 같은 기능을 할경우 
// 만드는건 다만들어야한다. 하지만 이름이 너무 많아짐 => 자바 겹쳐도 허용. 
	
	int add(int x, int y) 			{ return x+y; }
	int add(int x, int y, int z) 	{ return x+y+z; }	
	double add(double x, double y) 	{ return x+y; }
	
	int add(int[] arr) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return total;
	}
}

public class MethodEx17 {

	public static void main(String[] args) {
		
		MethodOverloadingEx e = new MethodOverloadingEx();

		int[] arr = {1,2,3,4,5};
		
		int r1 = e.add(10, 3);
		int r2 = e.add(10, 3, 1);
		double r3 = e.add(3.14, 7.14);
		int r4 = e.add(arr);
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);		

	}

}
