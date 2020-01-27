package event;
/*
 * 개념, 이벤트 객체, 이벤트 어댑터
 * 
 * (1) 용어 
 * - 이벤트 소스 : 이벤트를 '발생' 시킨 컴포넌트				
 * 				JButton, JList, JTextField 등
 * - 이벤트 객체 : 이벤트 소스에 대한 모든 '정보'를 가지는 객체	
 * 				ActionEvent, ItemEvent 등
 * - 이벤트 리스너 : 이벤트에 따라 호출될 메소드 '인터페이스'		 
 * 				ActionListener, ItemListener 등
 * 
 * 	-> 인터페이스는 상속을 통해서 메소드를 구현 
 * 	-> 전부다 구현해야한다는 규칙이 있는 인터페이스.
 * 
 * (2) 이벤트 객체
 * - 이벤트를 발생한 컴포넌트의 정보를 가짐
 * - 이벤트 종류, 이벤트 소스, 좌표, 상태 등
 * 
 * (3) 이벤트 소스에 대한 이벤트 객체  -> 가장 많이 쓰는 것들
 * - ActionEvent : JButton, JList, JTextField, JMenuItem
 * -> 하나의 ActionEvent를 통하여 컴포넌트의 정보를 받는다.
 * - ItemEvent : JCheckBox, JCheckBoxMenuItem, JList
 * - KeyEvent : Component
 * - MouseEvent : Component
 * - FocusEvent : Component
 * - TextEvnet : TextField, TextArea
 * 
 * (4) 이벤트 객체의 구분			EventObject의 메소드
 * 이벤트 객체 -> ActionEvent -> getSource()  -> 
 *  					이벤트분리				형변환
 * 
 * 이벤트객체부분은 자바부분
 * 이벤트 분리 부분은 이벤트 리스너의 영역임.
 * 
 * =>  모든 이벤트 객체는 EventObject를 상속
 * 
 * 
 * 
 * */


public class EventExample01 {
	public static void main(String[] args) {
		
	}
}
