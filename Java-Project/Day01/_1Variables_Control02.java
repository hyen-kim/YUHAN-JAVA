package Day01;
import javax.swing.JOptionPane;

/*
 * 지방, 탄수화물, 단백질 칼로리의 합계를 계산하는 프로그램
 * -> 지방, 탄수화물, 단백질의 그램을 키보드 입력 (Scanner 사용)
 * -> 총 칼로리 구하기
 * 	지방 1그램 : 9칼로리
 * 	단백질과 탄수화물 1그램 : 4 칼로리
 * 	총 칼로리 = 지방 * 9 + 단백질 * 4 + 탄수화물 * 4
 */

public class _1Variables_Control02 {

	public static void main(String[] args) {
			
			int fat = Integer.parseInt(JOptionPane.showInputDialog("지방의 그램을 입력하세요."));
			int carbo = Integer.parseInt(JOptionPane.showInputDialog("탄수화물의 그램을 입력하세요."));
			int pro = Integer.parseInt(JOptionPane.showInputDialog("단백질의 그램을 입력하세요."));
			
			int sum = fat * 9 + carbo * 4 + pro * 4;
			
			System.out.println("총 칼로리 : " + sum + " cal");
	
		}
}
