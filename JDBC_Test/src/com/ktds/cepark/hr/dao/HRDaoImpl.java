package com.ktds.cepark.hr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ktds.cepark.dao.support.JDBCDaoSupport;
import com.ktds.cepark.dao.support.QueryHandler;
import com.ktds.cepark.dao.support.annotation.BindData;
import com.ktds.cepark.hr.vo.CountriesVO;
import com.ktds.cepark.hr.vo.DepartmentVO;
import com.ktds.cepark.hr.vo.EmployeesVO;
import com.ktds.cepark.hr.vo.JobsVO;
import com.ktds.cepark.hr.vo.LocationsVO;
import com.ktds.cepark.hr.vo.RegionsVO;

public class HRDaoImpl extends JDBCDaoSupport implements HRDao{

	@Override
	public List<EmployeesVO> getAllEmployees() {
		
		return selectList(new QueryHandler() {

			@Override
			public String preparedQuery() {
				String query = " SELECT  " +
						"  EMPLOYEE_ID, FIRST_NAME, LAST_NAME,  " +
						"   EMAIL, PHONE_NUMBER, HIRE_DATE,  " +
						"   JOB_ID, SALARY, COMMISSION_PCT,  " +
						"   MANAGER_ID, DEPARTMENT_ID " +
						" FROM HR.EMPLOYEES " ;
				return query;
			}

			@Override
			public String mappingParameters(PreparedStatement stmt)  {
				return null;
			}

			@Override
			public Object getData(ResultSet rs) {
				EmployeesVO employeesVO = new EmployeesVO();
				BindData.bindData(rs, employeesVO);
				return null;
			}
			
		});
	}
	
	
	@Override
	public List<DepartmentVO>getAllDepartments() {
		// 1. oracle driver loading 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("미안해요 로딩 실패했어요");
			return null;
		}
		
		// 2. jdbc 인스턴스 생성
		Connection conn = null;
		PreparedStatement stmt = null; 
		ResultSet rs = null;
		
		// 3. 오라클 인스턴스에 연결 
		
