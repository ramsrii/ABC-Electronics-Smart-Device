package com.capgemini.Service;

import java.util.List;

import com.capgemini.Entites.Client;
import com.capgemini.Entites.Complaint;
import com.capgemini.Entites.Engineer;
import com.capgemini.Entites.Product;
import com.capgemini.Exceptions.InvalidComplaintException;

public interface IComplaintService {
	
	public boolean bookComplaints(Complaint complaint);
	List<Complaint> bookComplaint(List<Complaint> e);
    public Engineer getEngineer(int complaintId)throws InvalidComplaintException;
    List<Engineer> saveEngineer(List<Engineer> e1);
	List<Product> saveProduct(List<Product> e2);
    String changeComplaintStatus(int complaintId, String status) throws Throwable;
    List<Complaint> getClientAllComplaints(String clientId);
    List<Complaint> getClientAllOpenComplaints(String clientId);
    Product getProductByComplaint(int complaintId) throws InvalidComplaintException;

}
