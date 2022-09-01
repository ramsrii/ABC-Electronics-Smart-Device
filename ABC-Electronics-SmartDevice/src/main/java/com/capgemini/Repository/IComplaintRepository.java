package com.capgemini.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.Entites.Complaint;

public interface IComplaintRepository extends JpaRepository<Complaint,Integer>
{

}
