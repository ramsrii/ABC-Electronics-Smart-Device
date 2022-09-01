package com.capgemini.Service;

import java.util.List;

import com.capgemini.Entites.Complaint;
import com.capgemini.Entites.Engineer;

public interface IEngineerService 
{
	public Engineer addEngineer(Engineer e);
	public List<Complaint> getAllOpenComplaints1(int engineerId);
	public List<Complaint> getResolvedComplaints1(int engineerId);
	public List<Complaint> getComplaints(int engineerId);
	public String changeComplaintStatus(int complaintId) throws Throwable; 	
	
}
