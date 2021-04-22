package ch08;

public class ExceptionExam3 {
	public static void main(String[] args) {
		Calc1 c = new Calc1();
		System.out.println((int)c.div(10, 3));
	}
}

class Calc1{
	float div(int n1, int n2) {
		try {
			return n1 / n2;
		} catch (Exception e) {
			System.out.println("예외발생");
		} finally {
			System.out.println("무조건 실행");
		}
		return 0;
	}
}