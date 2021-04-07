package ch06;

public class CapsuleExam2 {
	public static void main(String[] args) {
		
		Human1[] h = new Human1[4];
		
		h[0] = new Human1(); //name:미상, age:10
		h[1] = new Human1("평강공주"); 
		h[2] = new Human1(30); 
		h[3] = new Human1("이순신",20); 
		
		for(Human1 human1 : h)
			human1.print();
	}
}

class Human1{
	private int age;
	private String name;
	
	Human1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	Human1(String name) {
		this(name, 10);
	}
	Human1(int age) {
		this("미상", age);
	}
	Human1() {
		this("미상",10);
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
	public void print() {
		System.out.printf("내 이름은 %s 나이는 %d살입니다.\n", getName(), getAge());
	}
}