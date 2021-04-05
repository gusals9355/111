package ch05;

import java.util.Scanner;

public class MethodMission10 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		String[] menuNmArr = {"콜라","사이다","환타","스프라이트","망고주스","포도주스"};
		int[] menuPriceArr = {1000,1200,1300,1500,2000,3000};
		
		printMenu(menuNmArr, menuPriceArr);
		select(menuNmArr);
	}
	
	public static void printMenu2(String[] menuArr, int[] price) {
		String str = "<메뉴>\n";
		for(int i=0; i<menuArr.length; i++) {
			str += String.format("%d. %s (%,d원)\n", i+1, menuArr[i], price[i]);
		}
		System.out.println(str);
	}
	
	public static void printMenu(String[] menuArr, int[] price) { //printMenu1과 printMenu2의 차이점 확인
		System.out.println("<메뉴>");
		for(int i=0; i<menuArr.length; i++) {
			System.out.printf("%d. %s (%,d원)\n",i+1, menuArr[i], price[i]);
		}
	}
	
	public static void select(String[] menuArr) {
		System.out.print("선택 > ");
		int select = sc.nextInt();
		System.out.printf("%s를 선택하셨습니다.",menuArr[select-1]);
	}//asdasdasd
}
