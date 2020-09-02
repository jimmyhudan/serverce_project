package com.hudan.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * 数据库连接常用类
 * @author hudan
 *
 */
public class JdbcUtils {
	/**
	 * 进行数据库连接，并返回连接对象
	 * @return 数据库连接对象
	 * @throws Exception
	 */
	public static Connection getConnection() throws Exception {
		String url = "jdbc:mysql:///mysql?characterEncoding=utf8&useSSL=false";
		String username = "root";
		String password = "";
		String driver = "com.mysql.jdbc.Driver";
		Class.forName(driver); // 将数据库连接驱动driver加载到内存中
		return DriverManager.getConnection(url, username, password); // 返回连接对象 
	}
	/**
	 * 关闭数据库连接的静态方法
	 * @param conn 需要关闭的连接对象
	 * @param stmt 需要关闭的语句对象 
	 * @param rs 需要关闭的查询结果对象
	 */
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
