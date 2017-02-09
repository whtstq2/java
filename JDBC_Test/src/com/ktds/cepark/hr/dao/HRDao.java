package com.ktds.cepark.hr.dao;

import java.util.List;

import com.ktds.cepark.hr.vo.CountriesVO;
import com.ktds.cepark.hr.vo.DepartmentVO;
import com.ktds.cepark.hr.vo.EmployeesVO;

public interface HRDao {

	public List<EmployeesVO> getAllEmployees();
	public List<DepartmentVO> getAllDepartments();
	
	public List<EmployeesVO>getAllEmployeesWithDepartments();
	public List<EmployeesVO> getAllEmployeesWithDpNJobs();
	public List<DepartmentVO>getAllEmployeesWithLocations();
	public List<CountriesVO>getAllCountriesWithRegions();
	
	public EmployeesVO findOneEmployee( int employeeId); //리스트를 안써도 되는 것은 한명의 데이터만 가져올것이기 때문 
	
}
