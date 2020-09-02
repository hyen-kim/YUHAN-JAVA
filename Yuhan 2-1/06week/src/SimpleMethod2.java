// 매개변수 있게 메소드 호출
public class SimpleMethod2 {
	// 접근제한자 리턴타입 메소드이름
	public static void printHead(char ch) {
		for (int i = 0; i < 15; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}


	public static void main(String[] args) {
		printHead('★'); // 메소드 호출
		System.out.println("Java Programming");
		printHead('☆');
		System.out.println("Learning Method");
		printHead('♡');
	}
}
