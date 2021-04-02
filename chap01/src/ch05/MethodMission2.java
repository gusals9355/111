package ch05;
public class MethodMission2 {

	public static void main(String[] args) {
		double result = divide(10, 3);
		System.out.println("result : " + result); // 3.33333;
		
		result = divide(10, 5);
		System.out.println("result : " + result); // 2.0;
		
		System.out.println("절대값 : " + abs(5)); // 10
		System.out.println("절대값 : " + abs(-5)); // 10
	}
	
	 public static double divide(int n1, int n2) {
		 return (double) n1 / n2;
	 }	
	 
	 public static int abs(int n1) {
		 if (n1 < 0) {
			 return Math.abs(n1);
		 }
		 return n1;
	 }	
}
