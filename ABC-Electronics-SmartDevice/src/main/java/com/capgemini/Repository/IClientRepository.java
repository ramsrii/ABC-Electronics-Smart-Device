package com.capgemini.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.Entites.Client;

public interface IClientRepository extends JpaRepository<Client,String>
{
	
}
