package ch05.sec07;

public class MultiDimensionalArrayByValueListExample {
	public static void main(String[] args) {
		int[][] scores = {
				{80, 90, 96}, {76, 88}
		};
		
		System.out.println("반의 수: " + scores.length);
		System.out.println("첫번째 반 학생 수: " + scores[0].length);
		System.out.println("두번째 반 학생 수: " + scores[1].length);
		
		//첫번째 반 평균점수
		int class1Sum = 0;
		for(int score: scores[0]) {
			class1Sum += score;
		}
		System.out.printf("첫번째 반의 평균: %.2f \n", (double)class1Sum/scores[0].length);
		
		//두번째 반 평균점수
		int class2Sum = 0;
		for(int score: scores[1]) {
			class2Sum += score;
		}
		System.out.printf("두번째 반의 평균: %.2f \n", (double)class2Sum/scores[1].length);
		
		//전체 학생의 평균점수
		int totalNum = 0;
		int totalSum = 0;
		
		for(int i=0; i<scores.length; i++) {
			totalNum += scores[i].length;
			
			for(int score: scores[i]) {
				totalSum += score;
			}
		}
		System.out.printf("전체 학생의 평균: %.2f", (double)totalSum/totalNum);
		
	}
}
