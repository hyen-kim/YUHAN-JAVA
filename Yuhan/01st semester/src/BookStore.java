import java.util.Scanner;

public class BookStore {
	// 속성
	int grade; // 학년
	private String[][] bookType = { // 학년에 따른 책에 미리 값을 선언과 동시에 초기화
			{ "HTML", "C언어", "프로그래밍논리", "비지니스모델", "데이터구조", "데이터베이스개론", "Python", "JavaScript" },
			{ "C++", "정보통신", "Linux", "Java", "DB응용", "전자계산기", "PHP", "JSP" },
			{ "C#", "ASP.NET", "데이터베이스", "Android", "소프트웨어공학", "컴퓨터네트워크", "JavaFramework", "정보보안" } };
	String book;	// 선택한 책을 저장
	private int[][] bookMoney = { // 책에 따라 값을 선언과 동시에 초기화
			{ 10400, 12000, 27000, 12000, 24000, 28000, 18000, 30000 },
			{ 22100, 22400, 13200, 15800, 17000, 27000, 13100, 27000 },
			{ 28000, 11000, 25400, 15600, 14000, 18200, 28000, 20000 } }; // 책에 따른 가격
	int bookMoneyindex; // 선택한 책 가격
	int paymentmethod; String pay;	// 결제방식 		
	String bookpayment = "";

	// 기능
	public int getGrade() { // 학년의 값을 반환
		return grade;
	}

	public void setGrade(int grade) { // 학년의 값을 넣음
		this.grade = grade;
	}

	public void setPaymentmethod(int paymentmethod) {
		this.paymentmethod = paymentmethod;
		payhan();
	}

	public String[][] getBookType() { // 책을 반환
		return bookType;
	}

	public int[][] getBookMoney() { // 책의 값을 반환
		return bookMoney;
	}

	public int getBookMoneyindex() {
		return bookMoneyindex;
	}

	public void setBookMoneyindex(int bookMoneyindex) {
		this.bookMoneyindex = bookMoneyindex;
	}
	
	public void setBookpayment(String bookpayment) {
		this.bookpayment = bookpayment;
	}

	public void displayBooks() { // 북상점 => 학년 책 가격에 대해 알려줌
		System.out.println("=========================================================");
		System.out.println("유한대학교 ITSOFTWORE 북상점에 오신걸 환영합니다.");
		System.out.println("=========================================================");

		for (int i = 0; i < bookType.length; i++) {
			System.out.println();
			System.out.println("< " + (i + 1) + "학년책 >");
			for (int j = 0; j < bookMoney[i].length; j++) {
				System.out.printf("%d. %s 책의 가격은 %d원 입니다.\n",j, bookType[i][j], bookMoney[i][j]);
			}
		}
	}

	public void gradeBooks() { // 선택한 학년의 책과 가격을 알려줌
		showTest();
		System.out.println(grade + "학년책 ");
		for (int i = 0; i < bookType[grade-1].length; i++) {
			System.out.printf("%d. %s 책의 가격은 %d원 입니다.\n",i, bookType[grade-1][i], bookMoney[grade-1][i]);
		}
	}
	
	// 책과 가격을 저장
	public void saveBooks(int bookcho) { 
		book = bookType[grade-1][bookcho];			// 책을 저장
		bookMoneyindex = bookMoney[grade-1][bookcho];	// 책 값을 저장
		System.out.println(">> 구매하실 책은 " + book + "이고 책의 가격은 " + bookMoneyindex + "원 입니다.");
	}
	
	// 결제 방식을 보기 좋게 한글로 변환
	public void payhan() {
		if(paymentmethod == 1) {
			pay = "현금 결제";
		}else {
			pay = "카드 결제";
		}
	}
	
	// 현금으로 결제하였을 경우 
	public int payMoney(int money) {
		if(money > bookMoneyindex) {
			System.out.printf(">> 구매가 완료되었습니다.\n>> 잔돈은 %d원 입니다.\n", money-bookMoneyindex);
		}else if(money < bookMoneyindex) {
			System.out.println(">> 잔액이 부족합니다.");
			return 0;
		}else {
			System.out.println(">> 구매가 완료되었습니다.");
		}
		return 1;
	}
	
	// 구매한 내역
	public void showInformation() {
		showTest();
		System.out.println(">> 학년 : " + grade);
		System.out.println(">> 구매한 책 : " + book);
		System.out.println(">> 구매한 가격 : " + bookMoneyindex + "원");
		System.out.println(">> 결제방식 : " + pay);
		System.out.println(">> " + bookpayment);
	}
	
	public void showTest() {
		for (int i = 0; i < 50; ++i) {System.out.println();}
	}
}
