package ch04;

public class SwitchMission3 {

	public static void main(String[] args) {
		int season = (int)(Math.random()*12)+1;
		System.out.println(season + "월");
		//math.random()메소드를 이용하여
		// 1~12 범위값만 나오게 처리
				
		// 3~5이면 봄
		// 6~8이면 여름
		// 9~11이면 가을
		// 12~1,2이면 겨울
		switch(season /3) {
		case 1:
			System.out.println("봄");
			break;
		case 2:
			System.out.println("여름");
			break;
		case 3:
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
		}
	}

}
