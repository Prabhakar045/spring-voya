package com.insuranceapp.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.insuranceapp.model.AppUser;

public interface IAppUserRepository  {

	@Insert("insert into app_user values(#{userName},#{password},#{email},#{authorities})")
	void addUser(AppUser appUser);
	
	@Select("select * from app_user where user_name=#{userName} ")
	AppUser findByUserName(String userName);
}
