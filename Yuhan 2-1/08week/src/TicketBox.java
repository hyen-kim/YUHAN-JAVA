
public class TicketBox {
	// [ 추상화 ]
	// 속성 : 영화제목들, 금액들, 좌석번호들
	// 기능 : 영화를 선택한다, 좌석번호를 선택한다, 금액을 지불한다, 티켓을 받는다, 잔액을 받는다.
	
	String[] titles = new String[3];	// 제목
	int [] pays = new int[3];			// 금액
	String seatNum;						// 좌석번호
	
	public void choiceMoive(int titleNum) {
		System.out.println(titles[titleNum-1] + " 영화가 선택되었습니다.");
	}

	public String[] getTitles() {
		return titles;
	}

	public void setTitles(String[] titles) {
		this.titles = titles;
	}

	public int[] getPays() {
		return pays;
	}

	public void setPays(int[] pays) {
		this.pays = pays;
	}

	public String getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}
	
	public void displayMovies() {
		
	}
}
