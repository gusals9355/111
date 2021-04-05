package ch05;

import java.util.Arrays;

public class MethodMission9 {
	
	public static void main(String[] args) {
		int[] arr= {4,8,10,11,45};
		
//		System.out.println(Arrays.toString(arr));
		String result = toString(arr);
		System.out.println(result);
		
		//4,8,10,11,45
	}
	
//	public static String toString(int[] arr) {
//		String result="[";
//		for(int i=0; i<arr.length; i++){
//			if(i==arr.length-1) result += arr[i] +"]";
//			else result +=arr[i]+",";
//		}
//		return result;
//	}
	public static String toString(int[] arr) {
		String result="";
		for(int i=0; i<arr.length; i++){
			if(i!=0) result += ", ";
			result +=arr[i];  // int형을 String으로 바꾸는 방법 integer.toString(값);
		}
		return String.format("[%s]", result);
	}
}
