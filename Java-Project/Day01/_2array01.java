package Day01;

import javax.swing.JOptionPane;

public class _2array01 {

	public static void main(String[] args) {
		
		int su = Integer.parseInt(JOptionPane.showInputDialog("배열 크기를 입력하세요."));
		int[] array = new int[su];
		int max = 0, min = 100;
		
		for (int i = 0; i < su; i++) {
			
			array[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + " 번째 값 입력"));
			
			if (max <= array[i]) {
				max = array[i];
			}
			if (min >= array[i]) {
				min = array[i];
			}
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}

}
