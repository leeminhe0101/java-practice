package ch04.practice;

public class SumFiveEnd {
	public static void main(String[] args) {
		while(true) {
			int r1 = (int)(Math.random()*6)+1;
			int r2 = (int)(Math.random()*6)+1;
			
			System.out.printf("(%d, %d) ", r1, r2);
			
			if(r1+r2 == 5) break;
		}
	}
}
