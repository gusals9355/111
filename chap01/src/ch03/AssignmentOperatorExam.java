package ch03;

public class AssignmentOperatorExam {

	public static void main(String[] args) {
		int n1 = 0;
		n1 = n1 + 5;
		System.out.println("n1 : " + n1);
		
		int n2 = 0;
		n2 += 5; //복합식 계산
		System.out.println("n2 : " + n2);
		
		int n3 = 10;
		n3-=4;
		System.out.println("n3 : " + n3);
		
		int value = 356;
		System.out.println(value - value % 100);
		
		int top =5;
		int bottom = 10;
		int height = 7;
		double area = (top+bottom) *height / 2.0;
		System.out.println(area);
	}

}
