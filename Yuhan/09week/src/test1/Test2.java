package test1;

public class Test2 {
	public static void main(String[] args) {
		AccessModifier3 am = new AccessModifier3();
		// AccessModifier3 클래스와 같은 패키지에 있을 경우
		System.out.println(am.a);	// public
		// System.out.println(am.b);	// private 에러발생
		System.out.println(am.c);	// protected
		System.out.println(am.d);	// default
		
	}
}
