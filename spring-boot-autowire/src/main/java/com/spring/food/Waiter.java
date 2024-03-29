package com.spring.food;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Waiter {
	

	@Autowired
	@Qualifier("getIndian")
    private IFoodMenu iFoodMenu;
	
	

	@Autowired
	IFoodMenu menus;
	
	public void setMenus(IFoodMenu menus) {
		this.menus = menus;
	}
	
	public List<String> viewMenu(String choice){
		List<String> menuList = new ArrayList<>();
		if("indian".equals(choice)) {
			menuList= iFoodMenu.showMenu();
		}
		if("chinese".equals(choice)) {
			menuList= iFoodMenu.showMenu();
		}
		if("italian".equals(choice)) {
			menuList= iFoodMenu.showMenu();
		}
		
		return menuList;
		
	}

	
}
