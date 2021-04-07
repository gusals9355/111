package ch06;

public class ConstructorExam2 { 
	public static void main(String[] args) {
		Tv2 tv = new Tv2();
		tv.displayState();
		//일렉트로 50inch 100Channel 50Volume
	}
	
}

	
class Tv2{
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;
	
	Tv2(){
		//생성자 안에서 다른 생성자 호출가능
		this("일렉트로", 50, 100, 50);
//		brand = "일렉트로";
//		inch = 50;
//		maxChannel = 100;
//		maxVolume = 50;
	}
	
	Tv2(String brand, int inch, int maxChannel, int maxVolume){
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