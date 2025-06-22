package com.mano.spring.springjdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mano.spring.springjdbc.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	@Override
	public void insertEmployee(Employee employee) {
		//code to insert employee object into database
		
	}
	List<Employee> employees=new ArrayList<Employee>();
	@Override
	public List<Employee> findAllEmployees() {
		//code to return all employees in employee table
		
	        try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/springjdbc","root","1234");
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("select * from employee");
				
				while(rs.next()) {
					String id=rs.getString(1);
					String name=rs.getString(2);
					int exp=rs.getInt(3);
					Employee employee=new Employee(id,name,exp);
					employees.add(employee);
				}
				con.close();
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	    	
		return employees;
	}

	@Override
	public Employee getEmployeeById(String id) {
		//code to get employee based on particular id
		
		
		return null;
	}

}
