package ch05;

public class MethodExam2 {

	public static void main(String[] args) {
		int n1=10, n2= 30;
		
		voidSum(n1, n2);
		voidSum(1, 2);
		System.out.println("------");
		
		int result = intSum(n1, n2);
		System.out.println("result-1 : " + result);
		result = intSum(1, 2);
		System.out.println("result-2 : " + result);
		
		for(int i=0; i<100; i++) {
			hello();
		}
	
	}
	public static void hello() {
		System.out.println("안녕하세요!!");
	}
	public static void voidSum(int n1, int n2) {
		System.out.printf("%d + %d = %d\n", n1,n2,(n1+n2));
	}
	public static int intSum(int n1, int n2) {
		return n1+n2;
	}
}
