package com.capgemini.Service;

import java.util.List;

import com.capgemini.Entites.Complaint;
import com.capgemini.Entites.Engineer;
import com.capgemini.Entites.Product;
import com.capgemini.Exceptions.InvalidModelNumberException;

public interface IProductService 
{
	  public Product addProduct(Product product);
	  public String deleteProduct(Product product ); 
	  public List<Product> getProduct();
	  
	  public Product updateModelNumber(Product p)throws InvalidModelNumberException;
	  
	  public List<Complaint> getProductComplaints(String productCategoryName);
	  public List<Engineer> getEngineersByProduct(String productCategoryName);
	

}
