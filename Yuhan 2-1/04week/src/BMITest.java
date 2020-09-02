import java.util.Scanner;

public class BMITest {
	public static void main(String[] args) {
		// BMT : 체지량 지수
		// BMI = 체중/키의제곱 (㎏/㎡)

		// 체중과 키의 값을 입력
		Scanner sc = new Scanner(System.in);

		System.out.print("체중 입력 (㎏) : ");
		double weight = sc.nextDouble();
		System.out.print("키 입력 (㎝) : ");
		double height = sc.nextDouble();

		// API = 라이브러리
		// BMI를 계산하는 부분
		double bmi = weight / Math.pow(height / 100, 2);
		//								 cm -> m
		
		String bmiMsg;
		
		if(bmi < 18.5) {
			bmiMsg = "저";
		}else if(bmi < 23) {	// 18.5 이상이면서 23 미만
			bmiMsg = "정상";
		}else if(bmi < 25) {	// 23 이상 25 미만
			bmiMsg = "과";
		}else if(bmi < 30) {	// 25 이상 30 미만
			bmiMsg = "비만";
		}else {					// 30 이상
			bmiMsg = "고도";
		}
		
		System.out.printf("고객님의 체중은 %.2f㎏, 키는 %.2f㎝입니다.\n",weight, height);
		System.out.printf("BMI 지수는 %.3f이고, 따라서 고객님은 %s체중입니다.\n", bmi, bmiMsg);
		
		sc.close();
	}
}
