package com.zensar;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
	@Query("FROM Department d WHERE d.departmentId = :departmentId")
	Department getById(@Param("departmentId") int departmentId);

}
