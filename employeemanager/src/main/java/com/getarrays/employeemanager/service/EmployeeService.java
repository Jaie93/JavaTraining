package com.getarrays.employeemanager.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getarrays.employeemanager.dao.EmployeeRepository;
import com.getarrays.employeemanager.model.Employee;

@Service
public class EmployeeService {

	private final EmployeeRepository employeeRepository;
	@Autowired
	public EmployeeService(EmployeeRepository empRepository)
	{
		this.employeeRepository=empRepository;
	}
	
	public Employee addEmployee(Employee employee)
	{
		employee.setEmployeeCode(UUID.randomUUID().toString());
		return employeeRepository.save(employee);
	}
	
	public List<Employee> findAllEmployees()
	{
		return employeeRepository.findAll();
	}
	
	public Employee updateEmployee(Employee employee,long id)
	{
		Employee updateemployee= employeeRepository.findEmployeeById(id);
		updateemployee.setEmail(employee.getEmail());
		updateemployee.setJobTitle(employee.getJobTitle());
		updateemployee.setName(employee.getName());
		updateemployee.setPhone(employee.getPhone());
		updateemployee.setEmployeeCode(employee.getEmployeeCode());
		employeeRepository.save(updateemployee);
		return updateemployee;
	}
	
	public void deleteEmployee(Long id)
	{
		employeeRepository.deleteById(id);
	}
	
	public Employee findEmployeeById(Long id)
	{
		return employeeRepository.findEmployeeById(id);
	}
}
