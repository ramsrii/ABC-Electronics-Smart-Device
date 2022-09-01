package com.capgemini.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.Entites.Product;

public interface IProductRepository extends JpaRepository<Product,String>
{
	
}
