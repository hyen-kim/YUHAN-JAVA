## YUHAN University
> 2019.03. ~ 2020.09.
* 유한대학교 2학년 1학기 
* 유한대학교 2학년 2학기   
   
> 유한대학교 중간평가
```
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
```
