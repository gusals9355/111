package ch04;

public class Exercise05 {

	public static void main(String[] args) {
		/* 중첩 for 이용하여 방정식 4x+5y=60의 모든 해를 구해서 (x,y)형태로 출력하세요
		 * 단, x,y는 10이하의 자연수입니다.
		 * 5,8
		 * 10,4
		 */
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				if(4*i + 5*j == 60) {
					System.out.println(i + "," + j);
					break;
				}
			}
		}
		
	}

}
