package com.insuranceapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.insuranceapp.model.Insurance;

@Service
public class InsuranceServiceImpl implements IInsuranceService{

	@Override
	public List<Insurance> getAll() {
		return getAllInsurances();
		// TODO Auto-generated method stub
	
	}

	@Override
	public Insurance getById(int insuranceId) {
		// TODO Auto-generated method stub
		List<Insurance> insurances = getAllInsurances();
		for(Insurance insurance :insurances) {
			if(insurance.getInsuranceId()==insuranceId) {
				return insurance;
			}
		}
		return null;
	}
	
	public List<Insurance> getAllInsurances() {
		// TODO Auto-generated method stub
		return Arrays.asList(new Insurance(101,"vh-12","voya","health",10,1000.0),
				new Insurance(102,"mj-12","bajaj","health",20,2000.0),
				new Insurance(103,"pk-12","fidelity","health",50,2300.0),
				new Insurance(104,"th-12","t","health",60,4000.0));
	}
	
}