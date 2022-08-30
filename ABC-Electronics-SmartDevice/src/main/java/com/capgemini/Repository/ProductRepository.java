package com.capgemini.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.Entites.Product;

public interface ProductRepository extends JpaRepository<Product,String>
{
	
}
