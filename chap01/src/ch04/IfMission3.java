package ch04;

public class IfMission3 {
	public static void main(String[] args) {
		final int SCORE = (int)(Math.random() * 20) + 81;
		System.out.println("SCORE : " + SCORE);
		//SCORE값은 81~100점 사이의 값이 된다. (단, 실행할때마다 달라진다.)
		char hak = ' ';
		char sign = ' ';
		int nam = SCORE % 10;
		
		if(SCORE >90) {
			hak = 'A';
		}else if(SCORE >80) {
			hak = 'B';
		}else {
			hak = 'C';
		}
		
		if(nam >= 7 || nam == 0) {
			sign = '+';
		}else if(nam >= 4) {
			sign = ' ';
		}else{
			sign = '-';
		}
		
		System.out.printf("%c%c",hak,sign);
		
		//91~100 A (97점 이상은 "A+", 96~94 "A", 93~91 "A-")
		//81~90 B (87점 이상은 "B+", 86~84 "B", 83~81 "B-")
		//나머지 C
	}
}
