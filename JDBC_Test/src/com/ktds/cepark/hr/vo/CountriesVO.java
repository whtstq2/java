package com.ktds.cepark.hr.vo;

public class CountriesVO {
	private String countryId;
	private String counrtyName;
	private int regionId;
	
	private RegionsVO regions;
	


	public RegionsVO getRegions() {
		if ( regions == null) {
			regions = new RegionsVO();
		}
		return regions;
	}

	public void setRegions(RegionsVO regions) {
		this.regions = regions;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCounrtyName() {
		return counrtyName;
	}

	public void setCounrtyName(String counrtyName) {
		this.counrtyName = counrtyName;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

}
