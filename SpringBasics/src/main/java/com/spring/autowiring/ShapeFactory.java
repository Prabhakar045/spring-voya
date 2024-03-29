package com.spring.autowiring;

import java.awt.Shape;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class ShapeFactory {
	
	@Autowired
	@Qualifier("traingle")
	private IShape shape;
	
	@Autowired
	private Shape triangle;
	
	private Shape shaper;
	
	
	
	public ShapeFactory(IShape shape) {
		super();
		this.shape = shape;
	}

	void printArea(int x, int y) {
		System.out.println("printing area: ");
	}

	public IShape getShape() {
		return shape;
	}

	
	public void setShape(IShape shape) {
		this.shape = shape;
	}
	
}
