package programmers;

import java.util.HashMap;

public class Maraton {
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		System.out.println(solution(participant, completion));
	}
	
	public static String solution(String[] participant, String[] completion) {
		String answer ="";
		HashMap<Integer, String> map = new HashMap<Integer, String>(); //참가자명단
		
		for(int i=0; i<participant.length; i++)
			map.put(i,participant[i]);
		
		for(int i=0; i<completion.length; i++) {
			for(int j=0; j<participant.length; j++) {
				if(completion[i] == map.get(j)) {
					map.remove(j);
					break;
				}
			} answer = map.get(i);
		}return answer;
	}
}


//참가자 명단을 생성 (해쉬맵)
//해쉬맵에 참가자 명단을 넣음
//참가자랑 완주자를 비교하여 완주자는 해쉬맵에서 뺌
// 남은 값은 answer에 넣음