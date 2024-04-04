package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	private int emp_id;
	private String emp_name;
	private String Salary;
	@OneToOne
	private Address add_id;
	public int getEmp_id() {
		return emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public String getSalary() {
		return Salary;
	}
	public Address getAdd_id() {
		return add_id;
	}
	Employee()
	{
		
	}
	public Employee(int emp_id, String emp_name, String salary, Address add_id) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		Salary = salary;
		this.add_id = add_id;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", Salary=" + Salary + ", add_id=" + add_id
				+ "]";
	}
	
	
	
}
