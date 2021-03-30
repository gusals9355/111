package ch04;

public class ForMission5_1 {

	public static void main(String[] args) {
		//2*1=2 3*1=3 4*1=4
		//9*1=9 9*2=18 9*3=27
		//구구단 전체 출력
		for(int j=1; j<10; j++) {
			for(int i=2; i<10; i++) {
				System.out.printf("%d*%d=%2d\t", i, j, i*j);
			}
			System.out.println();
		}
		
	}
}