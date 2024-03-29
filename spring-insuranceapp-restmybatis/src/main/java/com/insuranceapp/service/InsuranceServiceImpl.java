package com.insuranceapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insuranceapp.exception.InsuranceNotFoundException;
import com.insuranceapp.model.Insurance;
import com.insuranceapp.repository.IInsuranceRepository;

@Service
public class InsuranceServiceImpl implements IInsuranceService{

	@Autowired
	IInsuranceRepository insuranceRepository;
	
	@Override
	public void addInsurance(Insurance insurance) {
		// TODO Auto-generated method stub
		insuranceRepository.addInsurance(insurance);
		
	}

	@Override
	public void updateInsurance(int insuranceId, double premium) {
		// TODO Auto-generated method stub
		insuranceRepository.updateInsurance(insuranceId,premium);
	}

	@Override
	public void deleteInsurance(int insuranceId) {
		// TODO Auto-generated method stub
		insuranceRepository.deleteInsurance(insuranceId);
	}

	@Override
	public List<Insurance> getAll() {
		// TODO Auto-generated method stub
		return insuranceRepository.getAll();
	}

	@Override
	public List<Insurance> getByBrand(String brand) throws InsuranceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Insurance> getByAndType(String brand, String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Insurance> getByTypeAndLesserPremium(String type, double premium) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Insurance getById(int insuranceId) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
