package ClassExample01;

public class UseObjectTest {
	
	// 반환값 (void)이 없으므로 return을 써줄 필요가 없음.
	// 호출되면 출력만 해주는 class.
	void printMsg() {
		System.out.println("Java 공부중");
		System.out.println("배고픕니다.");
		System.out.println("자고싶습니다.");
	}
	
	public static void main(String[] args) {
		UseObjectTest uot = new UseObjectTest();
		uot.printMsg();
	}

}
