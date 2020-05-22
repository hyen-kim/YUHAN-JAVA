import java.util.Scanner;

public class RunBookStore {
	public static void main(String[] args) {
		int exit = 0; // 종료를 원할 때
		Scanner sc = new Scanner(System.in); // 입력 받을 Scanner 객체

		BookStore bs = new BookStore(); // 객체 생성
		bs.displayBooks(); // 처음에 한번만 display

		while (exit != 999) {

			// 학년을 입력받는 부분

			System.out.print(">> 학년을 입력하세요 : ");
			int gradenu = sc.nextInt();

			// 학년을 제대로 입력했는지 확인하는 조건문
			if (gradenu == 1 || gradenu == 2 || gradenu == 3) {
				bs.setGrade(gradenu);
				// 학년에 관련된 책과 가격을 출력
				bs.gradeBooks();

				// 몇번째 책을 구입할건지 입력하는 부분
				System.out.print(">> 몇번째 책을 구입할건지 입력해주세요.(0~7) : ");
				int bookcho = sc.nextInt();

				if (bookcho >= 0 && bookcho <= 7) {
					// 구매할 책에 대한 번호를 제대로 입력했는지
					bs.saveBooks(bookcho);

					// 결제방식을 물어보는 부분
					System.out.print(">> 결제방식을 선택하여주세요. (0: 카드결제, 1: 현금결제) : ");
					int pay = sc.nextInt();

					if (pay == 0 || pay == 1) {
						bs.setPaymentmethod(pay);
						if (pay == 1) { // 결제 방식이 현금 인경우
							System.out.print(">> 금액 입력 : ");
							int money = sc.nextInt();
							int moneysuccess = bs.payMoney(money);
							if (moneysuccess == 0) { // 결제가 실패하였을 경우
								bs.bookpayment = "결제 실패";
							} else {
								bs.bookpayment = "결제 성공";
							}
						} else { // 결제 방식이 카드 인경우
							bs.bookpayment = "결제 성공";
							System.out.println(">> 결제가 완료되었습니다.");
						}
					} else {
						System.out.printf(">> 결제 방식을 잘못 입력하셨습니다.\n>> 다시 한 번 입력해주세요.\n");
						continue;
					}

				} else {
					System.out.printf(">> 구매하고자 하는 책이 존재하지 않습니다.\n>> 확인 후 다시 한 번 입력해주세요.\n");
					continue;
				}

			} else { // 제대로 입력하지 않았다면 다시 입력 받게
				System.out.printf(">> 학년을 잘못입력하셨습니다.\n>> 다시 한 번 입력해주세요.\n");
				continue;
			}
			// 구매 내역 출력을 원하는지 물어보는 부분
			System.out.print(">> 구매 내역 출력을 원하십니까 ? (예 : 1, 아니요 : 아무거나) : ");
			int show = sc.nextInt();
			if (show == 1) {
				bs.showInformation();
			}

			System.out.print(">> 종료를 원하십니까 ? (예 : 999, 아니요 : 아무거나 입력) : ");
			exit = sc.nextInt();

		}
		System.out.println("\n\n\n\n>> 이용해주셔서 감사합니다.");
		sc.close();
	}

}
