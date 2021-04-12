package sec06.ch07;

public abstract class Animal { 
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void howling(); // 추상메소드 , 추상메소드가 있다면 클래스앞에서 abstract을 붙인다.
	
	public void breath() { //추상메소드와 일반메소드가 같이 있다면 추상클래스이고, 추상메소드 하나만 있으면 인터페이스이다.
		System.out.println("숨쉰다");
	}
}

class Cat extends Animal{
	@Override
	public void howling() {
		System.out.println("야옹");
	}
}

class Dog extends Animal{
	@Override
	public void howling() {
		System.out.println("멍멍");
	}
}