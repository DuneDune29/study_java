package java_mysql_source;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {
	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost/book_db";
		String id = "root";
		String password = "apmsetup";
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 적재 성공");
			con = DriverManager.getConnection(url, id, password);
			System.out.println("데이터베이스 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
			//14행 실패시 뜸
			
		} catch (SQLException e) {
			System.out.println("연결에 실패하였습니다.");
		} //16행 실패시 뜸
		
		return con;
	}

	public static void main(String[] args) throws SQLException {
		Connection con = makeConnection();
	}
}