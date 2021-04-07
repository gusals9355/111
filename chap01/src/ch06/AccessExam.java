package ch06;

public class AccessExam {

	public static void main(String[] args) {
		Access ac = new Access();
		ac.printNum();
	}

}

class Access{
	private int num;
	protected int num1;
	
	void printNum() {
		System.out.println(num);
	}
}