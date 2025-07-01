package ch05.sec06;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		int[] scores = {83, 90, 97};
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		
		printItem(new int[] {83, 90, 97});
	}
	
	public static void printItem(int[] scores) {
		for(int score: scores) {
			System.out.println(score);
		}
	}
}
