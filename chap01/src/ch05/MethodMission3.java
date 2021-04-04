package ch05;
public class MethodMission3 {

	public static void main(String[] args) {
		sumAllFromTo(5, 10); // 5~10까지 더한 결과값
		sumAllFromTo(2, 4); // 5~10까지 더한 결과값
		sumAllFromTo(1, 100); // 5~10까지 더한 결과값
		
		
	}
	public static void sumAllFromTo(int n1, int n2) {
		int sum=0;
		for(int i=n1; i<=n2; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
}
