package com.io.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.io.entity.Employee;
import com.io.entity.EmployeeForm;
import com.io.entity.Items;
import com.io.service.EmployeeService;
//import org.springframework.web.bind.annotation.RestController;
//@ComponentScan
@RestController
public class EmployeeController {
	
	private static final Logger logger = Logger.getLogger(EmployeeController.class);
	
	@Autowired
    private EmployeeService employeeService;
	
	
	private Employee employee; 
	
	public EmployeeController() {
        System.out.println("EmployeeController()");
    }
	
	private static List<Employee> addEmployee = new ArrayList<Employee>();
	
	
	static {
		addEmployee.add(new Employee(5,"Rohan",27,200));
		addEmployee.add(new Employee(6,"Abhilash",28,1000));
		addEmployee.add(new Employee(7,"Avatar",29,2000));
		addEmployee.add(new Employee(8,"Vipin",30,3000));
		
	}
	
	/*@Value("${welcome.message:test}")
	private String message = "Hello World";
	
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "Rakesh";
	}*/
	
/*	
	@RequestMapping(value ="/employee", method = RequestMethod.POST)    
   public ResponseEntity<Items> addItems() { 
		
		Items addItem = new Items();
		addItem.setTypeID("code111");
		employee.setAge(26);
		employee.setName("ram");
		employee.setSalary(10000);
		employeeService.createEmployee(employee);
		return new ResponseEntity<Items>(addItem, HttpStatus.ACCEPTED);
        //return employeeService.createEmployee(employee);
    }*/
	
	
	
	@RequestMapping(value ="/employee", method = RequestMethod.POST)    
	   public ResponseEntity<Employee> addEmployee() { 
			Employee employee = new Employee();
			logger.debug("Rakesh is executed!");
			//logs debug message
					if(logger.isDebugEnabled()){
						logger.debug("getWelcome is executed!");
					}

					//logs exception
					//logger.error("This is Error message", new Exception("Testing"));
					logger.info("This is an info log entry");
			        logger.error("This is an error log entry");
			
			
			String t = "2013-09-23 17:57:19.860";
		    String[] split = t.split(java.util.regex.Pattern.quote("."));
		    String result= split[0];
		    System.out.println(result);
			employee.setId(9);
			employee.setAge(26);
			employee.setName("ram");
			employee.setSalary(10000);
			employeeService.createEmployee(employee);
			return new ResponseEntity<Employee>(employee, HttpStatus.ACCEPTED);
	        //return employeeService.createEmployee(employee);
	    }
	
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("contactForm") EmployeeForm employeeForm) {
		System.out.println(employeeForm);
		System.out.println(employeeForm.getEmployee());
		
		employeeForm.setEmployee(addEmployee);
		List<Employee> addEmployee = employeeForm.getEmployee();
		
		
		if(null != addEmployee && addEmployee.size() > 0) {
			EmployeeController.addEmployee = addEmployee;
			for (Employee emp : addEmployee) {
				System.out.printf("%s \t %s \n", emp.getId(), emp.getName() , emp.getAge(), emp.getSalary());
				
				employeeService.createEmployee(emp);
			}
		}
		
		
		return new ModelAndView("show_employee", "employeeForm", employeeForm);
	}
 
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable("id") int id) {
        employeeService.deleteEmployee(id);
    }
 
    
 
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    Employee findById(@PathVariable("id") int id) {        
        return employeeService.getEmployee(id);
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.GET) 
    public ResponseEntity<String>  add() {
    	//	return "Helloworld Welcome to KROGER KIC";
    	    		return new ResponseEntity("hi", HttpStatus.OK);
   	}
	

}
