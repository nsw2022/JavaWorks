package whileexample;

import java.util.Scanner;

public class Bank1 {

	public static void main(String[] args) {
		// 은행업무 - 예금, 출금, 잔고 확인
		Scanner sc = new Scanner(System.in);

		int balance = 0; // 잔고
		boolean run = true; // 상태(실행)변수
		int money;

		while (run) {
			try {

				System.out.println("=============================");
				System.out.println("1.예금 | 2.출금 | 3.조회 | 4.종료");
				System.out.println("=============================");
				System.out.print("선택> ");

				// 입력받은 값 숫자로 변환
				int selNum = Integer.parseInt(sc.nextLine());
				switch (selNum) {
				case 1:
					// 예금 : 잔고 + 예금액
					System.out.print("예금금액> ");
					money = Integer.parseInt(sc.nextLine());
					balance += money;
					System.out.printf("%d원 정상 처리되었습니다\n",money);
					break;

				case 2:
					// 잔고 = 잔고 - 출금액
					System.out.print("출금금액> ");
					money = Integer.parseInt(sc.nextLine());
					balance = balance - money;
					System.out.printf("%d원 정상 처리되었습니다\n", money);
					break;

				case 3:
					System.out.println("조회금액> "+balance);
					break;

				case 4:
					System.out.print("프로그램 종료> ");
					run = false;
					break;
				default:
					System.out.println("메뉴를 잘못 선택하셨습니다. 다시 입력해주세요");
					break;
				}
			}
			catch (Exception e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			}

		}// while 닫기
		System.out.println("프로그램을 종료합니다.");
		sc.close();

	} 

	
}
