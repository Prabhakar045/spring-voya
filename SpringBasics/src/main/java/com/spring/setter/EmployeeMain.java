package com.spring.setter;

import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.setter");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);
//		
//		Employee employee2 = context.getBean("employee2",Employee.class);
//		System.out.println(employee2);
//		
//		 employee2 = context.getBean(Employee.class);
//		System.out.println(employee2);
//		
		String[] beans =context.getBeanDefinitionNames();
			for(String bean:beans) {
				System.out.println(bean);
			}
			
			
	}

}




























