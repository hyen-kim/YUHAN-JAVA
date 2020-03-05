package LoopExample;

import java.util.Scanner;

public class WhileBMITest {
	
	//Body Mass Index(BMI, 체질량지수)
			/* [문제분석]
			 * 1. 입력 : 사용자 정보(성명, 체중, 키)
			 * 2. 출력 : 사용자 정보, BMI, BMI별 체중
			 * 3. 처리과정 : BMI 계산, BMI 값을 이용해서 체중(다중 if)
			 * 공식 체중/키/키
			 * 저체중 18.5미만
			 * 정상 20이상 25미만
			 * 과체중 25이상 30미만
			 * 비만 30이상 35미만
			 * 고도비만 35이상
			 */
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		while(true) {
			System.out.printf("이름을 입력하세요 :");
			String name = s1.nextLine();

			System.out.printf("체중을 입력하세요 : ");
			double w = s2.nextDouble();
			
			System.out.printf("키를 입력하세요  : ");
			double h = s2.nextDouble();
			
			double bmi = w/Math.pow(h/100, 2);
			String result;

			if(bmi<18.6)
				result = "저체중";
			else if(bmi<25)
				result = "정상체중";
			else if(bmi<30)
				result = "과체중";
			else if(bmi<35)
				result = "비만";
			else
				result = "고도비만";
			
			System.out.printf("%s님의 체중은 %.3fkg, 키는 %.2fcm이므로 BMI는 %.2f입니다.\n", name, w, h, bmi);
			System.out.printf("따라서 %s님의 체중은 %s입니다.\n", name, result);
			
			System.out.println("* 계속 하시겠습니까?(계속 : 1, 종료 :0)");
			int cont = s2.nextInt();
			if(cont==0)
				break;
		}
		
		
		s1.close();
		s2.close();
	}

}
