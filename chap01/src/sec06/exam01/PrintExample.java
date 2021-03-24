package sec06.exam01;

public class PrintExample {
	public static void main(String[] args) {
		System.out.println("하하");
		System.out.println("호호");
		System.out.println(); //개행
		System.out.print("하하");
		System.out.print("호호");
		System.out.println(); //개행
		System.out.print("하하");
		System.out.print("호호\n");
		System.out.print("하하");
		System.out.print("호호");
		System.out.println();
		
		char bloodType = 'O';
		int age = 10;
		float weight = 30.4f;
		String name = "홍길동";
		System.out.println("제 이름은 " + name + "이며, 나이는 : " + age + "살이고, 혈액형은 " + bloodType + "이고 몸무게는 " + weight + "kg입니다.");
		System.out.printf("제 이름은 %s이며, 나이는 %02d살이고, 혈액형은 %c형이고, 몸무게는 %010.2fkg입니다.\n", name, age, bloodType, weight);
		// %02d는 %d 앞에 2자리수 채우며 빈칸은 0으로 채움
		// %010.2f kg -> 10칸을 채우며 빈칸은 0으로 하고 소수점 아래는 2자리 수 까지 표현한다.
		char ch = 'a';
		System.out.printf("%d : %c", (int)ch, ch);
		// 'a'는 십진수로 표현했을 때 97이 나온다.
		
	}
}
