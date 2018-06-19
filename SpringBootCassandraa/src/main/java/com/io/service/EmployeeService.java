package com.io.service;

import com.io.entity.Employee;

public interface EmployeeService {
	
public Employee createEmployee(Employee employee);
    
   
    public Employee getEmployee(int id);
  // public Employee updateEmployee(Employee employee);
   public void deleteEmployee(int id);
  // public List<Employee> getAllEmployees();

}
