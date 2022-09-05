package com.capgemini.Entites;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Engineer {
	@Id
	@GeneratedValue
	private int employeeId;

	private String password;
	@Column(name = "engineerName", length = 40, nullable = false)
	private String engineerName;
	 
	private String domain; // like washing machine , AC, Mobile phone
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="employeeId",referencedColumnName="employeeId")
	private List<Complaint> complaints;
	@ManyToOne(cascade=CascadeType.ALL)
	private Admin admin;
	
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
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
	public List<Complaint> getComplaints() {
		return complaints;
	}
	public void addComplaints(Complaint complaints) {
		this.complaints.add(complaints);
	
	}
	public void removeComplaints(Complaint complaints) {
		this.complaints.remove(complaints);

	}

	
	@Override
	public String toString() {
		return "Engineer [employeeId=" + employeeId + ", password=" + password + ", engineerName=" + engineerName
				+ ", domain=" + domain + ", complaints=" + complaints + "]";
	}
}