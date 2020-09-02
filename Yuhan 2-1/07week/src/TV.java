// 필드 (속성)   	: 모델명(modelName), 크기(size), 색상(color), 채널(channel), 볼륨(volume)
// 메소드 (기능)  	: 전원을 켜다(powerOn), 끄다(powerOff), 채널올리다/내리다(up/down Channel), 볼륨올리다/내리다(up/down Volume)

public class TV {
	// 필드
	final static String modelName = "LGM00071Q";	// 모델명을 상수로 지정
	private String color;
	private int size, channel = 505, volume;
	
	// getter : 반환 / setter : 설정
	
	
	
	// 메소드
	void powerOn() {
		System.out.println("전원을 켜다.");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public static String getModelname() {
		return modelName;
	}

	void powerOff() {
		System.out.println("전원을 끄다.");
	}

	void upChannel() {
		++channel;
		System.out.println("채널을 올리다. 현재채널번호 : " + channel);
	}

	void downChannel() {
		--channel;
		System.out.println("채널을 내리다. 현재채널번호 : " + channel);
	}

	void upVolume() {
		++volume;
		System.out.println("볼륨을 올리다. 현재볼륨번호 : " + volume);
	}

	void downVolume() {
		--volume;
		System.out.println("볼륨을 내리다. 현재볼륨번호 : " + volume);
	}

}
