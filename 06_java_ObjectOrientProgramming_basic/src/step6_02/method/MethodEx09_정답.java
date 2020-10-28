// 2020-10-28 수 1교시 15:25-15:43
package step6_02.method;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Ex09 {
	Scanner scan = new Scanner(System.in);

	void setRandomValuesinArray(int [] scores) {	// 1번 ok
		Random ran = new Random();
		for (int i = 0; i < scores.length; i++) {
			scores[i] = ran.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(scores));
	}
	
	void printScores (int [] scores) {
		
	}
	
	void printSumAndAverage (int [] scores) {	// 2번 ok
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.printf("총점 (%d) 평균(%.2f)\n", sum, sum/scores.length*1.0);
	}
	
	void printWinner (int [] scores) {	// 3번 성적이 60점 이상이면 합격. 합격생 수 출력
		int pCnt = 0;
		for (int i = 0; i < scores.length; i++) {
			if(scores[i] >= 60)
				pCnt++;
		}
		System.out.println(pCnt + "명");
		
	}
	
	void printScore1 (int [] scores) {
		System.out.print("인덱스 입력 : ");
		System.out.println("성적 : " + scores[scan.nextInt()]);
	}
	
	void printScore2 (int [] scores) {
		System.out.print("성적 입력 : ");
		int score = scan.nextInt();
		int idx = -1;
		for (int i = 0; i < scores.length; i++) {
			if(scores[i] == score) {
				idx = i;
			}
		}
		if(idx != -1) {
			System.out.println("인덱스 : " + idx);
		} else
			return;
	}
	
	void printScore3(int [] hakbuns, int [] scores) {
		System.out.print("학번 입력 : ");
		int hakbun = scan.nextInt();
		int idx = -1;
		for (int i = 0; i < hakbuns.length; i++) {
			if(hakbuns[i] == hakbun) {
				idx = i;
			}
		}
		if(idx == -1) 	System.out.println("유효하지않은 학번");
		else 			System.out.println("점수 : "+ scores[idx]);
	}
	
	void printNumberOne (int [] hakbuns, int [] scores) {
		int maxIdx = 0;
		for (int i = 0; i < scores.length; i++) {
			if(scores[maxIdx] < scores[i]) {
				maxIdx = i;
			}
		}
		System.out.printf("%d번(%d점)\n", hakbuns[maxIdx], scores[maxIdx]);
	}
}

public class MethodEx09_정답 {

	public static void main(String[] args) {
		
		Ex09 e = new Ex09();
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores  = new int[5];
		
		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47
		e.setRandomValuesinArray(scores);

		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		e.printSumAndAverage(scores);

		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명
		e.printWinner(scores);

		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		e.printScore1(scores);

		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11 인덱스 : 1
		e.printScore2(scores);

		// 문제6) 학번을 입력받아 성적 출력
	    // 단, 없는학번 입력 시 예외처리
		// 정답6) 학번 입력 : 1003 성적 : 45점
		e.printScore3(hakbuns, scores);

		// 문제7) 1등학생의 학번과 성적 출력
		// 정답7) 1004번(98점)
		e.printNumberOne(hakbuns, scores);
	}

}
