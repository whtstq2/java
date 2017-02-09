package com.ktds.cepark.hr.vo;

public class JobsVO {

	private String jobsId;
	private String jobTitle;
	private int minSalary;
	private int maxSalary;

	public String getJobsId() {
		return jobsId;
	}

	public void setJobsId(String jobsId) {
		this.jobsId = jobsId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}

	public int getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}
}
