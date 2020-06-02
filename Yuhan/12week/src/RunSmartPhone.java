
public class RunSmartPhone {
	public static void main(String[] args) {
		IPhone11 ip = new IPhone11();
		
		// 정의해놓은 메소드 호출
		ip.installApp();
		ip.runApp();
		ip.callSiri();
	}
}
