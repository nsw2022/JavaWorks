package classpart;

import hiding.Account;

public class AccounTest {

	public static void main(String[] args) {
		// 계좌생성
		Account account = new Account("1000-1234","노승우",1_000);
		
		System.out.println(account.getAno());
		System.out.println(account.getOwner());
		System.out.println(account.getBalance());

	}

}
