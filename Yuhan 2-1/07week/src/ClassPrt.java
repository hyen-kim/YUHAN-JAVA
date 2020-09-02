
public class ClassPrt {
	void PrtMsg() {
		System.out.println("====================================");
		System.out.println("ClassPrt 클래스를 객체로 생성한 메시지입니다.");
		System.out.println("====================================");
	}
	
	public static void main(String[] args) {
		ClassPrt Msg = new ClassPrt();
		Msg.PrtMsg();
	}
} 
