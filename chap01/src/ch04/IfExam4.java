package ch04;

public class IfExam4 {

	public static void main(String[] args) {
		//삼항식 조건식 ? true : false;
		System.out.println(abs(-10));
		System.out.println(abs(10));
	}

	public static int abs(int val) {
		return val < 0 ? -val : val;
	}
	//MethodMission2에 있는 abs랑 비교
}


