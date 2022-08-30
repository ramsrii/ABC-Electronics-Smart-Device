package com.capgemini.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.Entites.Complaint;

public interface ComplaintRepository extends JpaRepository<Complaint,Integer>
{

}
