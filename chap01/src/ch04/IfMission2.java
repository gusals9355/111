package ch04;

public class IfMission2 {
	//남자 평균키 : 175
	//여자 평균키 : 163
	public static void main(String[] args) {
		String gender = "여";
		int height = 162;
		
		if(gender.equals("남")) {
			if(height > 175) {
				System.out.println("남, " + height + " 평균 초과");
			}
			else if(height == 175) {
				System.out.println("남, " + height + " 평균");
			} else {
				System.out.println("남, " + height + " 평균 미만");
			}
		} else if(gender.equals("여")) {
			if(height > 163) {
				System.out.println("여, " + height + " 평균 초과");
			}
			else if(height == 163) {
				System.out.println("여, " + height + " 평균");
			} else {
				System.out.println("여, " + height + " 평균 미만");
			}
			
		}
		
	}

}
