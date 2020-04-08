import java.util.Scanner;

public class MutiIfElseTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("체중을 입력 : ");
		int weight = sc.nextInt();	// 정수 입력
		
		if (weight >= 100) {
			System.out.println("고도비만입니다.");
		}else if(weight >= 80) {
			System.out.println("비만입니다.");
		}else if(weight >= 60) {
			System.out.println("정상입니다.");
		}else {
			System.out.println("미달입니다.");
		}
		
		sc.close();
	}
}
