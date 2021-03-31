package ch04;

public class LabelLoopExam {

	public static void main(String[] args) {
		OUTER:
		for(int i=0; i<3; i++) {
			for(int j=100; j<105; j++) {
				System.out.printf("%d - %d \n",i,j);
				
				if(j==102) {
					break OUTER;
				}
			}
		}
		
	}

}
