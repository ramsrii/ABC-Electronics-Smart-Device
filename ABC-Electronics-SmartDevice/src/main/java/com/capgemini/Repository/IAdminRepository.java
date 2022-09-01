package com.capgemini.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.Entites.Admin;

public interface IAdminRepository extends JpaRepository<Admin,Integer>
{
		
}
