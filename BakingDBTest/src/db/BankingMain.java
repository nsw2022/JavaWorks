package db;

import java.util.ArrayList;

public class BankingMain {
	public static void main(String[] args) {
		BankingDAO dao = new BankingDAO();
		Banking banking = dao.getBanking(1234);
		
		
//		System.out.printf("계좌번호: %d 계좌주: %s 남은금액 %d",
//				banking.getAno(),banking.getOwner(),banking.getBalance());
		
		Banking banking2 = new Banking(5678,"테스터승우",10_000);
		//dao.insertBanking(banking2);
	
		// 전체목록 검색
		ArrayList<Banking> bankList = dao.getBankingList();
		for (int i = 0; i < bankList.size(); i++) {
			Banking bankingTest = bankList.get(i);
			
			int ano = bankingTest.getAno();
			String owner = bankingTest.getOwner();
			int balance = bankingTest.getBalance();
			

			System.out.printf("계좌번호: %d 계좌주: %s 남은금액 %d\n",
					ano,owner,balance);
		}
	}
}
