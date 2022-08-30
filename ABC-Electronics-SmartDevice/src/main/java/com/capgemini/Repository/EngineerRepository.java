package com.capgemini.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.Entites.Engineer;

public interface EngineerRepository extends JpaRepository<Engineer,Integer>
{

}
