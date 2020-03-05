package ExceptionExample;
/*
 * 예외 처리 개념, 형식, finally, throws
 * 
 * < 예외 처리 >
 * 
 * 개념
 * - 예외 처리는 프로그램 실행 도중에 발생되는 오류를 처리하기 위한 부분
 * - 에러 : 수정할 수 없는 것
 * - 오류 : 수정 가능, 알려주는 역할
 * - 키위드 : try, catch, finally, throws
 * 
 * 기본형식 
 * try {
 * 		예외가 발생할 수 있는 문장
 * } catch(Exception형 e){
 * 		예외가 발생했을 때 처리하는 문장
 * }
 * 
 * - Exception 형 -> java.lang
 * 
 * 
 * (1) finally 
 * - try ~ catch문의 예외처리와 상관없이 항상 실행해야 하는 문장이 있는 경우에 사용
 * 
 * 
 * (2) throws
 * - 모든 예외 처리를 try ~ catch 안의 괄호에 넣어 처리하기에는 무리가 있다.
 * -> JVM 또는 예외 처리 클래스를 지정
 * 
 * 반환형 메소드 () throws Exception {}
 * : JVM에서 처리 
 * 
 * 
 * */
public class ExceptionExample01 {
	public static void main(String[] args) throws Exception {
		
		int nVar = 0;
		int nResult;
		
		// 0으로 나눴을 때 예외발생 처리
		try {
			nResult = 7 / nVar;				// 예외가 발생하지 않았을 때 실행되는 부분
		} catch (ArithmeticException e) {	// 예외가 발생하였을 때 실행되는 부분
			System.out.println("failed");
		}finally {							// 예외가 발생하든 안하든 출력
			System.out.println("Good Bye");
		}		
		
	}
}

