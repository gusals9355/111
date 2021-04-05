package ch05;

public class MethodMission8 {
	
	public static void main(String[] args) {
//		gugudan(9);
		//8*1 = 8
		//8*1 = 16
		//8*9 = 72
		
		gugudan(4,8);
		
	}
	
	public static void gugudan(int dan) {
		for(int i=1; i<10; i++) {
			System.out.println(dan+ " * " + i + " = " + dan*i);
		}
	}
	
	public static void gugudan(int dan1, int dan2) {
		for(int i=dan1; i<=dan2; i++) {
			gugudan(i);
			System.out.println();
		}
	}
}
