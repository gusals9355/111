package ch05;

import java.util.Scanner;

public class VendingMachineMission2 {

	public static void main(String[] args) {
		/* 아래는 콘솔에 출력해야하는 내용입니다.
		 * <메뉴>
		 * 1. 콜라 (1,000원)
		 * 2. 사이다 (1,200원)
		 * 3. 환타 (1,300)원
		 */
		String[] menu = {"콜라","사이다","환타"};
		int[] price = {1000,1200,1300};
		Scanner sc = new Scanner(System.in);
		int money = 0;

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
				System.out.printf("종료 - 사용한 금액은 : %,d원", money);
				break;
			}else {
				int selectedIdx = input -1;
				System.out.println(menu[selectedIdx]+"를 선택하셨습니다.\n");
				money += price[selectedIdx];
			}
			
		}
		
		
	}

}
