package com.io.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.io.dao.EmployeeDAO;
import com.io.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	/*@Autowired
    private EmployeeService employeeService;*/
	
	
	
	@Autowired  
    private EmployeeDAO employeeDAO;
	
	@Override
	public Employee createEmployee(Employee employee) {
		return employeeDAO.createEmployee(employee);
	}

	@Override
	public Employee getEmployee(int id) {
		 return employeeDAO.getEmployee(id);
	}

	@Override
	public void deleteEmployee(int id) {
		 employeeDAO.deleteEmployee(id);		
	}

}
