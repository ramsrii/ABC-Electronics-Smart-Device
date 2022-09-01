package com.capgemini.Service;
import java.util.List;
import com.capgemini.Entites.Complaint;
import com.capgemini.Entites.Engineer;
import com.capgemini.Exceptions.InvalidDomainException;
import com.capgemini.Exceptions.InvalidEngineerIdException;

public interface IAdminService {
	
	public Engineer addEngineer(Engineer e);
	public Engineer changeDomain(int engineerId,String newDomain)throws InvalidDomainException,InvalidEngineerIdException;
	public String removeEngineer(int engineerId)throws InvalidEngineerIdException;
	
	public List<Complaint> getComplaintsByProducts(String productCategoryName);
	public List<Complaint> getComplaints(String status,String productCategoryName);
	
	public Complaint replaceEngineerFromComplaint(int complaintId)throws InvalidDomainException; // replace engineer from the complaint and allocate new engineer
	List<Complaint> getComplaints(String status);
}
