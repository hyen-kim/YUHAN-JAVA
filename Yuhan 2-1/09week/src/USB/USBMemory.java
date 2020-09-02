package USB;

public class USBMemory {
	// 필드 : 필드는 보통 보이지 않게 캡슐화
	private int capacity; // USB 메모리
	private String color; // USB 색상
	private double version; // USB 버전
	
	// 기본생성자
	public USBMemory() {
	}
	// 자동으로 생성자를 생성하는 방법
	// source -> Generate Constructor using Fields 
	// 생성자 -> void X
	public USBMemory(int capacity, String color, double version) {
		// 같은 필드일 경우에는 this로 구분
		// this : 현재 객체의 필드를 가르킴
		// 아무것도 붙이지 않았을 경우는 지역변수를 말함
		this.capacity = capacity;
		this.color = color;
		this.version = version;
	}
	
	// getter(필드값 반환받을 때), setter(필드값을 변경할 때) 메소드 : private 했을 경우 사용
	public int getCapacity() {
		return capacity;
	}

	public String getColor() {
		return color;
	}

	public double getVersion() {
		return version;
	}

	// 기능 구현
	// USB 메모리를 읽어옴
	public void read() {
		// 위에서 this를 붙였는데 여기서는 왜 안붙여요 ?
		// 위에서 매개변수와 구분하려고 붙인건데 여기서는 구분할 필요가 없기 때문에 붙이지 않은 것임
		System.out.println(capacity + "GB, " + color + "색상인 USB Memory의 데이터를 읽는다.");
	}
	public void write() {
		System.out.println(capacity + "GB, " + color + "색상인 USB Memory의 데이터를 저장한다.");
	}
}
