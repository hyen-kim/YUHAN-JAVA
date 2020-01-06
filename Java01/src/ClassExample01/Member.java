package ClassExample01;

public class Member {
	
	//현실세계의 회원을 Member 클래스로 모델링.
	//회원의 데이터로는 이름, 아이디, 패스워드, 나이
	//데이터들을 가지는 Member 클래스 선언
	// 필드
	String name;
	String id;
	String password;
	int age;
	

	// 위에 작성한 Member클래스에 생성자를 추가
	// name필드와 id필드를 외부에서 받은 값으로 초기화
	// 생성자 
	public Member(String name, String id) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.id = id;
	}
	
	public static void main(String[] args) {
		Member member = new Member("홍길동", "hong");
		System.out.println(member.id);
		System.out.println(member.name);
	}
}
