package ch04;

public class ForMission5 {

	public static void main(String[] args) {
		//2~9 구구단 출력
		//2*1=2
		//2*9=18
		//빈칸
		//9*1=9
		//9*9=81
		
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %2d\n", i, j, i*j);
			}
			System.out.println();
		}
	}

}