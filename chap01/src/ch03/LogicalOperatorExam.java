package ch03;

public class LogicalOperatorExam {
	public static void main(String[] args) {
		// &&(and), ||(or), !(not) 논리 연산자 
		
		boolean res1 = (1<7) && true && true;  // 셋다 true여야 true. 하나라도 false면 false임
		System.out.println("res1 : " + res1);
		
		boolean res2 = (10>2) || false || false; // 셋중 하나라도 true면 트루  !!! 지금 || 상황에서 하나라도 true이기 때문에 (10>2)만 연산하여 true이기 떄문에 뒤의 내용을 계산하지않는다.
		System.out.println("res2 : " + res2);
		
		System.out.println("res2 : " + !res2);
	}
}
