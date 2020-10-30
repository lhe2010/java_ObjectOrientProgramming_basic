// 2020-10-30 금 3교시 15:28-15:39
package step6_02.method;

import java.util.Arrays;
import java.util.Random;

/*
 * # OMR카드 : 클래스 + 메서드
 * 예)
 * answer = {1, 3, 4, 2, 5}	// 정답지
 * hgd    = {1, 1, 4, 4, 3}	// omr (1~5 사이의 랜덤 숫자 5개 저장)
 * 정오표 = {O, X, O, X, X}	// answer와 hgd 값을 비교
 * 성적   = 40점			// 한 문제당 20점이다.
 */

class ScoreMng{
	
	Random ran = new Random();
	
	int[] omr = {1, 4, 3, 2, 2};		// 모범답안
	int[] me = new int[5];				// 학생답안
	
	int cnt = 0;						// 정답 맞춘 개수
	int score = 0;						// 성적
	
	// 1.me 답안 완성하기
	void makeAnswer() {
		for (int i = 0; i < omr.length; i++) {
			me[i] = ran.nextInt(5)+1;			
		}
		System.out.println("hgd\t= " + Arrays.toString(this.me));
	}
	
	// 2.정답 출력하기
	void showAnswer() {
		System.out.println("omr\t= " + Arrays.toString(this.omr));
	}
	
	// 3.정답 비교하기 + 정오표 출력
	void checkAnswer() {
		this.showAnswer();
		for (int i = 0; i < omr.length; i++) {
			if(i == 0) System.out.print("정오표\t= [");
			if(omr[i] == me[i]) {
				System.out.print("O");
				cnt++;				
			} else {
				System.out.print("X");
			}
			if(i != omr.length-1) 	System.out.print(", ");
			else					System.out.print("]\n");
		}
		System.out.printf("정답갯수가 %d개이므로 점수는 %d점\n", this.cnt, this.cnt*20);
	}
	
	// 4.실행하기
	void run() {
		this.makeAnswer();
		this.checkAnswer();
	}
}

public class MethodEx12_테스트정답 {

	public static void main(String[] args) {
		
		ScoreMng sm = new ScoreMng();
		sm.run();

	}

}
