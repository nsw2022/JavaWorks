package db;

import java.util.ArrayList;

public class BankingMain {
	public static void main(String[] args) {
		BankingDAO dao = new BankingDAO();
		
		// 1명 검색
		Banking banking = dao.getBanking(1234);		
//		System.out.printf("계좌번호: %d 계좌주: %s 남은금액 %d",
//				banking.getAno(),banking.getOwner(),banking.getBalance());
		
		Banking banking2 = new Banking(5678,"테스터승우",10_000);
		dao.insertBanking(banking2);// 데이터 삽입구현
		
		//dao.deleteBank(1234);//삭제구현
		

		// 수정 방법1 - 수정할껄 걍 객체생성자로 선언해서 고쳐버림
//		Banking update = new Banking(5678,"변경",20_000);
//		dao.updateBank(update);
		
		// 수정방법 2 - 객체에 있는걸 꺼내와서 수정
//		Banking update2 = dao.getBanking(5678);
//		update2.setOwner("변경!");
//		update2.setBalance(1234);
//		dao.updateBank(update2);
				
		
	
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
