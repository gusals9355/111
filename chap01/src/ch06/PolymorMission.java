package ch06;

public class PolymorMission {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Pig pig = new Pig();
		Hamster hamster = new Hamster();
		
		cry(cat);
		cry(pig);
		cry(hamster);
		
	}
	
	public static void cry(Animal ani) {
		ani.howling();
	}

}

class Pig extends Animal{
	@Override //부모의 메소드를 재정의해서 사용
	void howling() {
		System.out.println("꿀꿀");
	}
}

class Hamster extends Animal{
	@Override //부모의 메소드를 재정의해서 사용
	void howling() {
		System.out.println("찍찍");
	}
}
