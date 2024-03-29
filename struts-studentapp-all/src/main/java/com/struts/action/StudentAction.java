package com.struts.action;

import java.util.Arrays;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.model.Student;

public class StudentAction extends ActionSupport{

	//std object to populate the values 
	private Student student;
	
	public StudentAction() {
		hobbies=Arrays.asList("sleeping","cricket");
	}
	
	
	private List<String> hobbies;

	
	public Student getStudent() {
		return student;
	}

	public String getStud() {
		return null;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies =hobbies;
	}
	
	public String showStudForm() {
		return "none";
		
	}
	
	public String execute() {
		if(student.getName().equals("prabhakar")) {
			return "success";
			
		}
		return "error";
	}
}