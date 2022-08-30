package com.capgemini.Entites;

public class Engineer {
	int employeeId;
	String password;
	String engineerName;
	String domain;
	
	
	public Engineer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Engineer(int employeeId, String password, String engineerName, String domain) {
		super();
		this.employeeId = employeeId;
		this.password = password;
		this.engineerName = engineerName;
		this.domain = domain;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEngineerName() {
		return engineerName;
	}


	public void setEngineerName(String engineerName) {
		this.engineerName = engineerName;
	}


	public String getDomain() {
		return domain;
	}


	public void setDomain(String domain) {
		this.domain = domain;
	}


	@Override
	public String toString() {
		return "Engineer [employeeId=" + employeeId + ", password=" + password + ", engineerName=" + engineerName
				+ ", domain=" + domain + "]";
	}
	

}
