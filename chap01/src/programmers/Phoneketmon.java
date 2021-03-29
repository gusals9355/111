package programmers;

import java.util.HashSet;

public class Phoneketmon {

	public static void main(String[] args) {
		int[] nums = {2,2,2,2,8,8,8,8};
		System.out.println(solution(nums));
		
	}
	public static int solution(int[] nums) {
		int cnt = 0;
		HashSet<Integer> set = new HashSet<Integer>();
		int[] myInven = new int[nums.length/2];
		
		
		for(int i=0; i<nums.length; i++) {
			if(set.add(nums[i])) {
				myInven[cnt] = nums[i];
				cnt++;
				if(cnt == myInven.length)
					break;
			}
		}
		
		return set.size();
	}
}
