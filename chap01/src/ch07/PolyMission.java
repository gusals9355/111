package ch07;

public class PolyMission {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Bus();
		Car car3 = new LocalBus();
		Car car4 = new Truck();
		
		blowKlaxon(car1);
		blowKlaxon(car2);
		blowKlaxon(car3);
		blowKlaxon(car4);
		//넘어간 값이 Bus와 LocalBus라면 opendoor만 실행
		// 그외는 hoot 메소드 호출
		
	}
	
	public static void blowKlaxon(Car c) {
		if(c instanceof Bus) {
//			Bus b = (Bus)c;
//			b.openDoor();
			((Bus)c).openDoor();
			return;
		}else {
			c.hoot();
		}
	}
}
