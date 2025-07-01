package ch04.practice;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		int account = 0;
		boolean result = true; 
		while(result) {
	
			System.out.println("----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------------");
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("선택 > ");
			int aw = Integer.parseInt(scanner.nextLine());
			
			account = switch(aw) {
			case 1 -> {
				System.out.print("예금액");
				yield account + Integer.parseInt(new Scanner(System.in).nextLine());
			} case 2 -> {
				System.out.print("출금액");
				yield account + Integer.parseInt(new Scanner(System.in).nextLine());
			} case 3 -> {
				System.out.println("잔고 > " + account);
				yield account;
			} case 4 -> {
				result = false;
				yield account;
			}
			default -> {
				System.out.println("잘못된 입력입니다.");
				yield account;
			}
			};
			
		}
		System.out.println();
		System.out.println("종료되었습니다.");
	}
}
