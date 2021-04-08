package ch06;

public class StaticExam4 {

	public static void main(String[] args) {
		//CalcInstance2 객체화
		//num1 = 10, num2 = 20;
		//더한 값 출력
		CalcInstance2 ci = new CalcInstance2();
		ci.num1=10;
		ci.num2=20;
		System.out.println(ci.sum());
	}

}

class CalcStatic2{
	static int num1;
	static int num2;
	static int sum() {
		return num1 + num2;
	}
}

class CalcInstance2{
	int num1;
	int num2;
	int sum() {
		return num1+num2;
	}
	
	static int sum(int n1, int n2) {
		return n1 + n2;
	}
}