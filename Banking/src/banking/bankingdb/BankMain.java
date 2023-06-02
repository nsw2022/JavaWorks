package banking.bankingdb;


import java.util.Scanner;



public class BankMain {

	public static void main(String[] args) {
		AcoountDAO dao = new AcoountDAO();
		Scanner scanner = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");

			// 메뉴 선택 변수
			int selectNo = Integer.parseInt(scanner.nextLine()); // 문자형을 숫자형으로 변환

			if (selectNo == 1) {
				dao.createAccount(); // 계좌 생성
			} else if (selectNo == 2) {
				dao.getAccountList();
				// getAccountList(); // 계좌 목록
			} else if (selectNo == 3) {
				dao.deposit(); // 예금
			} else if (selectNo == 4) {
				// withdraw(); // 출금
			} else if (selectNo == 5) {
				run = false;
				System.out.println("프로그램을 종료합니다.");
			} else {
				System.out.println("지원되지 않는 기능입니다. 다시 입력해주세요");
			}
		} // while() 끝
		scanner.close();
	}// main() 끝

}
