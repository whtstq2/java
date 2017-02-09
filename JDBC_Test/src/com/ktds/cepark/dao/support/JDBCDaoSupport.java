package com.ktds.cepark.dao.support;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class JDBCDaoSupport {
	
	public List selectList(QueryHandler queryHandler) {
		loadOracleDriver();
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		
			try {
				conn = DriverManager.getConnection(oracleUrl, "HR", "hr");
				
				// TODO 쿼리 생성 
				String query =queryHandler.preparedQuery();
				stmt = conn.prepareStatement(query);
				
				//TODO 파라미터 맵핑하기 
				queryHandler .mappingParameters(stmt);
				
				rs = stmt.executeQuery();
				
				List result = new ArrayList();
				while (rs.next()) {
					//TODO ROW객체 생성하기 
					result.add(queryHandler.getData(rs));
				} 
				return result;
				
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage(), e);
			} finally {
				try {
					if( conn != null) {
					conn.close(); }
				} catch (SQLException e) {
				}
				try {
					if ( stmt != null) {
					stmt.close(); }
				} catch (SQLException e) {
				}
				try {
					if (rs != null) {
					rs.close();}
				} catch (SQLException e) {
				}
					}
		
	}

	private void loadOracleDriver() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException (e.getMessage(), e);
		}
	}
}
