
public class RunInsClassTest {
	
	public static void main(String[] args) {
		InsClassTest ic1 = new InsClassTest();	// 객체 생성 1
		InsClassTest ic2 = new InsClassTest();	// 객체 생성 2
		
		ic1.ins = 20;
		ic2.ins = 50;
		
		ic1.stc = 300;	
		ic2.stc = 500;	// 300으로 할당되었던것이 공유하고 있기 때문에 500으로 값이 바뀜
		
		// 이건 책에 있는 예제 방식
		// System.out.println("인스턴스 변수의 값은 " + ic1.ins + "," + ic2.ins + "입니다.");
		// 인스턴스 변수의 값은 20,50입니다.
		// System.out.println("클래스 변수의 값은 " + ic1.stc + "," + ic2.stc + "입니다.");
		// 클래스 변수의 값은 500,500입니다.
		// 서로 공유하고 있기 때문에 -> static
		
		System.out.printf("ic1.ins = %d\n", ic1.ins);
		System.out.printf("ic2.ins = %d\n", ic2.ins);
		
		System.out.printf("ic1.stc = %d\n", ic1.stc);
		System.out.printf("ic2.stc = %d\n", ic2.stc);
		System.out.printf("InsClassTest.stc = %d\n", InsClassTest.stc);
	
	}
}
