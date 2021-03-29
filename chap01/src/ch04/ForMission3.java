package ch04;

public class ForMission3 {

	public static void main(String[] args) {
		int star = (int)(Math.random()*6)+5;
		
		System.out.println("star : " + star);
		//star는 5~10사이 랜덤값
		//star가 5였다면 콘솔에 *****
		//star가 8이엿다면 ********
		
		for(int i=0; i<star; i++) {
			System.out.print("*");
		}
	}

}
