package ch07;

public class PolyExam {
	public static void main(String[] args) {
		Car car1 = new Bus();
		Car car2 = new Car();
		Car car3 = new LocalBus();
		
		Bus bus1 = (Bus) car1;
		bus1.openDoor();
		bus1.hoot();
		
		Car carP = bus1;
		carP.hoot();
		System.out.println("끝");
		
	}
}
