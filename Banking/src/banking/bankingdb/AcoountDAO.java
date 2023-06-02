package banking.bankingdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import banking.bankarray.Account;
import banking.bankingdb.common.JDBCUtill;


public class AcoountDAO {
	// 전역변수
	static private Connection conn = null;
	static private PreparedStatement pstmt = null;
	static private ResultSet rs = null;

	static Scanner scanner = new Scanner(System.in);

	// 계좌를 생성하는 함수

	public void createAccount() {

		System.out.println("-------------------------------------------");
		System.out.println("계좌생성");
		System.out.println("-------------------------------------------");

		while (true) {
			System.out.print("계좌번호:  ");
			String ano = scanner.nextLine();

			// 중복 계좌 오류 해결
			if (findAccount(ano) != null) { // 계좌 계정이 이미 있다면(계좌번호 중복)
				System.out.println("중복 계좌입니다. 다시 입력해 주세요");
			} else {
				System.out.print("계좌주:  ");
				String owner = scanner.nextLine();

				System.out.print("초기입금액:  ");
				int balance = Integer.parseInt(scanner.nextLine());

				conn = JDBCUtill.getConnection();
				String sql = "INSERT INTO account VALUES(?,?,?)";
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, ano);
					pstmt.setString(2, owner);
					pstmt.setInt(3, balance);
					pstmt.executeUpdate(); // db 계좌 저장
					System.out.println("결과: 계좌가 생성되었습니다.");

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					JDBCUtill.close(conn, pstmt, rs);
				}

				break; // 정상적으로 계좌 생성 빠져 나옴
			} // if ~else 끝
		} // 내부 while 끝

	}

	// 계좌 목록을 출력하는 메서드
	public void getAccountList() {
		System.out.println("-------------------------------------------");
		System.out.println("계좌목록");
		System.out.println("-------------------------------------------");

		ArrayList<Account> accountList = new ArrayList<>();
		conn = JDBCUtill.getConnection();
		String sql = "select * from account";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");

				Account account = new Account(ano, owner, balance);
				accountList.add(account);
			}
			// 화면에 출력
			for (int i = 0; i < accountList.size(); i++) {

				Account account = accountList.get(i); // 자료를 가져와서 저장

				System.out.print("계좌번호: " + account.getAno() + "\t");
				System.out.print("계좌주: " + account.getOwner() + "\t");
				System.out.println("잔액: " + account.getBalance());

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtill.close(conn, pstmt, rs);
		}

	}

	// 계좌에 입금하는 메서드
	public void deposit() {

		System.out.println("-------------------------------------------");
		System.out.println("예금");
		getAccountList();
		System.out.println("-------------------------------------------");

		while (true) {
			System.out.print("계좌번호:  ");
			String ano = scanner.nextLine();
			

			if (findAccount(ano) != null) { // 찾는 계좌가 있다면
				System.out.print("입금액:  "); // 입금함
				Account account = findAccount(ano);
				int money = Integer.parseInt(scanner.nextLine());
				account.setBalance(account.getBalance() + money);
				String owner = account.getOwner();
				int balance = account.getBalance();
				// 예금 = 잔고 + 예금액
				
				conn = JDBCUtill.getConnection();
				String sql = "update account set owner = ?, balance = ? where ano = ?";
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, owner);
					pstmt.setInt(2, balance);
					pstmt.setString(3, ano);
					pstmt.executeUpdate();
					
					System.out.println("입금후 금액: "+account.getBalance());
					System.out.println("결과: 정상 처리 되었습니다.");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					JDBCUtill.close(conn, pstmt);
				}
	
				break; // 입금 처리후 빠져나옴
			} else {
				System.out.println("결과: 계좌가 없습니다. 다시 입력해 주세요");
			}
		}

	}

	// 계좌에서 출금하는 메서드
	public void withdraw() {
		/*
		 * System.out.println("-------------------------------------------");
		 * System.out.println("출금");
		 * System.out.println("-------------------------------------------");
		 * 
		 * while (true) { System.out.print("계좌번호:  "); String ano = scanner.nextLine();
		 * 
		 * if (findAccount(ano) != null) { // 계좌를 찾았다면(반환값이 있다면) while (true) {
		 * System.out.print("출금액:  "); int money = Integer.parseInt(scanner.nextLine());
		 * 
		 * Account account = findAccount(ano); if (money > account.getBalance()) { //
		 * 출금액이 잔고를 초과한다면 System.out.println("잔액이 부족합니다. 다시 입력해 주세요"); } else { // 출금 =
		 * 잔고 - 예금액 account.setBalance(account.getBalance() - money);
		 * System.out.println("결과: 정상 처리 되었습니다."); break; // 출금 처리후 빠져나옴 } } // 내부 while
		 * 끝 break; // 정상 처리후 빠져나옴 } else {
		 * System.out.println("결과: 계좌가 없습니다. 다시 입력해 주세요"); } } // 외부 while 끝
		 */
	}

	// 계좌를 검색하는 메서드
	public static Account findAccount(String ano) {
		Account account = null; // 빈계좌를 할당
		conn = JDBCUtill.getConnection();
		String sql = "select * from account where ano = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				// 방법1
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				account = new Account(ano, owner, balance);
				// 방법2
				// account.setAno(rs.getString("ano"));
				// 이거전제는 위에 객체를 완전선언해야함
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtill.close(conn, pstmt, rs);
		}

		/*
		 * Account account = null; // 빈 계좌 계정을 할당
		 * 
		 * for (int i = 0; i < accountList.size(); i++) { String dbAno =
		 * accountList.get(i).getAno(); // 이미 리스트에 저장된 계좌번호 if (dbAno.equals(ano)) {
		 * account = accountList.get(i); // 계좌 객체 저장 break; } } return account;
		 * 
		 */
		return account;
	}

}// DAO 클래스 끝
