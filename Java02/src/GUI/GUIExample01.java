package GUI;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.text.AbstractDocument.Content;

/*
 * 개념, 컨테이너와 컴포넌트, 스윙을 활용한 자바 프로그래밍, 레이아웃 관리자 
 * 
 * < GUI와 AWT, 스윙의 개념 >
 * 
 * GUI
 * - 그래픽 환경, 모든 운영체제의 기본 환경
 * - 버튼, 이미지, 메뉴 등 제공
 * 
 * AWT	
 * - 자바 초기 GUI 프로그래밍 도구
 * - 운영체제의 리소스 사용
 * 
 * 스윙 (swing) 
 * - 순수 자바 컴포넌트 패키지
 * - 자체 리소스 사용, Jxxxx 클래스로 제공
 * 
 * (1) 개념  : 컨테이너와 컴포넌트
 * 컨테이너 
 * - 컴포넌트를 포함하는 클래스
 * - AWT : Frame, Panel, Dialog, window, Applet
 * - 스윙 : JFrame, JPanel, ....
 * 
 * 컴포넌트
 * - 버튼, 이미지, 리스트, ...
 * - 컨포넌트는 반드시 컨테이너에 포함됨
 * 
 * (2) 스윙 (swing)
 * - import문이 반드시 필요
 * 
 * 1단계 : 프레임 생성
 * JFrame = Frame + 메뉴 + 컨텐트 팬 ( 컨테이너 클래스 )
 * 
 * - JFrame 객체를 생성하여 프레임을 생성하는 소스
 * - JFrame을 상속하여 프레임을 생성하는 소스
 * 
 * 2단계 : 컨포넌트 연결
 * - 컨텐트 팬에 컨포넌트 추가 -> 연결
 * - JDK 1.5부터는 JFrame 직접 추가 
 * - 레이아웃 관리자 (FlowLayout, BorderLayout, GridLayout, CardLayout)
 * 
 * 3단계 : 이벤트 처리
 * - 이벤트 처리 -> 리스너 (listner)
 * - 리스너의 실체 -> 인터페이스 (이벤트 처리를 위한 메소드 정의) ****
 * 
 * 
 * -------------------------------------------------------------------
 * 
 * 자바 프로그램 종료
 * System.exit(0)
 * 
 * 스윙 프로그램 종료
 * - 닫기버튼 
 * - setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 * */

public class GUIExample01 extends JFrame {
	
	// 생성자로 프레임 작성
	GUIExample01(){
		
		// < 1단계 >
		setTitle("Swing 연습"); 
		setSize(200,200);		// 프레임 크기 지정
		setVisible(true);		// 화면에 나타내고자 할 때
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 스윙 프로그램을 종료하기 위한 메소드를 호출하는 곳
		
		// < 2단계 > 
		/* 1) 버튼을 컨텍트 팬을 통해 추가하는 코드
		Container ContentPane = getContentPane();
		ContentPane.setLayout(null);
		JButton button = new JButton("test");
		button.setSize(70, 20);
		button.setLocation(50, 10);
		ContentPane.add(button);
		 */
		
		// 2) JFrame를 통해 버튼을 추가하는 코드
		this.setLayout(null);				// this 생략해도 무관
		JButton button = new JButton("test");
		button.setSize(70, 20);
		button.setLocation(50, 10);			// 좌표
		this.add(button);
		
		
	}
	
	public static void main(String[] args) {
		/* JFrame MainFrame = new JFrame();
		MainFrame.setTitle("Swing 연습");
		MainFrame.setSize(200,200);		// 프레임 크기 지정
		MainFrame.setVisible(true);		// 화면에 나타내고자 할 때
		*/
		
		GUIExample01 test = new GUIExample01();
		

		
	
		
	}
}


