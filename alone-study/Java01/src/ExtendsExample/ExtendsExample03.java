package ExtendsExample;

import ExtendsExampleTest.C;

public class ExtendsExample03 {
	public static void main(String[] args) {
		// 같은 패키지 안에서 상위 default 멤버 사용
		G Test1 = new G();
		Test1.m_nVar = 20;
		Test1.Print();
		
		I Test2 = new I();
		
	}
}

class F {
	int m_nVar = 7;
}

class G extends F {
	public void Print() {
		System.out.println("G Class : " + m_nVar);
	}
}

class I extends C{
	public void Print() {
		// m_nVar2 = 20;	// error 발생
		// System.out.println("D Class : " + m_nVar2);
	}
}