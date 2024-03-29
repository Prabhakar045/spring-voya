package com.struts.action;

import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport{

	private String employeeName;
	private int employeeID;
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	public String execute() {
		return SUCCESS;
	}
	
}
