package baord;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.yedam.EmpVO;
	
public class LogDAO {
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "dev";
	String pass = "dev";
	String sql;

	Connection conn;
	Statement stmt = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	public void connect() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("에러발생.");
			e.printStackTrace();
		}
	}

	public int addLog(LogVO log) {

		connect();
		
		sql = "insert into U_LOG values(bbb.NEXTVAL, ?, ?, ?, sysdate)";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, log.getU_ID());
			psmt.setString(2, log.getU_PW());
			psmt.setString(3, log.getU_MAIL());

			r = psmt.executeUpdate(); // 처리된 건수.

			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return r;
	}
	public boolean checkId(String U_ID) {
		String sql = "SELECT * FROM U_ID WHERE ID = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, U_ID);
			rs = psmt.executeQuery();

			rs.next(); // 행
			if (rs.getInt(1)/* 열 */ == 1) {
				return true;
			}

		} catch (SQLException e) {
			System.out.println("checkId SQL문 오류");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
}
