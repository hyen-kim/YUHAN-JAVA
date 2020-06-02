// 클래스에서 인터페이스를 상속받을 때는 implements
public class IPhone11 implements SmartPhone {

	// 밑에는 자동으로 @Override
	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("전화를 건다.");
	}

	@Override
	public void rcvCall() {
		System.out.println("전화를 받는다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("문자를 보낸다.");

	}

	@Override
	public void rcvSMS() {
		// TODO Auto-generated method stub
		System.out.println("문자를 받는다.");

	}

	@Override
	public void searchMusic() {
		// TODO Auto-generated method stub
		System.out.println("음악을 검색한다.");

	}

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("음악을 재생한다.");

	}

	@Override
	public void stopMusic() {
		// TODO Auto-generated method stub
		System.out.println("음악을 멈춘다.");

	}

	@Override
	public void installApp() {
		// TODO Auto-generated method stub
		System.out.println("앱을 설치한다.");

	}

	@Override
	public void runApp() {
		// TODO Auto-generated method stub
		System.out.println("앱을 실행한다.");

	}
	
	// 인터페이스 외의 내용을 추가 --> 인터페이스의 약속외의 메소드 추가 가능
	// 일반적인 메소드를 기능적으로 추가
	public void callSiri() {
		System.out.println("시리를 부른다.");
	}
	
}
