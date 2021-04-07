package ch06;

public class VariadiArgumentsExam {

	public static void main(String[] args) {
		Calc2 cal = new Calc2();
		System.out.println(cal.sum(new int[] {10,20}));
		System.out.println(cal.sum(10, 20));
		System.out.println(cal.sum(10, 20,5050));
		System.out.println(cal.sum(10, 20,20,20,20,20,20,20,50));
	}

}

class Calc2 {
	int sum(int... vals) { //가변 인자 여러개 사용가능함 배열로 넘어가게 된다
		int sum=0;
		for(int i=0; i<vals.length; i++) {
			sum+=vals[i];
		}
		return sum;
		
	}
}