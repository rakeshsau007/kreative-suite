package com.io.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.io.entity.Employee;
import com.io.util.MyCassandraTemplate;

@Repository
public class EmployeeDAOImpl  implements EmployeeDAO{

	 @Autowired
	    private MyCassandraTemplate myCassandraTemplate;
	
	
	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return myCassandraTemplate.create(employee);
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return myCassandraTemplate.findById(id, Employee.class);
	}

	/*@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return myCassandraTemplate.update(employee, Employee.class);
	}*/

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		 myCassandraTemplate.deleteById(id, Employee.class);
		
	}

	/*@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		 return myCassandraTemplate.findAll(Employee.class);
	}*/
	
	
	

}
