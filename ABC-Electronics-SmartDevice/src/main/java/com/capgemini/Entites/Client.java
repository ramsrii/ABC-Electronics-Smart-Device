package com.capgemini.Entites;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Client {
	@Id
	@GeneratedValue
	@Column(name="clientId")
	
	String clientId;
	String password;
	String address;
	long phoneNumber;
	@OneToMany(targetEntity = Product.class,cascade=CascadeType.ALL)
	@JoinColumn(name="clientId_fk",referencedColumnName = "clientId")
	 private List<Product> productOwned;
		  
	 @OneToMany(targetEntity = Complaint.class,cascade=CascadeType.ALL)
	 @JoinColumn(name="clientId_fk",referencedColumnName = "clientId")
	 private List<Complaint> complaintList;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String clientId, String password, String address, long phoneNumber) {
		super();
		this.clientId = clientId;
		this.password = password;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", password=" + password + ", address=" + address + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	

}
