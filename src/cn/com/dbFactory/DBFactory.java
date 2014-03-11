package cn.com.dbFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBFactory {
	private Connection conn = getConnection();

	private Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/designdb", "root", "123");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void execSqlWithoutResultset(String sql, Object[] params) {
		try {
			if (conn == null)
				conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			for (int i = 0; i < params.length; i++) {
				pstmt.setObject(i + 1, params[i]);
			}
			pstmt.execute();
			close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ResultSet execSqlWithResultset(String sql, Object[] params) {
		ResultSet rs = null;
		try {
			if (conn == null)
				conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			for (int i = 0; i < params.length; i++) {
				pstmt.setObject(i + 1, params[i]);
			}
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	public void close() {
		try {
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn = null;
		}
	}
}
