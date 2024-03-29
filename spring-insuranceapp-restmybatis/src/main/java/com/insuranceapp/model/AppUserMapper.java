package com.insuranceapp.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class AppUserMapper {
	
	public AppUser convertTOAppUser(UserDetails userDetails) {
		String username = userDetails.getUsername();
		String password = userDetails.getPassword();
		
//		List<GrantedAuthority> authorities = 
		userDetails.getAuthorities();
		AppUser appUser=new AppUser();
		appUser.setUserName(username);
		appUser.setPassword(password);
		return appUser;
		
	}
	
	//convert db to frontend
	public UserDetails convertTOUserzDetails(AppUser appUser) {
		String username = appUser.getUserName();
		String password = appUser.getPassword();
		
		List<GrantedAuthority> authorities = new ArrayList<>();
		List<String> roles = Arrays.asList("user","admin");
		for(String role:roles) {
			//add to the list of grantauthority
			SimpleGrantedAuthority simAuthority = new SimpleGrantedAuthority(role);
		    authorities.add(simAuthority);
		}
		UserDetails details = new User(username,password,authorities);
		return details;
		
		
	}
}
