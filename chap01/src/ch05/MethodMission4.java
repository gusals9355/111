package ch05;
public class MethodMission4 {

	public static void main(String[] args) {
		
		int rNum = getRandomNum(); // 0~9
		System.out.println(rNum); //
		
		System.out.println(getRandomNum(20));
		
		System.out.println(getRandomNum(5, 10));  //5~10
	}
	
	public static int getRandomNum(int max) {
		int random =(int)(Math.random()*max);
		
		return random;
	}
	
	public static int getRandomNum(int min, int max) {
		
		if(min>max) {
			int temp = max;
			max = min;
			min = temp;
		}
		int random = (int)(Math.random()*(max-min))+min;
		return random;
	}
	
	public static int getRandomNum() {
		return (int)(Math.random()*10);
	}
}
//git test