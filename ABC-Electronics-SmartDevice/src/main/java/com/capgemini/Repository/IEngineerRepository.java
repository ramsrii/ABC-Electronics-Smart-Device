package com.capgemini.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.Entites.Engineer;
@Repository
public interface IEngineerRepository extends JpaRepository<Engineer,Integer>
{
	@Query("Select c from Engineer c where c.employeeId=?1")
	  Engineer getEngineer(int employeeId);
}
