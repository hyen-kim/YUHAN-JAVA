package Day02;
import java.util.Scanner;

public class main {
     public static void main(String[] args) {
    	 
         Scanner sc1 = new Scanner(System.in);
         Scanner sc2 = new Scanner(System.in);
         Scanner sc3 = new Scanner(System.in);
         Permanent pm;
         Temporary tm;

         System.out.println("고용형태 - 정규직<P>, 임시직<T>를 입력하세요.");
         String cho = sc1.next();
         if (cho.equals((String)"P")) {
            System.out.println("이름, 기본금, 보너스를 입력하세요.");
            String name = sc1.next();
            int pay = sc2.nextInt();
            int bonus = sc3.nextInt();
            pm = new Permanent(pay, bonus);
            
            System.out.println("=======================");
            pm.setName(name);
            System.out.println("고용형태 : 정규직");
            System.out.println("이름 : " + pm.name);
            System.out.println("급여 : " + pm.getPay() + "원");
         }
         else if(cho.equals((String)"T")) {
             System.out.println("이름, 기본금, 보너스를 입력하세요.");
              String name = sc1.next();
              int pay = sc2.nextInt();
              int bonus = sc3.nextInt();
              tm = new Temporary(pay, bonus);
              tm.setName(name);
              System.out.println("=======================");
              tm.setName(name);
              System.out.println("고용형태 : 임시직");
              System.out.println("이름 : " + tm.name);
              System.out.println("급여 : " + tm.getPay() + "원");
           }
           else {
              System.out.println("잘못선택하셨습니다.");
           }
        }
}