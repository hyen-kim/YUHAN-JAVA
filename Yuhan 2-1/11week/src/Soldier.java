
public class Soldier extends Weapon2 {

	@Override
	public void fire() {
		// 부모클래스의 내용을 자식 클래스로 그대로 구현
		System.out.println("탕탕탕");
	}
	
	// 추가하고 싶은 메소드
	public void walk() {
		System.out.println("걷다.");
	}

}
