package ch04.practice;

public class ASimpleEquationFor {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				if(4*i + 5*j == 60) {
					System.out.printf("(%d, %d) ", i, j);
				}
			}
		}
	}
} 
