package ch06;

public class ConstructorExam { 
	//객체지향 언어는 모두 생성자를 사용한다.
	//생성자는 객체가 만들어질 때 무조건 호출을 해야한다.
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		tv1.brand = "Samsung";
		tv1.inch = 100;
		tv1.maxChannel = 200;
		tv1.maxVolume =  100;
		tv1.displayState();
		Tv tv2 = new Tv("Lg", 120, 300, 200);
		tv2.displayState();
	}
	
}

class Tv{
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;
	
	//기본 생성자
	//생성자 vs 메소드
	//생성자 이름은 클래스명과 같다
	//리턴 타입이 없다
	
	//생성자는 객체 생성할때만 사용할 수 있다.
	
	//기본생성자는 컴파일러가 생성자가 하나도 없을시 넣어준다.
	Tv(){
		
	}
	
	Tv(String brand, int inch, int maxChannel, int maxVolume){
		this.brand = brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
	}
	
	void volumeUp() {
		currentVolume++;
	}

	void displayVolume() {
		String str = String.format("현재 볼륨 : %d", currentVolume);
		System.out.println(str);
	}
	
	void displayState() {
		System.out.println(brand +" "+ inch+"inch " + maxChannel+"Channel " + maxVolume+"Volume");
	}
	
}