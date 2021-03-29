package ch04;

public class IfMission2_2 {
	//남자 평균키 : 175
	//여자 평균키 : 163
	public static void main(String[] args) {
		String gender = "남";
		int height = 176;
		final int MAN_AVERAGE = 175;
		final int WOMAN_AVERAGE = 163;
		int gender_average = MAN_AVERAGE;
		
		if(gender.equals("여")) {
			gender_average = WOMAN_AVERAGE;
		}
		
		if(height > gender_average) {
			System.out.println(gender + height + " 평균 초과");
		} else if(height == gender_average) {
			System.out.println(gender + height + " 평균");
		} else {
			System.out.println(gender + height + " 평균 미만");
		}
		
	}

}
