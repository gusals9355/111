package sec06.exam01;
/*
 *  정수 모두 정리(4가지
 *  
 */
public class IntExample {
	public static void main(String[] args) {
		char c = 'a';
		
		byte b = 10; 
		short s = 20;
		int i = 30;
		long l = 40;
		
		//자동형변환
		s = b;
		s = (short)i; //문제가 될 경우에는 안쓰거나 강제 형변환해야함
	}
}
