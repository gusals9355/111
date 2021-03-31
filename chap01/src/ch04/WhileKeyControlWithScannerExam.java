package ch04;

import java.util.Scanner;

public class WhileKeyControlWithScannerExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int speed = 0;
		
		while(true) {
			System.out.println("-----------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("-----------------------");
			System.out.print("선택 : ");
			int input = sc.nextInt();
			
			if(input == 1) {
				speed++;
			} else if(input == 2) {
				speed--;
			} else if(input == 3) {
				System.out.println("끝");
				break;
			} else {
				System.out.println("1,2,3번 중 선택하세요");
			}
			
			System.out.println("speed : " + speed);
		}
	}

}
