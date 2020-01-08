package Day02;


public class _1Inheritance_Methods {
	public static void main(String[] args) {

	}
}

//부모 클래스
class Employee {
	// 멤버 변수
	String name;

	// 멤버 메서드
	// 이름 획득
	String getName() {
		return name;
	}
	// 이름 지정
	void setName(String name) {
		this.name = name;
	}
	// 급여계산
	void getPay() {
	}
}

// 자식 클래스
// 정규직
class Permanent extends _1Inheritance_Methods {
	// 직원의 이름과 급여정보를 저장하기 위한 클래스
	// 멤버변수 : 기본급(pay), 보너스(bonus)
	int pay;
	int bonus;
	
	// 생성자 : 기본급, 보너스 초기화
	public Permanent(int pay, int bonus) {
		this.pay = pay;
		this.bonus = bonus;
	}
	
	// 상속받은 Setter/Getter : 이름 지정 및 획득
	// 상속받은 메서드 재정의 : 급여계산 (기본급 + 보너스)
	
}

// 비정규직
class Temporary extends _1Inheritance_Methods {
}
