package com.capgemini.Entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Complaint {
	@Id
	@GeneratedValue
	 int complaintId;
	 String productModelNumber;
	 String ComplaintName;
	 String status,clientId;
	 int engineerId;
	public Complaint() {
		
		super();
		// TODO Auto-generated constructor stub
	}
	public Complaint(int complaintId, String productModelNumber, String complaintName, String status, String clientId,
			int engineerId) {
		super();
		this.complaintId = complaintId;
		this.productModelNumber = productModelNumber;
		ComplaintName = complaintName;
		this.status = status;
		this.clientId = clientId;
		this.engineerId = engineerId;
	}
	public int getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}
	public String getProductModelNumber() {
		return productModelNumber;
	}
	public void setProductModelNumber(String productModelNumber) {
		this.productModelNumber = productModelNumber;
	}
	public String getComplaintName() {
		return ComplaintName;
	}
	public void setComplaintName(String complaintName) {
		ComplaintName = complaintName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public int getEngineerId() {
		return engineerId;
	}
	public void setEngineerId(int engineerId) {
		this.engineerId = engineerId;
	}
	@Override
	public String toString() {
		return "Complaint [complaintId=" + complaintId + ", productModelNumber=" + productModelNumber
				+ ", ComplaintName=" + ComplaintName + ", status=" + status + ", clientId=" + clientId + ", engineerId="
				+ engineerId + "]";
	}
	 
	 

}
