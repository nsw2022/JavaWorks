package banking.bankarray;

import java.util.Scanner;

public class BankMain2 {


	// 통장 계좌를 만들 객체 배열 100개 생성
	static Account[] accountArray = new Account[100];// 전역에 위치(배열)
	static Scanner scanner = new Scanner(System.in);


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

				if (selectNo==1) { // 계좌생성
					createAccount();
				}else if (selectNo==2) {  // 계좌목록
					getAccountList();
				}else if(selectNo==3){ // 예금(입금)
					getAccountList();
					deposit();
				}else if (selectNo==4) { // 출금
					getAccountList();
					withdraw();
				}
				else if(selectNo==5){ 
					run=false;
					System.out.println("종료");
				}else{
					System.out.println("지원되지 않는 기능입니다.");
				}
			} 
			catch (Exception e) {
				System.out.println("네녀석이 입력한건 문자다 크큭 숫자를 입력해라");
				System.out.println(e);
			}

		}//while


	}//main

	// 계좌에서 출금하는 메서드
	private static void withdraw() {
		System.out.println("-----------------------------------------");
		System.out.println("출금");
		System.out.println("-----------------------------------------");

		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		System.out.print("출금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		while (true) {

			if (findAccount(ano) != null) { // 계좌를 찾았다면 반환값이 있기에 null이 아님
				// 예금 = 잔고 + 예금액
				Account account = findAccount(ano);
				if (account.getBalance() - money  < 0) {
					System.out.println("잔액이 부족합니다. 남은금액"+account.getBalance());
					System.out.print("출금액: ");
					money = Integer.parseInt(scanner.nextLine());

				}else {
					account.setBalance(account.getBalance() - money );
					System.out.println("결과: 정상처리 되었습니다.");
					System.out.println("출금 후 잔액"+account.getBalance());
					break;
				}
			}else {
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

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {	
				String dbAno = accountArray[i].getAno(); // 이미 저장된 계정

				if (dbAno.equals(ano)) { // 찾는 걔좌와 일치하면..문자열 비교 - equals() 사용
					account = accountArray[i]; // 계좌를 가져와 저장
					break; // 빠져나옴
				}	
			}
		}
		return account;
	}


	// 계좌를 생성하는 함수
	private static void createAccount() {
		System.out.println("-----------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("-----------------------------------------");

		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();

		System.out.print("계좌주: ");
		String onwer = scanner.nextLine();

		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < accountArray.length;i++) {// 전체배열반복
			if ( accountArray[i] == null ) { // 조건식 null일때만 넣기
				accountArray[i] = new Account(ano, onwer, balance);

				System.out.println("결과: 계좌가 생성되었습니다");
//				System.out.println(i);
				break;
			}else if (accountArray[i].getAno().equals(ano)) {
				i--;
//				System.out.println(i);
				System.out.println("이미 있는 계좌입니다. 입력을 다시해주세요");
				System.out.print("계좌번호: ");
				ano = scanner.nextLine();

				System.out.print("계좌주: ");
				onwer = scanner.nextLine();

				System.out.print("초기입금액: ");
				balance = Integer.parseInt(scanner.nextLine());
			}
		}

	}//createAccount


	private static void getAccountList() {
		for (Account account : accountArray){
			if (account != null) {//계좌가 null 인 값 제외 전원출력			
				System.out.print("계좌번호: " + account.getAno()+"\t");
				System.out.print("계좌주 : " + account.getOwner()+"\t");
				System.out.println("잔액: " + account.getBalance());
			}
		}		
	}//getAccountList

	// 게좌에 입금하는 메서드
	private static void deposit() {
		System.out.println("-----------------------------------------");
		System.out.println("예금");
		System.out.println("-----------------------------------------");

		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();


		System.out.print("초기입금액: ");
		int money = Integer.parseInt(scanner.nextLine());

		if (findAccount(ano)!=null) { // 계좌를 찾았다면 반환값이 있기에 null이 아님
			// 예금 = 잔고 + 예금액
			Account account = findAccount(ano);
			account.setBalance(account.getBalance() + money );
			System.out.println("결과: 정상처리 되었습니다.");
			System.out.println("입금완료 후 잔액"+account.getBalance());

		}else {
			System.out.println("결과: 계좌가 없습니다.");
		}


	}


}//class



