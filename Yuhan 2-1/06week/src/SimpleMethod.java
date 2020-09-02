// 매개변수 없게 메소드 호출
public class SimpleMethod {
	// 접근제한자 리턴타입 메소드이름
	public static void printHead() {
		System.out.println("===============================");
	}
	// 위에 static을 지우게 되면 error 발생

	public static void main(String[] args) {
		printHead(); // 메소드 호출
		System.out.println("Java Programming");
		printHead();
		System.out.println("Learning Method");
		printHead();
	}
}
