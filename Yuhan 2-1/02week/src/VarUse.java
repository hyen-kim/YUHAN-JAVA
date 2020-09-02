
public class VarUse {
	public static void main(String[] args) {
	
		int k1 = 10;
		// int k1 = 12.54 	=> 에러 발생 : 변수 유형에 맞지 않는 데이터 사용 시 오류 발생
		int k2 = 20; 
		double d = 3.14;
		char c = 'A';
		
		 System.out.println("정수 데이터 k1 = " + k1 + ", k2 = " + k2);
		 System.out.println("실수 데이터 d = " + d);
		 System.out.println("문자 데이터 c = " + c);
		 
	}
}
