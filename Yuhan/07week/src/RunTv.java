
public class RunTv {
	public static void main(String[] args) {
		// Tv 객체 생성하는 방법
		// Tv 클래스를 사용하여 무수히 많은 객체를 생성할 수 있다.
		
		// tv1 객체 
		TV tv1 = new TV();
		tv1.setColor("Silver");
		tv1.setSize(77);
		tv1.setChannel(1);
		tv1.setVolume(10);
		System.out.println("==============================");
		System.out.println("TV 모델명 : " + TV.modelName);
		System.out.println("TV 크기 : " + tv1.getSize());
		System.out.println("TV 색상 : " + tv1.getColor());
		System.out.println("TV 볼륨 : " + tv1.getVolume());
		System.out.println("TV 채널 : " + tv1.getChannel());
		System.out.println("==============================");
		
		tv1.powerOn();
		for (int i = 0; i < 5; i++) {
			tv1.upChannel();
		}
		for (int i = 0; i < 10; i++) {
			tv1.upVolume();
		}
		
		// tv2 객체
		TV tv2 = new TV();
		tv2.setColor("Black");
		tv2.setSize(55);
		
		System.out.println("==============================");
		System.out.println("TV 모델명 : " + TV.modelName);
		System.out.println("TV 크기 : " + tv2.getSize());
		System.out.println("TV 색상 : " + tv2.getColor());
		System.out.println("TV 볼륨 : " + tv2.getVolume());
		System.out.println("TV 채널 : " + tv2.getChannel());
		System.out.println("==============================");
		
		tv2.powerOn();
		tv2.powerOff();
	}
}
