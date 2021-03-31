package ch05;

public class ArrayMission {

	public static void main(String[] args) {
		//정수형 배열 생성 (10칸짜리)
		//모든방에 정수값 20을 세팅해주세요
		
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			arr[i] = 20;
		}
		for(int i=0; i<10; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
