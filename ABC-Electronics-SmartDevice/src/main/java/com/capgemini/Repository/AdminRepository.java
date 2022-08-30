package com.capgemini.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.Entites.Admin;

public interface AdminRepository extends JpaRepository<Admin,Integer>
{

}
