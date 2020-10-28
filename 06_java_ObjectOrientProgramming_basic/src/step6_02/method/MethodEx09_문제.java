package step6_02.method;

/*
class Ex09 {

	void setRandomValuesinArray(int [] scores) {}
	
	void printScores (int [] scores) {}
	
	void printNumber(int[] nums) {}
	
	void printSumAndAverage (int [] scores) {}
	
	void printWinner (int [] scores) {}
	
	void printScore1 (int [] scores) {}
	
	void printScore2 (int [] scores) {}
	
	void printScore3(int [] hakbuns, int [] scores) {}
	
	void printNumberOne (int [] hakbuns, int [] scores) {}
	
}
*/

public class MethodEx09_문제 {

	public static void main(String[] args) {
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores  = new int[5];
		
		Ex09 e = new Ex09();
		
		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47

		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)

		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명

		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1 성적 : 11점

		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11 인덱스 : 1

		// 문제6) 학번을 입력받아 성적 출력
	    // 단, 없는학번 입력 시 예외처리
		// 정답6) 학번 입력 : 1003 성적 : 45점

		// 문제7) 1등학생의 학번과 성적 출력
		// 정답7) 1004번(98점)

	}

}
