package ch05;

import java.util.Scanner;

public class VendingMachineMission {

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
				System.out.println("주문취소");
				break;
			}else {
				System.out.println(menu[input-1]+"를 선택하셨습니다.\n");
			}
			
		}
		
		
	}

}
