package ExtendsExample;

/*
 * < final >
 * 
 * (1) final이 클래스와 메소드에 붙는 경우
 * 
 * 예제1)
 * - 상속과 오버라이딩 불가
 * - 클래스와 메소드의 맨 앞쪽에 위치		<-- 제일 맨앞에 지정해야함.
 * 
 * final class A {}
 * final B extends A {} 		<-- 에러 발생 final 이 붙었기 때문에 
 * 
 * ---------------------------------------------------------
 * 예제2)
 * class A {	final void P(){} 	}
 * class B { public void P(){} 		}	<-- 함수에 final이 붙었기 때문에 에러발생 (오버라이딩불가)
 * 
 * ---------------------------------------------------------
 * 
 * (2) final이 변수에 사용되는 경우
 * 
 * public class Test {
 * 	static final float m_nVar = 3.14f;	<-- final이 변수에 사용되는 경우
 * 	// final이 앞에 붙게되면 변수의 값을 수정할 수 없음.
 * 
 * 	public static void main(String[] args) {
 * 		m_nVar = 0.5f;
 * }
 * }
 * */

public class ExtendsExample05 {

}
