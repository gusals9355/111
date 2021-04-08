package ch06;

public class OverrideExam {

	public static void main(String[] args) {
		NumBox nb1 = new NumBox(10);
		NumBox nb2 = new NumBox(10);
		
		System.out.println("bn1 == bn2 : " + (nb1.equals(nb2)));
		
	}

}

class NumBox{
	private int num;
	
	NumBox(int num){
		this.num = num;
	}

	public int getNum() {
		return num;
	}
	@Override
	public boolean equals(Object obj) {
		NumBox temp = (NumBox)obj;
		
		return this.getNum() == temp.num;
	}
	
}
