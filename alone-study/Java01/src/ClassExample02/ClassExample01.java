package ClassExample02;

public class ClassExample01 {
	// main
	public static void main(String[] args) {	
		/* < 객체의 생성과 사용 >
		 * new : .을 사용하여 멤버변수와 메소드에 접근
		 * 메모리 생성은 하지만 메모리 해제하는 기능은 만들지 않았음
		 * -> 자바에서는 자동으로 메모리를 해제해줌.
		 * 
		 * */
		
		Book JavaBook = new Book();
		JavaBook.SetTitle("Java Programming");
		System.out.println("Book Title : " + JavaBook.GetTitle());
	}
}

/*
 * (1) 클래스 형식			<-- struct(구조체)의 확장형
 * class 클래스명 {
 * 		// field, constructor, 
 * 		// method declarations
 * }		
 * ⓛ 첫문자는 대문자로 하는 것이 관례.
 * 
 * 멤버변수(멤버함수), 필드   : 클래스 안에 선언된 변수
 * 메소드(method) 	   : 클래스 안에 선언된 함수 
 * 
 * */

// class <-- 왠만하면 class는 하나의 파일로 작성
class Book{
	/*
	 * (2) 멤버변수 또는 필드 형식
	 * - 공용변수 
	 * - 전역 변수와 유사한 속성 -> 클래스 안에서만
	 * -> 전역 변수의 값은 프로그램이 종료되기 전까지 살아있음
	 * - 객체 속성은 곧 멤버변수이다.
	 * -> 객체가 어떤 값을 저장하고 읽어오냐에 따라 속성을 정의
	 * */

	// Book에 대한 속성 -> 멤버변수 (m_ : 멤버변수라고 구분하기 위해)
	String m_strTitle;		// 책 제목
	int m_nPage;			// 페이지
	String m_strPublisher;	// 출판사
	int m_nPrice;			// 가격
	
	/* (3) 메소드 형식
	 * - 일반 함수 형태와 같다.
	 * */
	void SetTitle(String strTitle) {
		// Set : 외부로 부터 값을 받아서 클래스의 내부에 값을 넣음
		m_strTitle = strTitle;
	}
	String GetTitle() {
		// Get : 멤버 변수의 값을 읽어올 때
		return m_strTitle;
	}
}
