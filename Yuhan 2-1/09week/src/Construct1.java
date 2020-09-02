// 인수가 없는 생성자
public class Construct1 {
	//필드
	int k;
	// 생성자
	public Construct1() {
		k = 10;	// k라는 필드의 값을 초기화
		System.out.println("생성자 : 필드 k의 값을 " + k + "로 설정함");
	}
	
	public static void main(String[] args) {
		Construct1 C;	// Construct1를 찾아서 주기억메모리에 적재시킴
		C = new Construct1(); // 메모리에 적재해놓고 필드 k를 10으로 초기화
		System.out.println("생성된 객체의 변수 k의 값은 " + C.k + "입니다.");
	}
}
