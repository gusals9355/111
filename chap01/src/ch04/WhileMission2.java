package ch04;

public class WhileMission2 {

	public static void main(String[] args) {
		int sum = 0;
		//val이 0이 아니면 계속 sum에 더해라
		while(true) {
			int val = (int)(Math.random()*11);
			System.out.println("val : " + val);
			if(val == 0) {
				break;
			}
			sum+=val;
		}
		System.out.println(sum);
	}

}
