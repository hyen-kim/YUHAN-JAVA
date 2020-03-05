package ClassExample01;
// 싱글톤 : 단 하나의 객체만 만들도록 보장해야 하는 경우
// 클래스 외부에서 new 연산자로 생성자를 호출할 수 없도록 막아야함.
// private 접근 제한자를 붙여주면 된다.

public class ShopService {
	// 정적 필드
	private static ShopService singleton = new ShopService();
	
	// 생성자
	private ShopService() {}
	
	// 정적 메소드
	static ShopService getInstance() {
		return singleton;
		
	}
}
