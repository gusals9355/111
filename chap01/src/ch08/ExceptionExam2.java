package ch08;

public class ExceptionExam2 {
	public static void main(String[] args) {
		Calc c = new Calc();
		try {
			System.out.println(c.div(10, 0));
		} catch (Exception e) {
			System.out.println("오류");
		}
	}
}

class Calc{
	int div(int n1, int n2) throws Exception {
		return n1 / n2;
	}
}