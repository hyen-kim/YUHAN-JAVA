// 인수가 있는 생성자
public class Construct2 {
	int k;
	// 매개변수를 갖음
	public Construct2(int n) {
		k = n;
		System.out.println("생성자 : 필드 k의 값을 " + k + "로 설정함");
	}
	
	public static void main(String[] args) {
		Construct2 C1, C2;	// 객체 C1, C2 생성
		// 객체를 생성할 때 서로 다른 값을 생성 -> 10
		// C1에 n에 10을 넣고 k에 10을 적재하는 방식
		C1 = new Construct2(10);
		// 객체를 생성할 때 서로 다른 값을 생성 -> 20
		C2 = new Construct2(20);
		// 힙이라는 영역에 생성
		
		System.out.println("생성된 객체 C1의 변수 k의 값은 " + C1.k + "입니다.");
		System.out.println("생성된 객체 C2의 변수 k의 값은 " + C2.k + "입니다.");
	}
}
