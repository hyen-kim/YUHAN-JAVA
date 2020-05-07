import java.util.Scanner;

public class RunTicketBox {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		TicketBox tb = new TicketBox();	// 객체 생성
		tb.displayMovies();
		System.out.print("* 영화 선택 : ");
		int titleNum = s.nextInt();
		tb.choiceMoive(titleNum);
		
		s.close();
	}
}
