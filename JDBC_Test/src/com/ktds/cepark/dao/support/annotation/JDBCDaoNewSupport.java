package com.ktds.cepark.dao.support.annotation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ktds.cepark.dao.support.QueryHandler;

public class JDBCDaoNewSupport {

	//얘는 리스트로 가져오는 것 (형식 리스트)
public List selectList(QueryHandler queryHandler) {
		
		// 1. oracle driver loading load oracle driver메소드로 이동!
		loadOracleDriver();
		
		// 2. JDBC Instance 생성
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			
			// 3. Query 만들기
			String query = queryHandler.preparedQuery();
			
			// 4. 쿼리 실행하기 
			stmt = conn.prepareStatement(query);
			
			// 5. 파라미터 맵핑하기
			queryHandler.mappingParameters(stmt);
			
			// 6. 쿼리 실행 결과 가져오기
			rs = stmt.executeQuery();
			
			// 7. ROW 객체 생성하기& 결과를 리스트 객체에 집어넣기 
			List result = new ArrayList();
			while(rs.next()) {
				// 한 줄씩 데이터 넣고 추가
				result.add(queryHandler.getData(rs));
			}
			
			return result;
			
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage(), e);
		} finally {
			close(conn, stmt, rs);
		}
	}
	

// 얘는 하나만 가져오는 것 (형식 object)
	public Object selectOne(QueryHandler queryHandler) {
		
		loadOracleDriver();
		
		// 2. JDBC Instance 생성
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		
		try {
			//3. 오라클 인스턴스에 연결 -> getConnection으로 가세요 
			conn = getConnection();
			
			// 4. Query 생성하기..
			String query = queryHandler.preparedQuery(); // preparedQuery로 가세요 
			stmt = conn.prepareStatement(query);
			
			// 파라미터 맵핑하기 ( 쿼리에서 ?에 내가 보고 싶은 줄을 보기 위해 변수를 대입해주는 것과 같은 역할 )
			queryHandler.mappingParameters(stmt);
			//쿼리에 파라미터를 넣겠다 
			
			rs = stmt.executeQuery();
			
			Object result = null;
			if (rs.next()) {
				// ROW 객체 생성하기
				//한 줄을 정제해서 내가 원하는 것으로 만들어줌 
				result = queryHandler.getData(rs);
			}
			
			return result;
			
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage(), e);
		} finally {
			close(conn, stmt, rs);
		}
	}

	// Oracle Driver Loading.
	private void loadOracleDriver() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}
	
	// 오라클 인스턴스에 연결하는 메소드, 기존의 try catch가 아닌 throw를 사용 
	private Connection getConnection() throws SQLException {
		String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		return DriverManager.getConnection(oracleUrl, "HR", "hr");
	}
	
	//	jdbc 인스턴스를  닫는 메소드 
	private void close(Connection conn, PreparedStatement stmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
		}
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
		}
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
		}
	}
}
