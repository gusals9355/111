package ch04;

public class ForMission4 {

	public static void main(String[] args) {
		int dan = (int)(Math.random()*8)+2;
		//2~9사이의 랜덤값 추출
		//2*1 =2
		//2*2 =4
		//2*9 =18
		
		for(int i=6; i<15; i++) {
			int j= i-5;
			System.out.printf("%d * %d = %2d\n", dan, j, dan*j);
		}
	}

}