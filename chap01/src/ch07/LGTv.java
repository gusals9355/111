package ch07;

public class LGTv implements RemoteControl{
	private int volume;
	@Override
	public void chkVolume() {
		System.out.println("볼륨 : " + volume);
	}@Override
	public void volumeDown() {
		volume--;
	}@Override
	public void volumeUp() {
		volume++;
	}
}
