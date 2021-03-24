package ch03;

public class OperaterExam2 {
	public static void main(String[] args) {
		//증감 연산자
		int n1 = 10;
		System.out.println("n1 : " + n1);
		n1++;
		System.out.println("n1 : " + n1);
		++n1;
		System.out.println("n1 : " + n1);
		--n1;
		System.out.println("n1 : " + n1);
		--n1;
		System.out.println("n1 : " + n1);
		n1--;
		System.out.println("n1 : " + n1);
		
		System.out.println("-----------------");
		
		int n2 = 10;
		int result = 10 + (++n2);
		System.out.println("n2 result : " + result);
		System.out.println("n2 : " + n2);
		
		int n3 = 10;
		int result2 = 10 + (n3++);
		System.out.println("n3 result2 : " + result2);
		System.out.println("n3 : " + n3);
		
		//논리 부정 연산자 (!)
		boolean result3 = 10 > 2;
		System.out.println("result3 : " + !result3);
	}
}
