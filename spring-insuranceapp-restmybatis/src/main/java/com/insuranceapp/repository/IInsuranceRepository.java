package com.insuranceapp.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Property;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.insuranceapp.exception.InsuranceNotFoundException;
import com.insuranceapp.model.Insurance;

@Mapper
public interface IInsuranceRepository {
	
	@Insert("insert into insurance(policy_name, brand,insurance_type,duration,premium) values(#{policyName},#{brand},#{type},#{duration},#{premium})")
	void addInsurance(Insurance insurance);
	
	@Update("update insurance set premium=#{premium} where insurance_id= #{insuranceId}")
	@Results({@Result(property = "premium", column = "premium")})
	void updateInsurance(int insuranceId, double premium);
	
	@Delete("delete from insurance where insurance_id= #{insuranceId}")
	void deleteInsurance(int insuranceId);
	
	@Select("select * from product")
	@Results(
			{@Result(property = "insuranceId", column = "insurance_id"),
				@Result(property = "policyName", column = "policy_name")
				})
	List<Insurance> getAll();
	
	@Select("select * from insurance where brand=#{brand}")
	List<Insurance> getByBrand(String brand)throws InsuranceNotFoundException;
	
	@Select("select * from insurance where brand=#{brand} and insurance_type=#{type}")
	List<Insurance> getByBrandAndType(String brand, String type);
	
	@Select("select * from insurance where insurance_type=#{type} and price=#{price}")
	List<Insurance> getByTypeAndLesserPremium(String type, double premium);
	
	@Select("select * from insurance where insurance_id=#{insuranceId}")
	Insurance getById(int insuranceId);
}