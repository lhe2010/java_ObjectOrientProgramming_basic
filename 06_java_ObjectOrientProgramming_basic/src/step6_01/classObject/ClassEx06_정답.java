// 2020-10-26 월 2교시 16:37-16:45
package step6_01.classObject;

import java.util.Arrays;
import java.util.Random;

/*
 * # OMR카드 : 클래스 + 변수
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표     = {O, X, O, X, X}
 * 성적        = 40점
 */

class Ex06{
	int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	int[] hgd = new int[5];				// 학생답안
	
	int answerCnt = 0;					// 정답 맞춘 개수
	int score = 0;						// 성적
}

public class ClassEx06_정답 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Ex06 s = new Ex06();
		
		// 학생이 문제를 푼다. 
		for (int i = 0; i < s.hgd.length; i++) 
			s.hgd[i] = ran.nextInt(5)+1;

		// 답을 채점해서 정오표를 출력한다. 
		System.out.println("answer\t= "+ Arrays.toString(s.answer));
		System.out.println("hgd\t= "+ Arrays.toString(s.hgd));
		System.out.print("정오표\t= [");
		for (int i = 0; i < s.hgd.length; i++) {
			if(s.answer[i] == s.hgd[i]) {
				System.out.print("O");
				s.answerCnt++;
				s.score += 20;
			} else
				System.out.print("X");
			if(i != s.hgd.length-1)		System.out.print(", ");
		}
		System.out.print("]\n");
		System.out.println("성적\t= "+ s.score);
		
	}

}
