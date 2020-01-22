package ClassExample02;

public class ClassExample03 {
public static void main(String[] args) {
	OverLoadTest Over = new OverLoadTest();
	System.out.println("Add(int nVar1, int nVar2) : " + Over.Add(10,2));
	System.out.println("Add(float fVar1, float fVar2) : " + Over.Add(3.0f,0.14f));
	}
}

/*
 * < 오버로딩 (overloading) >
 * - 중복되는 메소드명을 클래스 안에서 정의할 수 있도록 하는 것
 * - 같은 함수명으로 다양한 값을 받아 처리 
 * - 함수명 하나만 기억하면 됨
 * 
 * * 특징 ) 
 * 같은 함수명을 구분하는 규칙이 있다.
 * -> 리턴값으로는 구분할 수 없음, 매개변수로 구분한다.
 * -> 매개변수를 명확하게 지정해줘야한다.
 * 
 * */

class OverLoadTest{
	
	public int Add(int nVar1, int nVar2) {
		return nVar1 + nVar2;
	}
	
	// Overloading : 매개변수가 int -> float
	public float Add(float fVar1, float fVar2) {
		return fVar1 + fVar2;
	}
	
	
}