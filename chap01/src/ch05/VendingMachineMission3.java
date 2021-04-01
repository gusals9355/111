package ch05;

import java.util.Scanner;

public class VendingMachineMission3 {

	public static void main(String[] args) {
		/* 아래는 콘솔에 출력해야하는 내용입니다.
		 * 돈을 주입해주세요 : 3000
		 * 
		 * <메뉴>
		 * 1. 콜라 (1,000원)
		 * 2. 사이다 (1,200원)
		 * 3. 환타 (1,300)원
		 * 선택> 1
		 * 콜라를 선택하셨습니다. 남은금액 2000원
		 * 선택> 3
		 * 금액이 부족합니다 남은 금액 700원
		 * 
		 */
		String[] menu = {"콜라","사이다","환타"};
		int[] price = {1000,1200,1300};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("돈을 주입해주세요 : ");
		int money = sc.nextInt();
		while(true) {
			System.out.println("<메뉴>");
			for(int i=0; i<menu.length; i++) {
				if(i==0) {
					System.out.println(i+". 종료");
				}
				System.out.printf("%d. %s (%,d원)\n",i+1, menu[i], price[i]);
			}
			System.out.print("선택 > ");
			int input=sc.nextInt();
			
			if(input > menu.length || input < 0) {
				System.out.println("메뉴판을 확인해주세요\n");
			} else if(input == 0) {
				System.out.printf("종료 - 남은 금액은 : %,d원", money);
				break;
			}else {
				int selectedIdx = input -1;
				if(money < price[selectedIdx]) {
					System.out.println("금액이 부족합니다." + "(남은 금액 "+ money +"원)\n");
				} else {
					money -= price[selectedIdx];
					System.out.println(menu[selectedIdx]+"를 선택하셨습니다. (남은 금액 "+ money +"원)\n");
				}
			}
		}
		
	}

}
