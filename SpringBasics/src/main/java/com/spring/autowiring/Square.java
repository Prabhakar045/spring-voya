package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("shaper")

public class Square implements IShape{

	@Override
	public void area(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Area of square: "+(x*x));
	}

}
