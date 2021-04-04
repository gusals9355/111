package programmers;

public class Crane {
	public static void main(String[] args) {
		int board[][] = { {0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1} };
		int moves[] = {1,5,3,5,1,2,1,4};
		
		System.out.println(solution(board, moves));
	}
	
	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		int depth = board.length;
		int[] basket = new int[depth * depth +1] ; 
		int cnt=0;
		
		for(int i=0; i<moves.length; i++) { // 0~7까지 돔
//			moves[i]--;
			System.out.print("");
			for(int j=0; j<5; j++) {  
				if(board[j][moves[i]-1] > 0) { // 인형이 있을때
					basket[cnt] = board[j][moves[i]-1]; // 바구니[cnt]번째에 그 인형을 넣음
					board[j][moves[i]-1] = 0; // 인형을 뽑았다면 그 자리는 0으로바꿈
					cnt++; // 바구니 위치를 +1
					break;
				}
				if(cnt>1 && basket[cnt-1] != 0 ) {
					if(basket[cnt-1] == basket[cnt-2]) { //바구니에 방금 넣은 인형과 전에 있던 인형이 같다면
						basket[cnt-1] = 0;
						basket[cnt-2] = 0;
						cnt-=2;
						answer+=2;
					}
				}
			}
		}
		
		return answer;
	}

}