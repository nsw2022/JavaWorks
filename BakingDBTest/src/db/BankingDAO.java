package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BankingDAO {
	private Connection conn = null; // 연결처리
	private PreparedStatement pstmt = null; // sql 처리
	private ResultSet rs = null; // 결과 처리
	
	// 자료 삽입
	public void insertBanking(Banking banking) {
		conn = JDBCUtillTest.getConnection();
		String sql = "insert into test_bank values(?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, banking.getAno());
			pstmt.setString(2, banking.getOwner());
			pstmt.setInt(3, banking.getBalance());
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtillTest.close(conn, pstmt);
		}
	}
	
	// 1개 검색
	public Banking getBanking(int ano) {
		Banking banking = new Banking();
		
		conn = JDBCUtillTest.getConnection();
		String sql = "select * from test_bank where ano=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, ano);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				banking.setAno(rs.getInt("ano"));
				banking.setOwner(rs.getString("owner"));
				banking.setBalance(rs.getInt("balance"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtillTest.close(conn, pstmt, rs);
		}
		
		return banking;
	}
	
	// 전체검색
	public ArrayList<Banking> getBankingList(){
		ArrayList<Banking> bankList = new ArrayList<>();
		conn = JDBCUtillTest.getConnection(); 
		String sql = "select * from test_bank";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Banking banking = new Banking();
				banking.setAno(rs.getInt("ano"));
				banking.setOwner(rs.getString("owner"));
				banking.setBalance(rs.getInt("balance"));
				
				bankList.add(banking);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtillTest.close(conn, pstmt, rs);
		}
		
		
		return bankList;
	}
}
