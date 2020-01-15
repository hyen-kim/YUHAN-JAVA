package Swing;

import java.awt.Button;
import java.awt.Frame;

public class FrameExample01
{
	// frame의 상단바 이름 부분
	Frame frame = new Frame("Frame test01");
	
	// 버튼
	Button button = new Button("hellow");
	
	public void createFrame()
	{
		//프레임에 컴포넌트 추가
		frame.add(button);
		
		//프레임 크기 지정
		frame.setSize(300, 600);
		
		//프레임 보이기
		frame.setVisible(true);
	}
	
	// 프레임을 가져오는 main
	public static void main(String[] args)
	{
		//프레임 열기
		FrameExample01 frameExam = new FrameExample01();
		frameExam.createFrame();
	}
}