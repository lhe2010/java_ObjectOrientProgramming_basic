//2020-10-26 월 1교시 설명
package step6_01.classObject;
/*
 * # 클래스의 범위
 * 	- 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다. 
 *    (구체적인 접근제어자는 객체지향 기법에서 공부)
 *  - 
 */
public class ClassEx02 {

	public static void main(String[] args) {
		
		Ex01 e = new Ex01();
		e.x = 10;
		e.y = 20;
		
		Character char01 = new Character();
		System.out.println(char01.dex);
		
		
	}

}
