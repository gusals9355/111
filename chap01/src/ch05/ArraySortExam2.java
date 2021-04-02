package ch05;

import java.util.Arrays;

public class ArraySortExam2 {

	public static void main(String[] args) {
		int[] arr = {8,7,3,1,6};
		int temp;
		
		for(int i=arr.length; i>0; i--) {
			for(int j=0; j<i-1; j++) {                  
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		
	}

}
