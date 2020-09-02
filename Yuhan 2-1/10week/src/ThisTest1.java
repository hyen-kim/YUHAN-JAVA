
public class ThisTest1 {
	private double n;
	
	// 다형성으로 인해서 동일한 이름으로 변수명을 사용할 수 있다.
	// 필드와 매개변수(지역변수)는 동일한 이름일 경우 서로를 구별하기 위해서 필드앞에 this 키워드를 붙인다.
	public void power(double n) {
		this.n =  n * n;
		System.out.println(n + "의 제곱승은 " + this.n + "입니다.");
	}
	
	public static void main(String[] args) {
		ThisTest1 tt = new ThisTest1();
		tt.power(3.0);
	}
}
