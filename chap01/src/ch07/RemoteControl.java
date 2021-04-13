package ch07;

public interface RemoteControl {
	//추상 클래스 vs	 인터페이스
	//부모 타입역할		 부모 타입역할
	//강제성 부여		 강제성 부여
	//   자식한테 추상메소드오버라이딩 
	//객체화 불가능		 객체화 불가능
	//----------------------------
	//다중상속X       	 다중상속O
	//변수O		 	 변수X
	//상수O		 	 상수만O
	//구현부 있는메소드O  구현부있는메소드X
	//추상메소드O       추상메소드만O
	
	int AGE = 10; //자동으로 public final static이 붙는다.
	abstract void volumeUp(); //public abstract이 들어감
	void volumeDown(); 
	void chkVolume();
}
