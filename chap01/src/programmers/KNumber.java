package programmers;

import java.util.Arrays;

public class KNumber {
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = { {2, 5, 3}, {4, 4, 1}, {1, 7, 3} };
		
		System.out.println(Arrays.toString(solution(array, commands)));
	}
	public static int[] solution(int array[], int[][] commands) {
		int[] answer = new int[commands.length];
		
		for(int i=0; i<commands.length; i++) { // 
			int cnt= 0;
			int imsi[] = new int[commands[i][1] - commands[i][0] +1];
			for(int j=commands[i][0]; j<=commands[i][1]; j++) { // j시작위치부터 끝위치
				
				imsi[cnt] = array[j-1];
				cnt++;
			}
			
			Arrays.sort(imsi);
			answer[i] = imsi[commands[i][2]-1];
		}
		
		return answer;
		
	}
	
}

//임시로 담을 배열 하나를 생성함
//commands 배열 첫번째의 자를값을 가져옴 -> array배열 번째에 넣음
//commands 배열 두번째의 자를값까지를 가져옴 -> array배열 번째 까지 (for)
//임시배열에 잘라낸 값들을 넣고 정렬함
//commands 배열 세번째값을 가져와 임시 배열 번째를 리턴함
 
//2,5 4
//4,4 1
//1,7 7

