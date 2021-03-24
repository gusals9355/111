package programmers;

public class crane {
	public static void main(String[] args) {
		
	}
	
	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		int depth = board.length;
		int[] basket = new int[depth * depth +1] ; 
		
		for(int i=0; i<moves.length; i++) {
			for(int j=depth; j<0; j--)
			if(board[j][moves[i]] == 0) {
				
			}
		}
		
		return answer;
	}
}
