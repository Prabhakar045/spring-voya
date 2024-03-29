package com.insuranceapp.model;

import java.util.List;

public class AppUser {

	private Integer userId;
	private String userName;
	private String password;
	private String email;
	private List<String> authorities;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getAuthorities() {
		return authorities;
	}
	public void setAuthorities(List<String> authorities) {
		this.authorities = authorities;
	}
	@Override
	public String toString() {
		return "AppUser [userId=" + userId + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", authorities=" + authorities + "]";
	}
	public AppUser(Integer userId, String userName, String password, String email, List<String> authorities) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.authorities = authorities;
	}
	public AppUser() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
