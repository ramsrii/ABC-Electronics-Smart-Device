package com.capgemini.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.Entites.Engineer;

public interface IEngineerRepository extends JpaRepository<Engineer,Integer>
{

}
