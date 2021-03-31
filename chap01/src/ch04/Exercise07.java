package ch04;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run =true;
		int balance=0;
		int money;
		int input;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			System.out.print("선택 : ");
			input = sc.nextInt();
			if(input == 1) {
				System.out.print("예금액 : ");
				money = sc.nextInt();
				balance += money;
			} else if(input == 2) {
				System.out.print("출금액 : ");
				money = sc.nextInt();
				if(balance <= 0) {
					System.out.println("잔액이 부족합니다");
				} else {
					balance -= money;
				}
			} else if(input == 3) {
				System.out.println("잔고 : " + balance);
				
			} else if(input == 4) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("1~4까지 선택하세요");
			}
			
		}
		sc.close();
	}

}
