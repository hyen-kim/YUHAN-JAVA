
public class Tank extends Weapon2 {

	@Override
	public void fire() {
		// 추상메소드 구현으로 인해 fire는 반드시 있어야함
		System.out.println("두두두두두두두");
	}
	public void forward() {
		System.out.println("전진하다.");
	}
}
