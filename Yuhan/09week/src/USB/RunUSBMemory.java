package USB;

public class RunUSBMemory {
	
	public static void main(String[] args) {
		USBMemory usb1 = new USBMemory(32, "Red", 2.0);
		usb1.read();
		usb1.write();
		USBMemory usb2 = new USBMemory(64, "Gold", 3.0);
		usb2.read();
		usb2.write();
		
		// USBMemory usb3 = new USBMemory();  // 기본생성자 (default) : 매개변수가 없는 생성자
		// 기본 생성자로 지정할 경우 에러 발생
		// 클래스에 생성자가 하나라도 정의 되어 있다면
		// 정의 되어 있는 생성자만 사용 가능
		// 기본 생성자를 사용하고 싶다면 클래스에서 기본 생성자를 정의하면 된다.
	}
}
