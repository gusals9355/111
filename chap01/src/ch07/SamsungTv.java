package ch07;

public class SamsungTv implements RemoteControl{
	private int sound=0;
	@Override
	public void chkVolume() {
		System.out.println("볼륨 : " + sound);
	}@Override 
	public void volumeDown() {
		sound-=2;
	}@Override
	public void volumeUp() {
		sound+=2;
	}
}
