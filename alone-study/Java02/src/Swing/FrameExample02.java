package Swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameExample02
{
	JFrame frame = new JFrame("Frame Test02");
	JButton button = new JButton("test");
	
	public void createFrame()
	{
		//프레임에 컴포넌트 추가
		frame.add(button);
		
		//프레임 크기 지정	
		frame.setSize(300, 600);

		//프레임 보이기
		frame.setVisible(true);

		//swing에만 있는 X버튼 클릭시 종료
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args)
	{
		//프레임 열기
		FrameExample02 frameExam = new FrameExample02();
		frameExam.createFrame();
	}
}