package ClassExample03;
/*
 * 개념, 형식, 사용예
 * 
 * < 추상 클래스 >
 * 개념 
 * - 하위에서 구현할 '메소드의 원형'을 가진 상위 클래스	-> 추상메소드
 * - 상위 클래스로만 존재
 * - 자체를 객체로 생성할 수 없다					-> new를 통해 생성해서 사용 X 
 * -> 상속 관계를 통해 생성해서 사용할 수 있음
 * 
 * 형식 
 * abstract class 클래스명{
 * 		일반 멤버 변수;
 * 		메소드들;
 * 		생성자;
 * 		abstract 반환형 메소드명 ();
 * }
 * 
 * - extends 키워드를 이용하여 추상 클래스를 상속
 * - 추상 메소드를 하위에서 모두 구현할 필요 없다
 * 
 * 사용 예 
 * (1) 멤버들과 추상 메소드를 섞어 사용한 예  	-> 가장 기본적
 * 
 * abstract class A {
 * public int m_nVar = 7;
 * public void Print(){}
 * abstract void Print1();		// <-- 구현하라
 * 
 * class B extends A {
 * 		void Print1(){}
 * }
 * 
 * class C extends A {
 * 		void Print1(){}
 * }
 * 
 * main 
 * B Test1 = new B ();
 * Test1.Print();
 * Test1.Print1();
 * 
 * A Test2 = new B();		// 형변환
 * Test2.Print();
 * Test2.Print1();			// A라는 객체의 Print1은 추상메소드 이므로 하위에 구현되어있는 메소드 출력
 * 
 * A Test3 = new C();
 * Test3.Print1();		
 * 
 * */
public class AbstractionExample01 {

}
