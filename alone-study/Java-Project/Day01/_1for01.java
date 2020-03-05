package Day01;

import javax.swing.JOptionPane;

/* 1부터 사용자가 입력한 수까지의 합 구하기
 * 100을 입력하면 1에서 100까지의 홀수 합과 짝수 합계 출력
 */

public class _1for01 {
	public static void main(String[] args) {
		int suinput = Integer.parseInt(JOptionPane.showInputDialog("수 입력"));
		int odd = 0, even = 0;
		
		for(int i = 1; i <= suinput; i++) {
			if (i % 2 == 0) {
				even += i;
			}else {
				odd += i;
			}
		}
		
		System.out.println("홀수 합계 : " + odd);
		System.out.println("짝수 합계 : " + even);

	}

}
