package com.capgemini.Entites;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Emp")
public class Admin {
	
	@Id
	@GeneratedValue
	 int adminId;
	 String password;
	 long contactNumber;
	 String emailId;
	 @OneToMany(cascade=CascadeType.ALL) private List<Complaint> complaint;
	 
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Admin(int adminId, String password, long contactNumber, String emailId) {
		super();
		this.adminId = adminId;
		this.password = password;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", password=" + password + ", contactNumber=" + contactNumber
				+ ", emailId=" + emailId + "]";
	}
	 
	 

}
