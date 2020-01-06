package LoopExample;

public class ContinueTest {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if((i+1)%2 == 1) //È¦¼ö
				continue;
			System.out.print(i + 1 + "\t");
		}
	}
}
