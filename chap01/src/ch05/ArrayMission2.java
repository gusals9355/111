package ch05;

public class ArrayMission2 {

	public static void main(String[] args) {
		//정수형 배열 생성 (10칸짜리)
		//1~10값이 순차적으로 대입
		//각방에 값을 출력
		//입출력은 분리하세요
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+1);
		}
	}

}
