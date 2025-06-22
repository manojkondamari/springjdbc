package com.mano.spring.springjdbc.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mano.spring.springjdbc.dao.EmployeeDao;
import com.mano.spring.springjdbc.dto.Employee;

public class EmployeeBusinessimpl implements EmployeeBusiness {
	@Autowired
	private EmployeeDao employeeDao;
	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public void printEmployeeHikes() {
		
		// ask dao for employee data
		List<Employee> employees = employeeDao.findAllEmployees();
		
		// check each employee and print hike
		if(employees!=null) {
			for(Employee employee:employees) {
				if(employee.getExp()>=15) {
					System.out.println("Employee with id "+employee.getId()+" name "+employee.getName()+" got 30% hike");
				}
				else if(employee.getExp()>=10) {
					System.out.println("Employee with id "+employee.getId()+" name "+employee.getName()+" got 25% hike");
				}
				else if(employee.getExp()>=5) {
					System.out.println("Employee with id "+employee.getId()+" name "+employee.getName()+" got 20% hike");
				}
				else {
					System.out.println("Employee with id "+employee.getId()+" name "+employee.getName()+" got 15% hike");
				}
			}
		}
	}
}
