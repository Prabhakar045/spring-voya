package com.spring.food;

import java.util.Arrays;
import java.util.List;


public class Indian implements IFoodMenu{

	@Override
	public List<String> showMenu() {
		// TODO Auto-generated method stub
		return Arrays.asList("biryani","butter chicken","nann");
	}

}
