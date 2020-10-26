//2020-10-26 월 1교시 설명
package step6_01.classObject;
/*
 * # 클래스
 * 
 * 1. 정의 (설계도)
 * 
 *  1-1) class	: 키워드
 *  1-2) Ex01	: 클래스 명 (첫글자를 대문자로 작성한다. )
 *  1-3) {}		: 클래스의 영역
 * 
 * 2. 선언 (실체)
 *  
 *  클래스명 변수명 = new 클래스명();
 *  	 ex) Ex01 e = new Ex01();
 *  	 Random ran = new Random();
 *  
 */

class Ex01{
	int x;
	int y;
}

class Character{
	
	int level	= 1;
	int power 	= 10;
	int dex 	= 10;
	int life 	= 10;
	int mana 	= 10;
	
}

public class ClassEx01 {
	
	public static void main(String[] args) {
		
		Ex01 e1 = new Ex01();			// 객체 생성
		e1.x = 100;
		e1.y = 200;
		
		System.out.println(e1);			// 객체의 이름은 주소
		System.out.println(e1.x);
		System.out.println(e1.y);
		System.out.println();

		Ex01 e2 = new Ex01();
		e2.x = 1000;
		e2.y = 2000;
		
		System.out.println(e2);			// 객체의 이름은 주소
		System.out.println(e2.x);
		System.out.println(e2.y);
		System.out.println();
		
		Character c1 = new Character();
//		c1.level++;
//		c1.life = 0;
		System.out.println(c1);
		System.out.println(c1.level);
		System.out.println(c1.power);
		System.out.println(c1.dex);
		System.out.println(c1.life);
		System.out.println(c1.mana);
		System.out.println();
		
		Character c2 = new Character();
		System.out.println(c2);
		System.out.println(c2.level);
		System.out.println(c2.power);
		System.out.println(c2.dex);
		System.out.println(c2.life);
		System.out.println(c2.mana);
		System.out.println();
		
		Character c3 = new Character();
		
		
		
	}

}
