package ch06;

public class InheriExam {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.howling();
		cat.lick();
	}

}

class Animal extends Object{
	String name;
	int age;
	
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	void howling() {
		System.out.println("운다");
	}
}

class Cat extends Animal{
	
	Cat(){
		super("ㅁㄴㅇ", 4);
	}
	
	void lick() {
		System.out.printf("%s가 핥다\n",name);
	}
	
	@Override //부모의 메소드를 재정의해서 사용
	void howling() {
		System.out.println("야옹");
	}
}

class KoShort extends Cat{
	public KoShort() {
		super();
	}

	void pee() {
		System.out.printf("%s가 소변을 본다\n", name);
	}
}