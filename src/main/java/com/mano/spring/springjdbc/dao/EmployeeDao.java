package com.mano.spring.springjdbc.dao;

import java.util.List;

import com.mano.spring.springjdbc.dto.Employee;

public interface EmployeeDao {
	void insertEmployee(Employee employee);
	
	List<Employee> findAllEmployees();
	
	Employee getEmployeeById(String id);
}
