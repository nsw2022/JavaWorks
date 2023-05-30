package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BankingTest {
	static String driverClass = "oracle.jdbc.OracleDriver";
	/* 자르에넣은 경로를 뜻함 패키지안에 가보면 해당드라이버가있음 */
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String username = "c##mydb";
	static String password = "mydb";
	
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName(driverClass);
			System.out.println("test");
			conn = DriverManager.getConnection(url,username,password);
			System.out.println("Connection 객체 생성");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
