package ch05;
public class MethodMission6 {
	//중복된 소스 최대한제거
	//메소드 재활용
	public static void main(String[] args) {
		int score = getRandomScore(50,100); // 50~ 100사이 랜덤숫자 나오도록
		char grade = getGrade(score);
		//90점 이상 'A'
		//80점 이상 'B'
		//70점 이상 'C'
		//60점 이상 'D'
		//나머지 'E'
		char grade2 = getGrade2(score);
		// ?8이상이거나 100이면 +
		// ?3이하이면 -
		// 나머지는 ' '
		
		System.out.printf("%d : %c%c\n", score, grade, grade2);
	}
	
	public static int getRandomScore(int n1, int n2) {
		return (int)(Math.random()*(n2-n1)+1)+n1;
	}
	
	public static char getGrade(int score) {
		if(score >= 90) return 'A';
			else if(score >=80) return 'B';
			else if(score>=70) return 'C';
			else if(score>=60) return 'D';
		return 'E';
	}
	
	public static char getGrade2(int score) {
		if(score==100 || score%10 >=8) return '+';
		if(score%10 <= 3) return '-';
		return ' ';
	}
}
