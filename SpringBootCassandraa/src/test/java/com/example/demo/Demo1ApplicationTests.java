package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.io.dao.EmployeeDAO;
import com.io.entity.Employee;
import com.io.service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo1ApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Autowired
	private EmployeeService employeeService;
	
	/*@Test
    public void testRegister()
    {
        Employee empl = new Employee(); 
        empl.setAge(25);
        empl.setName("Jane Doe");
        empl.setId(9);

        employeeService.createEmployee(empl);
        int id = (int) empl.getId();
        Assert.assertNotNull(id);

        Assert.assertEquals(2, employeeService.getEmployee(2));
        Employee newEmp = employeeService.getEmployee(id);

        Assert.assertEquals("Jane Doe", newEmp.getName());
        Assert.assertEquals(25, newEmp.getId());
        Assert.assertEquals(9, newEmp.getAge());
        return;
    }
*/
	

}
