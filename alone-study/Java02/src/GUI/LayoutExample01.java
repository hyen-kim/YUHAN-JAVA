package GUI;

/*
 * < 레이아웃 관리자 >
 * 
 * 개념
 * - 컨테이너에 컴포넌트를 위치 시키는 방법
 * - 기본 레이아웃 관리자 : setLayout() 메소드	<-- null이라는 값을 넣어주면 기본 레이아웃 관리자가 삭제되고 임의로 가능
 * 
 * < BorderLayout 관리자 >
 * - 컨테이너를 5개의 영역 (동, 서, 남, 북, 중앙) 으로 분할하여 컨포넌트를 배치
 * - 분할 영역 설정 코드
 * - 컴포넌트의 수직과 수평 간격 설정
 * 
 * < GridLayout 관리자 >
 * - 컨테이너 공간을 격자 모양으로 나누는 관리자
 * - 컴포넌트의 수직과 수평 간격 설정
 * 
 * < FlowLayout 관리자 >
 * - 컴포넌트를 왼쪽에서부터 오른쪽으로 순차적으로 위치시키는 관리자
 * 
 * < CardLayout 관리자 >
 * - 컴포넌트가 겹쳐서 나열되는 레이아웃 관리자 
 * 
 * < 레이아웃 관리자 없이 컴포넌트 설정하기 >
 * - 기존 레이아웃 제거 : setLayout(null)
 * - 컴포넌트 위치 설정과 크기 변경 : void setLocation(int x, int y)
 * 						 : void setSize(int width, int height)
 * */
public class LayoutExample01 {

}
