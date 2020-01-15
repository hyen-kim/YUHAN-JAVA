package Swing;

import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Coffe
{
	JFrame frame = new JFrame("");
	JLabel label = new JLabel("원하는 커피 선택");
	
	public void createFrame()
	{
		//프레임에 컴포넌트 추가
		frame.add(label);
		// label 위치 지정
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		frame.pack();
		
		//프레임 크기 지정	
		frame.setSize(600, 400);

		//프레임 보이기
		frame.setVisible(true);

		//swing에만 있는 X버튼 클릭시 종료
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args)
	{
		//프레임 열기
		Coffe CoffeExample = new Coffe();
		CoffeExample.createFrame();
	}
}