package com.ktds.cepark.hr.biz;

import java.util.List;


import com.ktds.cepark.hr.dao.HRDao;
import com.ktds.cepark.hr.dao.HRDaoImpl;
import com.ktds.cepark.hr.vo.CountriesVO;
import com.ktds.cepark.hr.vo.DepartmentVO;
import com.ktds.cepark.hr.vo.EmployeesVO;
import com.ktds.cepark.hr.vo.JobsVO;

public class Main {

	public static void main(String[] args) {
		HRDao hrDao = new HRDaoImpl();
		List<EmployeesVO> employees = hrDao.getAllEmployees();
		List<DepartmentVO> department = hrDao.getAllDepartments();
		 List<EmployeesVO>departments =hrDao.getAllEmployeesWithDepartments();
		List<EmployeesVO> jobs = hrDao.getAllEmployeesWithDpNJobs();
		List<CountriesVO> countries = hrDao.getAllCountriesWithRegions();
		
		
//		for (DepartmentVO departmentVO : department) {
//		System.out.print(departmentVO.getDepartmentId()+"\t");			
//		System.out.print(departmentVO.getDepartmentName()+"\t");		
//		System.out.print(departmentVO.getLocationId()+"\t");
//	System.out.println(departmentVO.getManagerId()+"\t");
//		}
//		for (EmployeesVO employeesVO : jobs) {
//			System.out.printf("%s\t%s\t%d\t%d\n", employeesVO.getJobs().getJobsId(),
//					 employeesVO.getJobs().getJobTitle(),
//					 employeesVO.getJobs().getMinSalary(),
//					 employeesVO.getJobs().getMaxSalary()  );
//	}
		for (EmployeesVO employeesVO : employees) {
			System.out.printf("\t%d\t%s\t%s\t%s\t%s\t%s\t%s\t%d\t%f\t%d\t%d\n"
					, employeesVO.getEmployeeId()
					,employeesVO.getFirstName()
					,employeesVO.getLastName()
					,employeesVO.getEmail()
					,employeesVO.getPhoneNumber()
					,employeesVO.getHireDate()
					,employeesVO.getJobId()
					,employeesVO.getSalary()
					,employeesVO.getCommissionPct()
					,employeesVO.getManagerId()
					,employeesVO.getDepartmentId()
					);
		}
	
//		for (EmployeesVO employeesVO : departments) {
//			System.out.printf("%d\t%s\t%d\t%d\n", 
//					employeesVO.getDepartments().getDepartmentId(),
//					employeesVO.getDepartments().getDepartmentName(),
//					employeesVO.getDepartments().getLocationId(),
//					employeesVO.getDepartments().getManagerId());
//		}
//		for (CountriesVO countriesVO : countries) {
//			System.out.printf("%s\t%s\t%d\t%s\n",
//					countriesVO.getCountryId(),
//					countriesVO.getCounrtyName(),
//					countriesVO.getRegionId(),
//					countriesVO.getRegions().getRegionName());
//		}
		
		}
		
	} 

