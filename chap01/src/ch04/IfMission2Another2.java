package ch04;

import java.util.HashMap;

public class IfMission2Another2 {
	//남자 평균키 : 175
	//여자 평균키 : 163
	public static void main(String[] args) { // 실무에선 이렇게 써야한다.
		String gender = "남";
		int height = 175;
		String displayGender = "남자", displayResult = "평균";
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		final int MAN_STAND = 175;
		final int WOMAN_STAND = 163;
		int stand = MAN_STAND;
		
//		map.put("남", MAN_STAND);
//		map.put("여", WOMAN_STAND);
//		
//		if(height < map.get(gender)) {
//			System.out.println(gender + " 평균 미만");
//		}
		
		if(gender.equals("여")) {
			stand = WOMAN_STAND;
			displayGender = "여자";
		}
		if(height < stand) {
			displayResult = "평균 미만";
		} else if(height > stand) {
			displayResult = "평균 초과";
		}
		
		System.out.printf("%s %d %s", displayGender, height, displayResult);
		
	}

}


