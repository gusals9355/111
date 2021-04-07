package ch06;

public class OverloadingExam {

	public static void main(String[] args) {
		Calc c1 = new Calc();
		c1.sum(5, 10);
		c1.sum(1, 2, 3);
		c1.sum(10, 20, "30");
		
	}

}


class Calc{
	//오버로딩 : 이름이 같아도파라미터값만 다르면됨
	void sum(int n1, int n2) {
		System.out.println(n1+n2);
	}
	void sum(int n1, int n2, int n3) {
		System.out.println(n1+n2+n3);
	}
	void sum(int n1, int n2, String n3) {
		System.out.println(n1+n2+n3);
	}
}