
public class RunWeapon2 {
	public static void main(String[] args) {
		// Weapon2 w = new Weapon2();
		// 추상화 클래스이기 때문에 new 연산자로 객체 생성 불가능
		
		Soldier s = new Soldier();
		Tank t = new Tank();
		Fighter f = new Fighter();
		
		s.fire();
		s.walk();
		s.test();
		
		t.fire();
		t.forward();
		t.test();
		
		f.fire();
		f.fly();
		f.test();
	}
}
