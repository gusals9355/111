package ch07.starcraft;

public class StarcraftMain {
	public static void main(String[] args) {
		Medic medic1 = new Medic();
		Medic medic2 = new Medic();
		Marine marine = new Marine();
		SizTank tank = new SizTank();
		
		medic1.heal(medic1);
		medic1.heal(medic2);
		medic1.heal(marine);
		medic1.heal(tank);
		
		
		System.out.println("메딕1 hp : " + medic1.getCurrentHP());
		System.out.println("메딕2 hp : " + medic2.getCurrentHP());
		System.out.println("마린1 hp : " + marine.getCurrentHP());
	}
}
