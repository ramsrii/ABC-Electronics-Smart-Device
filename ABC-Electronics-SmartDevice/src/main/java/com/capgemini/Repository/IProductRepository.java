package com.capgemini.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.Entites.Product;
@Repository
public interface IProductRepository extends JpaRepository<Product,String>
{
	@Query("Select c from Product c where c.modelNumber=?1") 
	  public Product getProductByComplaint1(String modelNumber);
	  @Query("Select p from Product p order by p.modelNumber")
		Product findByModelNumber(String modelNumber);
}
