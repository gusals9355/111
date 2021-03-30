package ch04;

public class ForMission8 {

	public static void main(String[] args) {
		int star = (int)(Math.random()*5)+3; //3~7랜덤값
		//star = 3
		// ***
		// **
		// *
		System.out.println("star : " + star);
		
		for(int i=0; i<star; i++) {
			for(int j=star; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}