package com.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.autowiring");
		
		ShapeFactory shape =(ShapeFactory) context.getBean("shape");
		shape.printArea(5, 6);
	}
}
