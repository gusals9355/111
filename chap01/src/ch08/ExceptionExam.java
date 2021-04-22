package ch08;

public class ExceptionExam {
	public static void main(String[] args) {
		try {
			int result = 10/0 ;
			System.out.println("result: " + result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("무조건 실행");
		}
		System.out.println("끝");
	}
}
