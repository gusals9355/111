package ch06;

public class StaticExam5 {

	public static void main(String[] args) {
		StaticExam5 s = new StaticExam5();
		s.n1=10;
		s.n2=20;
		System.out.println(s.sum());
	}
	
	int n1;
	int n2;
	public int sum() {
		return n1+n2;
	}
}