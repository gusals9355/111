package ch06;

public class PolymorExam2 {
/*
 * 1.부모 타입은 자식 객체 주소값을 참조 할 수 있다.(가르킬 수 있다.)
 * 2.자식 타입은 부모 객체 주소값을 참조 할 수 없다.
 * 3.
 */
	public static void main(String[] args) {
		Animal ani1 = new Hamster("");
		Animal ani2 = new Animal();
		Hamster ham = (Hamster)ani1; //ani2일땐 에러가 터짐
		
		System.out.println("끝");
	}

}
