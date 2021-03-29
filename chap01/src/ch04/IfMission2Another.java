package ch04;

public class IfMission2Another {
	//남자 평균키 : 175
	//여자 평균키 : 163
	public static void main(String[] args) {
		String gender = "남";
		int height = 175;
		final int MAN_STAND = 175;
		final int WOMAN_STAND = 163;
		int stand = MAN_STAND;
		
		if(gender.equals("여")) {
			stand = WOMAN_STAND;
		}
		
		if(height < stand) {
			System.out.println("평균 미만");
		} else if(height == stand) {
			System.out.println("평균");
		} else {
			System.out.println("평균 초과");
		}
			
			
		
	}

}
