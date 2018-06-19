package com.io.dao;

import java.util.List;

import com.io.entity.Employee;

public interface EmployeeDAO {

	public Employee createEmployee(Employee employee);
	public Employee getEmployee(int id);
	//public Employee updateEmployee(Employee employee);
	public void deleteEmployee(int id);
	//public List<Employee> getAllEmployees();
	
}
