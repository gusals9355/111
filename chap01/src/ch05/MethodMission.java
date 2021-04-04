package ch05;

import java.util.TreeSet;

public class MethodMission {

	public static void main(String[] args) {
		whoIsBig(10, 30); //콘솔에 30이 가장 큽니다
		whoIsBig(10, 9); //콘솔에 10이 가장 큽니다
		whoIsBig(11, 25); //콘솔에 25이 가장 큽니다
		
		int[] n1 = { 50,80,10,2};
		whoIsBig(n1); //콘솔에 25이 가장 큽니다
		
		System.out.println("---------------");
		
		int big = getBigNum(10,30);
		System.out.println("big : " + big);
		big = getBigNum(10,9);
		System.out.println("big : " + big);
	}
	
	public static void whoIsBig(int n1, int n2) {
		int max = n1;
		
		if(max < n2) max = n2;
		System.out.println(max + "이 가장 큽니다");
	}
	
	
	public static void whoIsBig(int n1[]) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		for(int i : n1) {
			tree.add(i);
		}
		System.out.println(tree.last());
		
	}
	
	public static int getBigNum(int n1, int n2) {
		int max = n1;
		
		if(max < n2) max= n2;
		return max;
	}
}
