package ClassExample01;

public class MemberService {
	// login() 메소드와 logout() 메소드 선언
	// login() 메소드 : id랑 password를 매개값으로 제공
	// logout() 메소드 : id만 매개값으로 제공
	String id;
	String password;

	static boolean login(String id, String password) {
		// id가 hong이고 password가 12345일 경우에만 true반환
		if (id == "hong" && password == "12345") {
			return true;
		} else {
			return false;
		}
	}

	static void logout(String id) {
		System.out.println(id + "님이 로그아웃되셨습니다.");
	}
}
