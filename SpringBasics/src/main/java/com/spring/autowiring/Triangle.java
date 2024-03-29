package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Triangle implements IShape{

	@Override
	public void area(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("area of traingle" + (x*y)/2);
	}


}
