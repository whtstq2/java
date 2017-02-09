package com.ktds.cepark.hr.vo;

import com.ktds.cepark.dao.support.annotation.Types;

public class DepartmentVO {

	@Types(alias ="D_MANAGER_ID") //위 형태의 특수성으로 따로 써준다 조인되는 두 같은내용의 키 중에서 PK로 갖는 애를 써준다  
	private int departmentId;
	@Types
	private String departmentName;
	@Types
	private int managerId;
	@Types
	private int locationId;

	private LocationsVO locations;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getLocationId() {
		if (locations == null) {
			locations = new LocationsVO();
		}
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public LocationsVO getLocations() {
		return locations;
	}

	public void setLocations(LocationsVO locations) {
		this.locations = locations;
	}
}
