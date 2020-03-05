
package ClassExample02;

/*
 * < 접근 제어자 >
 * - private : 클래스 안에서만 접근 가능
 * -> 외부(클래스밖)에서 접근할 수 없음 -> 멤버변수나 멤버함수에 붙임.
 * - public : 전체에서 접근 가능
 * - protected : 같은 클래스와 패키지 그리고 하위 클래스에 접근 가능
 * - friendly 또는 생략된 제어자 : 같은 클래스와 패키지 안에서만 접근 => 거의 쓰이지 X
 * */

public class ClassExample02 {
	/*
	 * ① 접근제어자 데이터형 변수명;
	 * public int m_nVar;
	 * 
	 * ② 접근제어자 리턴형 함수명();
	 * private int GetVar(){
	 * 		return m_nVar;
	 * }
	 * */

	// 값을 넣을 때 : Set
	// 값을 가져올 때 : Get
	
	public static void main(String[] args) {
		Book02 JavaBook = new Book02();
	}
}

class Book02{
	String m_strTitle;		// 책 제목
	// private : 외부에서 접근을 못함.
	// private int m_nPage;			// 페이지
	String m_strPublisher;	// 출판사
	int m_nPrice;			// 가격
	
	void SetTitle(String strTitle) {
		m_strTitle = strTitle;
	}
	String GetTitle() {
		return m_strTitle;
	}
}
