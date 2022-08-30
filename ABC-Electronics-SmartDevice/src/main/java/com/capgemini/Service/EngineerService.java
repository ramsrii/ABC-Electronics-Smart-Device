package com.capgemini.Service;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.Entites.Complaint;
import com.capgemini.Entites.Engineer;

public interface EngineerService 
{
	public List<Complaint> getAllOpenComplaint(int Engineer);
	public List<Complaint> getResolvedComplaints(int Engineer);
	public List<Complaint> getResolvedComplaintsByDate(int Engineer,LocalDate Date);
	public List<Complaint> getComplaints(int Engineer,String productModelNumber);
	public String changeComplaintStatus(int complaintId);
}
