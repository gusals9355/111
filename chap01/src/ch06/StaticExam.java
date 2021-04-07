package ch06;

public class StaticExam {

	public static void main(String[] args) {
		Toy t1 = new Toy();
		Toy t2 = new Toy();
		
		t1.name = "디즈니";
		System.out.println("t1.name : " + t1.name);
		
		t2.name ="롯데"; //static을 사용한 멤버변수는
		Toy.name = "ㅁㄴㅇ"; //이렇게 클래스.name으로 사용하는 것이 맞다
		System.out.println("t2.name : " + t2.name);
		System.out.println("t1.name : " + t1.name);
		System.out.println("Toy.name : " + Toy.name);
	}

}

class Toy{
	static String name; //static 하나의 변수를 공유한다.
}
