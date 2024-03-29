package com.spring.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Course {
	
	
	private String courseName;
	private double fees;
	
	public String getCourseName() {
		return courseName;
	}
	
	@Value("${student.course.courseName}")
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getFees() {
		return fees;
	}
	
	@Value("${student.course.fees}")
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Couse [courseName=" + courseName + ", fees=" + fees + "]";
	}
	
	
}
