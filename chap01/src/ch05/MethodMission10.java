package ch05;

import java.util.Scanner;

public class MethodMission10 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Drink[] drinkArr = new Drink[6];
		
		printMenu3(drinkArr);
		
		boolean run = true;
		while(run) {
			System.out.print("선택 > ");
			int selectedNum = sc.nextInt();
			//객체 지향 배우고 다시 start
		}
		System.out.println("끝");
	}
	
	public static void printMenu3(Drink[] drinkArr) {
		String[] menuNmArr = {"콜라","사이다","환타","스프라이트","망고주스","포도주스"};
		int[] menuPriceArr = {1000,1200,1300,1500,2000,3000};
		
		for(int i=0; i<drinkArr.length; i++) {
			Drink drink = new Drink();
			drink.nm = menuNmArr[i];
			drink.price = menuPriceArr[i];
			
			drinkArr[i] = drink;
		}
		System.out.println("<메뉴>");
		for(int i=0; i<drinkArr.length; i++) {
			Drink drink = drinkArr[i];
			System.out.printf("%d. %s (%,d원)\n",i+1, drink.nm, drink.price);
		}
	}
	
	public static void printMenu2(String[] menuArr, int[] price) {
		String str = "<메뉴>\n";
		str+= "0. 종료\n";
		for(int i=0; i<menuArr.length; i++) {
			str += String.format("%d. %s (%,d원)\n", i+1, menuArr[i], price[i]);
		}
		System.out.println(str);
	}
	
//	public static void printMenu(String[] menuArr, int[] price) { //printMenu1과 printMenu2의 차이점 확인
//		System.out.println("<메뉴>");
//		for(int i=0; i<menuArr.length; i++) {
//			System.out.printf("%d. %s (%,d원)\n",i+1, menuArr[i], price[i]);
//		}
//	}
}