		String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		try {
			conn = DriverManager.getConnection(oracleUrl, "HR", "hr"); 
		
		// 4. 쿼리 만든다
			String query = " SELECT  " +
					" DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID,  " +
					"   LOCATION_ID " +
					" FROM HR.DEPARTMENTS ";   
		// 5. 쿼리 실행 한다
			stmt =conn.prepareStatement(query);
		// 6. 쿼리 실행 결과 가져온다 
			rs = stmt.executeQuery();
		// 6-1.  쿼리 실행 결과를 리스트 객체에 집어넣는다 
			DepartmentVO departmentVO = null;
			List<DepartmentVO> department= new ArrayList<DepartmentVO> ();
		// 6-2. row 한줄의 정보를 VO의 변수하나에 각각 집어 넣는다 
			while (rs.next()) { //next() 한줄 한줄 씩 가져오는것. 만약 다음 줄이 없으면 while 중지

				departmentVO =new DepartmentVO();
				departmentVO.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
				departmentVO.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
				departmentVO.setLocationId(rs.getInt("LOCATION_ID"));
				departmentVO.setManagerId(rs.getInt("MANAGER_ID"));
				
				department.add(departmentVO);
				// 7. list인 employees에 employeesVO에 저장된 row의 정보를 옮긴다 
			}
			return department;
		// 7.  VO에 저장된 데이터를 리스트 형태의 변수에 집어 넣는다 
	
	} catch (SQLException e) {
		e.printStackTrace();
		System.out.println("오라클 인스턴스에 연결 실패 종료");
		return null;
	}finally {
		try {
			if (rs !=null) {
			rs.close();
			}
		} catch (SQLException e) {}
		try {
			if(stmt !=null) {
			stmt.close();
			}
		} catch (SQLException e) {}
		
		try { 
			if( conn!=null) {
			conn.close();
			}
		} catch (SQLException e) {}
	}
}
	
	public List <EmployeesVO> getAllEmployeesWithDepartments() {
		
		return selectList(new QueryHandler() {

			@Override
			public String preparedQuery() {
				String query = " SELECT  " +
						"  E.EMPLOYEE_ID, E.FIRST_NAME, E.LAST_NAME,  " +
						"   E.EMAIL, E.PHONE_NUMBER, E.HIRE_DATE,  " +
						"   E.JOB_ID, E.SALARY, E.COMMISSION_PCT,  " +
						"   E.MANAGER_ID, E.DEPARTMENT_ID ," +
						" D.DEPARTMENT_ID D_DEPARTMENT_ID,"+ " D.DEPARTMENT_NAME ," +  //구분 짓기 위해 뒤에 D의 것이라고 명시
						" D.MANAGER_ID D_MANAGER_ID,"+ "D.LOCATION_ID "+  //구분 짓기 위해 뒤에 D의 것이라고 명시
						" FROM EMPLOYEES E, " +
						" DEPARTMENTS D" +
						" WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID";
				return query;
			}

			@Override
			public String mappingParameters(PreparedStatement stmt) {
				return null;
			}

			@Override
			public Object getData(ResultSet rs) {
				EmployeesVO employeesVO = new EmployeesVO();
				BindData.bindData(rs, employeesVO);
				BindData.bindData(rs, employeesVO.getDepartments());
				return null;
			}
			
		});
		
		
		
		
	}
	
	


	@Override
	public List<EmployeesVO> getAllEmployeesWithDpNJobs() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //오토 클래스 로딩: 메모리에 객체를 올려놓음 
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 로딩 실패 시스템 종료");
			return null;
		}
		//2. JDBC Instance 생성
		Connection conn = null;
		PreparedStatement stmt = null; //쿼리를 만들어 전달해주는 
		ResultSet rs = null;
		
		//3. oracle instance에 연결
		String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		try {
			conn = DriverManager.getConnection(oracleUrl, "HR", "hr"); //자바와 오라클을 연결해주는 것 DB를 연결해주는 것 
			
			//4. 쿼리 만든다
			String query = " SELECT  " +
					"  E.EMPLOYEE_ID, E.FIRST_NAME, E.LAST_NAME,  " +
					"   E.EMAIL, E.PHONE_NUMBER, E.HIRE_DATE,  " +
					"   E.JOB_ID, E.SALARY, E.COMMISSION_PCT,  " +
					"   E.MANAGER_ID, E.DEPARTMENT_ID ," +
					" D.DEPARTMENT_ID D_DEPARTMENT_ID,"+ " D.DEPARTMENT_NAME ," +  //구분 짓기 위해 뒤에 D의 것이라고 명시
					" D.MANAGER_ID D_MANAGER_ID,"+ "D.LOCATION_ID ,"+ 
					" J.JOB_ID J_JOB_ID," + " J.JOB_TITLE," + " J.MIN_SALARY," + " J.MAX_SALARY" +//구분 짓기 위해 뒤에 D의 것이라고 명시
					" FROM EMPLOYEES E, " +
					" DEPARTMENTS D," +
					" JOBS J" +
					" WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID" +
					" AND E.JOB_ID = J.JOB_ID";
			
			//5. 쿼리를 실행한다 
			stmt =conn.prepareStatement(query);
			
			//6. 쿼리의 실행결과를 가져옴
			rs = stmt.executeQuery();
			//6-1. 쿼리의 실행결과를 list객체에 할당 
			EmployeesVO employeesVO = null;
			DepartmentVO departmentVO = null;
			JobsVO jobsVO = null;
			List<EmployeesVO> employees = new ArrayList<EmployeesVO> ();
			
			while (rs.next()) { 
				employeesVO = new EmployeesVO();
				employeesVO.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
				employeesVO.setFirstName(rs.getString("FIRST_NAME"));
				employeesVO.setLastName(rs.getString("LAST_NAME"));
				employeesVO.setEmail(rs.getString("EMAIL"));
				employeesVO.setPhoneNumber(rs.getString("PHONE_NUMBER"));
				employeesVO.setHireDate(rs.getString("HIRE_DATE"));
				employeesVO.setJobId(rs.getString("JOB_ID"));
				employeesVO.setSalary(rs.getInt("SALARY"));
				employeesVO.setCommissionPct(rs.getDouble("COMMISSION_PCT"));
				employeesVO.setManagerId(rs.getInt("MANAGER_ID"));
				employeesVO.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
				
//				departmentVO = new DepartmentVO();
				departmentVO = employeesVO.getDepartments();
				departmentVO.setDepartmentId(rs.getInt("D_DEPARTMENT_ID")); //.으로 엮는것 체이닝 간편하다 
				departmentVO.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
				departmentVO.setManagerId(rs.getInt("D_MANAGER_ID")); // 편하다고 해서 막 엮으면 안되고 도중
				departmentVO.setLocationId(rs.getInt("LOCATION_ID")); //끊어줄 필요가 있다 
				
				jobsVO = employeesVO.getJobs();
				jobsVO.setJobsId(rs.getString("J_JOB_ID"));
				jobsVO.setJobTitle(rs.getString("JOB_TITLE"));
				jobsVO.setMinSalary(rs.getInt("MIN_SALARY"));
				jobsVO.setMaxSalary(rs.getInt("MAX_SALARY"));
				
				
				employees.add(employeesVO);
			}
			return employees;
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("오라클 인스턴스에 연결 실패 종료");
			return null;
		}finally {
			try {
				if (rs !=null) {
				rs.close();
				}
			} catch (SQLException e) {}
			try {
				if(stmt !=null) {
				stmt.close();
				}
			} catch (SQLException e) {}
			
			try { 
				if( conn!=null) {
				conn.close();
				}
			} catch (SQLException e) {}
		
		
		
		}
	} 
	public List<DepartmentVO>getAllEmployeesWithLocations() {
		//1. oracle driver loading
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		// 2. jdbc 인스턴스  만들기
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		// 3. oracle 인스턴스에 대입
		String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		try {
			conn = DriverManager.getConnection(oracleUrl, "HR", "hr");
			//4. 쿼리 생성 
			String query =" SELECT  " +
					"  D.LOCATION_ID D_LOCATION_ID, L.LOCATION_ID L_LOCATION_ID, L.STREET_ADDRESS, L.POSTAL_CODE,  " +
					"   L.CITY, L.STATE_PROVINCE, L.COUNTRY_ID " +
					" FROM LOCATIONS L" +
					", DEPARTMENTS D" +
					" WHERE D.LOCATION_ID = L.LOCATION_ID"; 
			//5. 쿼리 실행
			stmt = conn.prepareStatement(query);
			
			//6. 결과 가져오기
			rs = stmt.executeQuery();
			//6-1. 리스크에 결과 넣기 
			DepartmentVO departmentVO = null;
			LocationsVO locationVO = null;
			List <DepartmentVO> department = new ArrayList <DepartmentVO>();
			while (rs.next()) {
				departmentVO = new DepartmentVO();
				departmentVO.setLocationId(rs.getInt("LOCATION_ID"));
				
				locationVO = departmentVO.getLocations();
				departmentVO.setLocationId(rs.getInt("L_LOCATION_ID"));
				department.add(departmentVO);
			}
			return department;
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Quit");
			return null;
		}
		finally {
			
				try {
					if (conn != null) {
					conn.close();
					}
				} catch (SQLException e) {}
				try {
					if (stmt != null) {
					stmt.close();
					}
				} catch (SQLException e) {}
				try {
					if( rs != null) {
					rs.close(); }
				} catch (SQLException e) {}
			}
		}
		
	public List<CountriesVO>getAllCountriesWithRegions() {
		//1. oracle driver load
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
		//2. jdbc 인스턴스 생성
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		//3. oracle 인스턴스에 대입
		String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		try {
			conn = DriverManager.getConnection(oracleUrl, "HR", "hr");
		//4. 쿼리 생성
		String query = " SELECT  " +
				"        C.COUNTRY_ID, C.COUNTRY_NAME, C.REGION_ID C_REGION_ID, " +
				"        R.REGION_ID R_REGION_ID, R.REGION_NAME " +
				" FROM    COUNTRIES C " +
				"        , REGIONS R " +
				" WHERE   C.REGION_ID = R.REGION_ID "; 

		//5. 쿼리 실행
		stmt = conn.prepareStatement(query);
		//6. 실행결과 할당 
		rs = stmt.executeQuery();
		//6-1.  할당한거 리스트로 옮김 
		//할당할 자리(rs)를 먼저 만들고 그리고나서 데이터자리를 세터로 만들어서 게터로 가져온다 
		CountriesVO countriesVO = null; 
		RegionsVO regionsVO = null;
		List<CountriesVO> countries = new ArrayList <CountriesVO> ();
		
		while (rs.next()) {
			countriesVO = new CountriesVO();
			
			
			regionsVO = countriesVO.getRegions();
			regionsVO.setRegionName(rs.getString("REGION_NAME"));
			
			countries.add(countriesVO);
		}
		return countries;
		
			}catch (SQLException e){
				e.printStackTrace();
				System.out.println("QUIT");
				return null;
			}finally {
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
	
	//throws SQLException

	@Override
	public EmployeesVO findOneEmployee(int employeeId) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
			return null;
		}
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		
			try {
				conn = DriverManager.getConnection(oracleUrl, "HR", "hr");
				
				StringBuffer query = new StringBuffer(); // string은 불변(재할당이지 데이터는 못바꿈), 버퍼는 가변 
				query.append("	SELECT	EMPLOYEE_ID");
				query.append("				, FIRST_NAME");
				query.append("				, LAST_NAME");
				query.append("				, EMAIL");
				query.append("				, PHONE_NUMBER");
				query.append("				, JOB_ID");
				query.append("				, HIRE_DATE");
				query.append("				, SALARY");
				query.append("				, COMMISSION_PCT");
				query.append("				, MANAGER_ID");
				query.append("				, DEPARTMENT_ID");
				query.append("	FROM		EMPLOYEES");
				query.append("	WHERE	EMPLOYEES_ID = ?"); 
				
				stmt = conn.prepareStatement(query.toString());   // 스트링버퍼는 쿼리 형식이 아니라서 toString으로 바꿔준다    
				stmt.setInt(1, employeeId);
				
				rs= stmt.executeQuery();
				
				EmployeesVO employeesVO = null;
				if (rs.next()) {
					employeesVO = new EmployeesVO();
					BindData.bindData(rs, employeesVO);
				}
				return employeesVO;
				
				
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}finally{
				
					if ( conn != null) {
					try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					} }
			
				try {
					if ( stmt != null ) {
					stmt.close(); }
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					if ( rs != null) {
					rs.close(); }
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

