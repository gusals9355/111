package ch06;

public class PolymorMission {

	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal pig = new Pig();
		Animal hamster = new Hamster("햄스터");
		//새롭게 햄스터 객체 만들지 않고, 저장된 주소값을 활용하여 runRail 메소드 호출
		Hamster ham = (Hamster)hamster; //타입을 햄스터로 변형하여 메소드 호출하면된다.
//		ham.runRail();
		
		System.out.println(hamster instanceof Hamster); // hamster가 Hamster로 형변환 가능하냐
		System.out.println(pig instanceof Hamster); // 가능하다면 true 불가능하면 false
		
		cry(cat);
		cry(pig);
		cry(hamster);
		
		//cry메소드에 (햄스터)가 들어온다면 howling()을 호출하지말고 runRail()호출해라
		
	}
	
	public static void cry(Animal ani) {
		if(ani instanceof Hamster) { //Animal타입 ani가 Hamster타입으로 형 변환 가능하다면
			((Hamster) ani).runRail();
		}
		else ani.howling();
	}

}

class Pig extends Animal{
	@Override //부모의 메소드를 재정의해서 사용
	void howling() {
		System.out.println("꿀꿀");
	}
}

class Hamster extends Animal{
	String name;
	
	Hamster(String name){
		this.name = name;
	}
	
	public void runRail() {
		System.out.println(name + " : 쳇바퀴를 굴린다.");
	}
}
