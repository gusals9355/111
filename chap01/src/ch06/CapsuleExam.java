package ch06;

public class CapsuleExam {
	public static void main(String[] args) {
		Human h1 = new Human();
		//나이는 12, 이름은 홍길동
		Human h2 = new Human();
		//h2나이는 20 이름은 신사임당
		h1.setName("홍길동");
		h1.setAge(12);
		h2.setAge(20);
		h2.setName("신사임당");
		
		h1.whoAmI();
		h2.whoAmI();
	}
}

class Human{
	final static String NAME = "미상";
	final static int AGE = 10;
	private int age;
	private String name;
	
	Human(String name, int age){
		this.age = age;
		this.name = name;
	}
	Human() {
		this(NAME, AGE);
	}
	Human(String name){
		this(name, AGE);
	}
	Human(int age){
		this(NAME, age);
	}
	
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
	
	public void whoAmI() {
		System.out.printf("내 이름은 %s 나이는 %d살입니다.\n", getName(), getAge());
	}
	
	
	//private 멤버변수를 건들일수있는방법
	//1. 생성자
	//2. 메소드
	//setter, getter
	
}