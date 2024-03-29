package com.spring.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;




@Component
public class Employee {
	
	private Integer employeeId;
	private String employeeName;
	
	@Autowired
	private Address address;
	
	@Value("101")
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	
	@Value("Prabhakar")
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	

	public Integer getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}

	public Employee(Integer employeeId, String employeeName, Address address) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.address = address;
	}

	public Employee() {
		
	}
	
	
	

}
