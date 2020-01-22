package ClassExample02;

/*
 * < 생성자 (constructor>				<- 함수 (멤버함수)
 * - 객체가 생성될 때 '한번' 호출되는 메소드	<- new라는 연산자 
 * - '자동'으로 호출되는 메소드
 * - 리턴형이 없고 클래스명과 함수명이 같다.	<- return 을 사용 X
 * - public							
 * -> 객체가 생성될 때 자동으로 호출되어야하므로 접근 제어는 열어줘야하므로 public이라는 속성을 반드시 가져야함
 * 
 * class MyClass {
 *	//생성자
 * 	public MyClass(){}
 *  // overloading -> 매개변수 추가 
 * 	public MyClass(int nVar1, int nVar2){}
 * */

/*
 *  < this, this() >
 *  (1) this
 *  - 객체 자신을 참조하는 참조형 클래스 변수 또는 키워드
 *  this.멤버변수		<-- 클래스 안의 멤버변수를 내부에서 호출
 *  this.메소드()
 *  
 *  this를 쓰기 위해서는 반드시 객체가 생성이 되어 있어야함.
 *  객체가 생성된 객체에서 자기 자신을 참조해서 무언가를 해야하므로.
 *  
 *  (2) this()
 *  - 생성자에서 또 다른 생성자를 호출
 *  - 생성자 첫 줄에서 호출
 * */

public class ClassExample04 {
	public static void main(String[] args) {
		// 생성자 이용해서 출력
		A Test1 = new A();
		System.out.println(Test1.getM_fVar());
		
		// this를 이용해서 출력
		A Test2 = new A();
		Test2.SetPrint(11);
		
	}
}

class A{
	
	private int m_nVar;
	public float m_fVar = 3.14f;	// 선언과 동시에 초기화
	
	public A() {
		// 반드시 생성자의 첫줄에서 호출
		this(3.14f);	// 첫 줄에서 다른 생성자 호출
		// 하나의 생성자에서 다른 생성자를 호출 할 때
		m_nVar = 12;
	}
	// overloading -> float
	public A(float fVar)
	{
		m_fVar = fVar;
	}

	public int getM_nVar() {
		return m_nVar;
	}
	
	public void setM_nVar(int m_nVar) {
		this.m_nVar = m_nVar;
	}
	
	public float getM_fVar() {
		return m_fVar;
	}
	
	public void setM_fVar(float m_fVar) {
		this.m_fVar = m_fVar;
	}
	
	// this 
	public void SetPrint(int nVar) {
		this.m_nVar = nVar;
		this.Print();
	}
	public void Print() {
		System.out.println("m_nVar : " + m_nVar);
	}
}





