package ch05;
public class MethodMission5 {
	//중복된 소스 최대한제거
	//메소드 재활용
	public static void main(String[] args) {
		int star = 5;
		printStarTri(star);
		// *
		// **
		// ***
		// ****
		// *****
		System.out.println();
//		star = 3;
//		printStarTri(star);
	
	}
	
	public static void printStarLine(int star) {
		for(int i=0; i<star; i++) {
			System.out.print("*");
		}
	}
	
	public static void printStarSqure(int star) {
		for(int i=0; i<star; i++) {
			printStarLine(star);
			System.out.println();
		}
	}
	
	public static void printStarTri(int star) {
		for(int i=1; i<=star; i++) {
			printStarLine(i);
			System.out.println();
		}
		
	}
}
