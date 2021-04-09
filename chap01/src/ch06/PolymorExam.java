package ch06;

public class PolymorExam {

	public static void main(String[] args) {
		Animal ani_1 = new Cat(); //타입은 animal로 받지만 주소는 cat의 주소를 받는다.
//		Cat cat1 = new Animal(); //자식이 부모를 가르킬 순없다
//		Cat cat2 = (Cat)new Animal("", 0); x 강제로 형변환해도 부모 객체는 담을 수 없다.
		Cat cat = (Cat) ani_1;
		Animal ani_2 = cat;
		
		ani_1.howling(); //부모의 howling메소드를 호출했지만 오버라이딩된 Cat의 howling이 호출됨.
						// 호출된 메소드의 기준은 객체이다/.
//		ani_1.lick();
		
		
		System.out.println("끝");
		
		
	}

}
