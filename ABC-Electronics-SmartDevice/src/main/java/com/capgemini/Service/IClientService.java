package com.capgemini.Service;
import java.util.List;

import com.capgemini.Entites.Client;
import com.capgemini.Entites.Engineer;
import com.capgemini.Exceptions.InvalidEngineerIdException;

public interface IClientService 
{
	
	Client saveClient(Client c);
	Client getClientByCLientId(int clientId) throws Throwable;
	List<Client> getAllClients();
	Engineer getEngineerById(int id) throws InvalidEngineerIdException, Throwable;
   
	Client removeClient(Client c);
	List<Engineer> getEngineersByDomain(String category);
	String changeStatusOfComplaint(int complaintId);
	
	
	
	

}
