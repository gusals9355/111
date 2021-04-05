package ch05;

import java.util.*;

public class MethodMission7 {
	final static int MALE_STAND = 175;
	final static int FEMALE_STAND = 163;
	//남 평균키 : 175
	//여 평균키 : 163
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = null;
		
		do {
			System.out.print("성별 : ");
			String gender = sc.next(); //남 또는 여만 받음
			System.out.print("키 : ");
			int height = sc.nextInt();
			//구현할곳
			String result = chk(gender, height);
			//성별 : 남, 키:170cm, 평균 미만
			//성별 : 여, 키:163cm, 평균
			System.out.println(result);
			System.out.print("계속하시겠습니까? (y, n)");
			answer=sc.next();
		} while(answer.equals("y"));
		System.out.println("끝");
		sc.close();
	}
	
	public static String chk(String gender, int height) {
		int ave = MALE_STAND;
		
		String result = "평균 이하";
		
		if(gender.equals("여")) ave=FEMALE_STAND;
		if(ave<height) result="평균 이상";
		else if(ave==height) result="평균";
		return String.format("성별: %s, 키: %dcm, %s", gender, height, result); //문자열을 만드는게 목적인 String.format
																			  //system.out.print는 콘솔에 찍는것이 목적
	}
}
