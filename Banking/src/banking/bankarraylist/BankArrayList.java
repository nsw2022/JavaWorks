package banking.bankarraylist;

import java.util.ArrayList;
import java.util.Scanner;

import banking.bankarray.Account;

public class BankArrayList {

	// 통장 계좌를 만들 객체 배열 100개 생성
	// static Account[] accountlist = new Account[100];// 전역에 위치(배열)
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Account> accountlist = new ArrayList<>();

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			try {
				System.out.println("-----------------------------------------");
				System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
				System.out.println("-----------------------------------------");
				System.out.print("선택> ");
				// 메뉴 선택 변수
				int selectNo = Integer.parseInt(scanner.nextLine());

				if (selectNo == 1) { // 계좌생성
					createAccount();
				} else if (selectNo == 2) { // 계좌목록
					getAccountList();
				} else if (selectNo == 3) { // 예금(입금)
					deposit();
				} else if (selectNo == 4) { // 출금
					withdraw();
				} else if (selectNo == 5) {
					run = false;
					System.out.println("종료");
				} else {
					System.out.println("지원되지 않는 기능입니다.");
				}
			} catch (Exception e) {
				System.out.println("네녀석이 입력한건 문자다 크큭 숫자를 입력해라");
				System.out.println(e);
			}

		} // while

	}// main

	// 계좌에서 출금하는 메서드
	private static void withdraw() {
		System.out.println("-----------------------------------------");
		System.out.println("출금");
		getAccountList();
		System.out.println("-----------------------------------------");

		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		System.out.print("출금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		while (true) {

			if (findAccount(ano) != null) { // 계좌를 찾았다면 반환값이 있기에 null이 아님 
				// 예금 = 잔고 + 예금액
				Account account = findAccount(ano);
				if (account.getBalance() - money < 0) {
					System.out.println("잔액이 부족합니다. 남은금액" + account.getBalance());
					System.out.print("출금액: ");
					money = Integer.parseInt(scanner.nextLine());

				} else {
					account.setBalance(account.getBalance() - money);
					System.out.println("결과: 정상처리 되었습니다.");
					System.out.println("출금 후 잔액" + account.getBalance());
					break;
				}
			} else {
				System.out.println("결과: 계좌가 없습니다.");
				System.out.print("계좌번호: ");
				ano = scanner.nextLine();
				System.out.print("출금액: ");
				money = Integer.parseInt(scanner.nextLine());
			}
		}

	}

	// 계좌를 검색하는 메서드
	private static Account findAccount(String ano) {
		Account account = null; // 빈 계좌 계정을 할당

		for (int i = 0; i < accountlist.size(); i++) {

			String dbAno = accountlist.get(i).getAno(); // 이미 저장된 계정

			if (dbAno.equals(ano)) { // 찾는 걔좌와 일치하면..문자열 비교 - equals() 사용
				account = accountlist.get(i); // 계좌 객체를 가져옴
				break; // 빠져나옴
			}

		}
		return account;
	}

	// 계좌를 생성하는 함수
	private static void createAccount() {
		System.out.println("-------------------------------------------");
		System.out.println("계좌생성");
		System.out.println("-------------------------------------------");
		
		while(true) {
			System.out.print("계좌번호:  ");
			String ano = scanner.nextLine();
			
			//중복 계좌 오류 해결
			if(findAccount(ano) != null) { //계좌 계정이 이미 있다면(계좌번호 중복)
				// findAccount에서 객체를 null로 선언했기때문에
				// null이 아니라면 중복된 계좌가 됨
				System.out.println("중복 계좌입니다. 다시 입력해 주세요");
			}else {
				System.out.print("계좌주:  ");
				String owner = scanner.nextLine();
				
				System.out.print("초기입금액:  ");
				int balance = Integer.parseInt(scanner.nextLine());
				
				Account account = new Account(ano, owner, balance);
				accountlist.add(account);  //리스트에 신규 계좌를 저장
				System.out.println("결과: 계좌가 생성되었습니다.");
				break; //정상적으로 계좌 생성 빠져 나옴
			} //if ~else 끝
		} //내부 while 끝
	}

	// 계좌를 조회하는 함수
	private static void getAccountList() {

		for (Account account : accountlist) {

			System.out.print("계좌번호: " + account.getAno() + "\t");
			System.out.print("계좌주 : " + account.getOwner() + "\t");
			System.out.println("잔액: " + account.getBalance());

		}
	}// getAccountList

	// 게좌에 입금하는 메서드
	private static void deposit() {
		
		System.out.println("-----------------------------------------");
		System.out.println("예금");
		getAccountList();
		System.out.println("-----------------------------------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("초기입금액: ");
		int money = Integer.parseInt(scanner.nextLine());

		if (findAccount(ano) != null) { // 계좌를 찾았다면 반환값이 있기에 null이 아님
			// 예금 = 잔고 + 예금액
			Account account = findAccount(ano);
			account.setBalance(account.getBalance() + money);
			System.out.println("결과: 정상처리 되었습니다.");
			System.out.println("입금완료 후 잔액" + account.getBalance());
		
		} else {
			System.out.println("결과: 계좌가 없습니다.");

		}

	}

}// class
