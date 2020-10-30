package step6_02.method_t;

import java.util.Random;
import java.util.Scanner;

class Ex09 {
	
	void setRandomValuesinArray(int [] scores) {
		
		Random ran = new Random();
		for (int i = 0; i < scores.length; i++) {
			int r = ran.nextInt(100) + 1;
			scores[i] = r;
		}
		printScores(scores);
	}
	
	void printScores (int [] scores) {
		
		for (int i = 0; i <scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
	}

	void printNumber(int[] nums) {
		
		for (int i = 0; i <nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
	
	void printSumAndAverage (int [] scores) {
		
		int total = 0;
		for (int i = 0; i <scores.length; i++) {
			total += scores[i];
		}
										  // 형변환
		System.out.println(total + " : " + (double)total/scores.length);
		
	}
	
	void printWinner (int [] scores) {
		
		int count = 0;
		for(int i = 0; i <scores.length; i++) {
			if(scores[i] >= 60) {
				count += 1;
			}
		}
		System.out.println(count);
	}
	
	void printScore1 (int [] scores) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("인덱스를 입력하세요 : ");
		int index = scan.nextInt();
		System.out.println(scores[index]);
		scan.close();
	}
	
	void printScore2 (int [] scores) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하세요 : ");
		int value = scan.nextInt();
		for (int i = 0; i < scores.length; i++) {
			if (value == scores[i]) {
				System.out.println(i);
			}
		}	
		scan.close();
	}
	
	void printScore3(int [] hakbuns, int [] scores) {
		
		Scanner scan = new Scanner(System.in);
		printNumber(hakbuns);
		System.out.println("학번을 입력하세요 : ");
		int value = scan.nextInt();
		boolean check = false;
		
		for (int i = 0; i < hakbuns.length; i++) {
			if (value == hakbuns[i]) {
				System.out.println(scores[i]);
				check = true;
			}
		}	
		if (check == false) {
			System.out.println("없는학번입니다.");
		}
		scan.close();
	}
	
	void printNumberOne (int [] hakbuns, int [] scores) {
		
		int max = scores[0];
		int maxindex = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (max < scores[i]) {
				max = scores[i];
				maxindex = scores[i];
			}
		}
		System.out.println(max + " " + hakbuns[maxindex]);
	}
}

public class MethodEx09_정답T {

	public static void main(String[] args) {
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores  = new int[5];
		
		Ex09 e = new Ex09();
		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47
		e.setRandomValuesinArray(scores);
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		e.printSumAndAverage(scores);	
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		e.printWinner(scores);	
		
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		e.printScore1(scores);
		
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11 인덱스 : 1
		e.printScore2(scores);
		
		// 문제6) 학번을 입력받아 성적 출력 // 단, 없는학번 입력 시 예외처리
		// 정답6) 학번 입력 : 1003 성적 : 45점
		e.printScore3(hakbuns, scores);		
		
		// 문제7) 1등학생의 학번과 성적 출력
		// 정답7) 1004번(98점)
		e.printNumberOne(hakbuns, scores);	
	}
}
