package com.struts.action;


import com.opensymphony.xwork2.ActionSupport;
import com.struts.model.Employee;

public class EmployeeAction extends ActionSupport{
	
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public String execute() {
		if(employee.getEmployeeName().equals("Prabhakar")) {
			return "success";
		}
		  
		return "error";
	}
	
}
