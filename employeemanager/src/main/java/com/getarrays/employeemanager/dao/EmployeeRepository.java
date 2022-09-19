package com.getarrays.employeemanager.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getarrays.employeemanager.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	
	 Employee findEmployeeById(Long id);
}
