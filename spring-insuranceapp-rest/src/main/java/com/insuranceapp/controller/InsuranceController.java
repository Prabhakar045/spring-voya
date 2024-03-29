package com.insuranceapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insuranceapp.model.Insurance;
import com.insuranceapp.service.InsuranceServiceImpl;

@RestController
public class InsuranceController {
	
	@Autowired
	InsuranceServiceImpl insuranceServiceImpl;
	
	@GetMapping("/insurance")
	List<Insurance> showInsurance(){
		
		return insuranceServiceImpl.getAll();
		
	}
	
	@GetMapping("/insurance/insurance-id/{insuranceId}")
	Insurance getOne(@PathVariable("insuranceId") int insuranceId){
		
		return insuranceServiceImpl.getById(insuranceId);
		
	}
}
