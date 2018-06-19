package com.io.entity;

import java.sql.Timestamp;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("emp")
public class Employee {
	@PrimaryKey("id")
    private long id;    
    
    @Column("name")
    private String name;    
    
    @Column
    private int age;    
    
    @Column(value ="salary")
    private float salary;
    
    @Column(value="joiningDate")
    private Timestamp joiningDate;

    
    
    
  
	public Employee() {
        super();        
    }
    
    public Employee(long id, String name, int age, float salary) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
    
	
	  public Timestamp getJoiningDate() {
			return joiningDate;
		}

		public void setJoiningDate(Timestamp joiningDate) {
			this.joiningDate = joiningDate;
		}

    
	 @Override
	    public String toString() {
	        return "Employee [id=" + id + ", name=" + name + ", age=" + age
	                + ", salary=" + salary + "]";
	    }  


}
