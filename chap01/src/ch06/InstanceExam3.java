package ch06;

public class InstanceExam3 {
	public static void main(String[] args) {
		int mainNum = 10;
		
		Box box = new Box();
		box.num = 10;
		
		changeNum(mainNum);
		System.out.println(mainNum);
		changeBoxNum(box);
		System.out.println(box.num);
		
	}
	
	public static void changeNum(int num) { //mainNum과 int num은 다르다
		num = 20;
	}
	
	public static void changeBoxNum(Box box) { //매개변수 box와 main메소드의 box는 다르지만 같은 주소값을 가진다.
		box = new Box();
		box.num = 20;
	}
}

class Box{
	int num;
}