package hiding;

public class AccountTest {

	public static void main(String[] args) {
		Account a1 = new Account("1000-1234", "이몽룡", 50000);
	
		System.out.println("계좌번호 "+a1.getAno());
		System.out.println("계좌주 "+a1.getOwner());
		System.out.println("계좌잔액 "+a1.getBalance());
		
		Account a2 = new Account("010902-04-111111", "노승우", 1_000_000);
		
		System.out.println("계좌번호 "+a2.getAno());
		System.out.println("계좌주 "+a2.getOwner());
		System.out.println("계좌잔액 "+a2.getBalance());
	}

}
