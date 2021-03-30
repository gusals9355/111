package ch04;

import java.util.Iterator;

public class ForMission9 {

	public static void main(String[] args) {
		int star = 5; //3~7랜덤값
		//star = 5
		// ____*
		// ___**
		// __***
		// _****
		// *****
		for(int i=0; i<star; i++) {
			for(int j=star-1; j>i; j--) {
				System.out.print("_");
			}
			for(int j=-1; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}