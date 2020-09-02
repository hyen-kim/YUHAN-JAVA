// Scanner을 사용하려면 import해야한다.
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		// Scanner라는 객체를 생성하고 참조하는 변수가 s다.
		// System.in은 import할 필요 X => lang 패키지 안에 존재
		
		System.out.println("성명을 입력하세요 : ");
		String name = s.nextLine(); 
		// 엔터를 쳐야 값을 받아온다.
		
		System.out.println("당신의 좋아하는 위인은? (2명 공백문자로 구별해서 입력) : ");
		String name2 = s.next();
		String name3 = s.next();
		// 공백으로 값을 받아온다.
		
		System.out.println("당신의 성명은 " + name + "입니다.");
		System.out.printf("당신의 좋아하는 위인은 %s, %s 입니다.\n", name2, name3);
	}

}
