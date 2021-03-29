package ch04;

public class SwitchMission2 {

	public static void main(String[] args) {
		String pos = "과장";
		
		//pos 값이 부장이면 700만원
		//pos 값이 과장이면 500만원
		//나머지 값이면 
		System.out.println(pos);
		
		switch(pos) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
		}
	}

}
