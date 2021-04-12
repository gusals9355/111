package ch07;

public class Car {
	public void hoot() {
		System.out.println("빵빵");
	}
}

class Bus extends Car{
	@Override
	public void hoot() {
		System.out.println("Bus");
	}

	public void openDoor() {
		System.out.println("문열다");
	}
}

class LocalBus extends Bus{
	@Override
	public void hoot() {
		System.out.println("LocalBus");
	}
}

class Truck extends Car{
	@Override
	public void hoot() {
		System.out.println("Truck");
	}
}