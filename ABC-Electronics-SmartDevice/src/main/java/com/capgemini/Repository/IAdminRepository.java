package com.capgemini.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.Entites.Admin;
@Repository
public interface IAdminRepository extends JpaRepository<Admin,Integer>
{
		
}
