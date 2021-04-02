package ch05;

public class MethodExam {

	public static void main(String[] args) {
		int result = minus(20,10);
		System.out.println(result);
	}
	
	public static int sum(int n1, int n2) {
		return n1+n2;
	}
	
	public static int minus(int n1, int n2) {
		return n1-n2;
	}

}
