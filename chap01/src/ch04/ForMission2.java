package ch04;

public class ForMission2 {

	public static void main(String[] args) {
		// 1~3 숫자를 더하시요.
		int sum = 0;
//		sum = sum + 1;
//		System.out.println("sum : " + sum);
//		
//		sum = sum + 2;
//		System.out.println("sum : " + sum);
//		
//		sum = sum + 3;
//		System.out.println("sum : " + sum);
		
		for(int i=1; i<21; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
