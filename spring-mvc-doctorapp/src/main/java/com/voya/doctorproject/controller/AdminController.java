package com.voya.doctorproject.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class AdminController {

	@RequestMapping("admin")
	public String admin(Model model) {
		
		
		return "login";
		
	}
	
	@RequestMapping("login")
	public String login(@RequestParam("username") String username,@RequestParam("password") String password, Model model) {
		
		if(username.equals("admin") && password.equals("admin")) {
			return "admin";
		}
		
		return "login";
		
	}
	
	@RequestMapping("add-doctor-form")
	public String addDoctor(Model model) {
		
		
		return "addDoctor";
		
	}
	
	@RequestMapping("update-doctor-form")
	public String updateDoctor(Model model) {
		
		
		return "updateDoctor";
		
	}
	
	@RequestMapping("delete-doctor-form")
	public String deleteDoctor(Model model) {
		
		
		return "deleteDoctor";
		
	}
	
}
