package programmers;

import java.util.Arrays;
import java.util.Iterator;

public class PracticeTest {

	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(solution(answers));
	}
	
	public static int[] solution(int[] answers) {
		int[] answer = {};
		int[] one = {1,2,3,4,5};  //5
		int[] two = {2,1,2,3,2,4,2,5};  //8
		int[] three = {3,3,1,1,2,2,4,4,5,5}; //10
		int[] cnt = new int[3]; // 점수  0 1 2
		
		for(int i=0; i<answers.length; i++) {
			
			if(answers[i] == one[i%5]) 
				cnt[0]++;
			if(answers[i] == two[i%8])
				cnt[1]++;
			if(answers[i] == three[i%10])
				cnt[2]++;
		}
		int max = getMax(cnt);
		
		if(max == cnt[0]) {
						//max와 수포자1,2,3을 비교하여 answer[i]에 넣음
		}
		
		
		return answer; //젤 많이 맞은사람들
	}
	
	public static int getMax(int[] cnt) {
		int max=0;
		
		Arrays.sort(cnt);
		max=cnt[2];
		
		return max;
	}

}
