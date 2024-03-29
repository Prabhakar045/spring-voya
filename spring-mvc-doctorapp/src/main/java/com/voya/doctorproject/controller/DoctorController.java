package com.voya.doctorproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.voya.doctorproject.model.Doctor;
import com.voya.doctorproject.service.IDoctorService;


@Controller
public class DoctorController {
	
	@Autowired
	private IDoctorService iDoctorService;

	@RequestMapping("/")
	public String home(Model model) {
		
		List<Doctor> doctors = iDoctorService.getAll();
		model.addAttribute("doctors",doctors);
		return "home";
		
	}
	
	@RequestMapping("/addDoctor")
	public String addDoctor(Doctor doctor) {
		System.out.println(doctor);
		iDoctorService.addDoctor(doctor);
		return "admin";
		
	}
	
	@RequestMapping("/editDoctor")
	public String editDoctor(@RequestParam("doctorId") int doctorId,Model model) {
		
		Doctor doctor =iDoctorService.getById(doctorId);
		model.addAttribute("doctor",doctor);
		return "updateDoctor";
		
	}
	
	
	@RequestMapping("/updateDoctor")
	public String updateDoctor(@RequestParam("doctorId") int doctorId,@RequestParam("fees") int fees,Model model) {
		
		iDoctorService.updateDoctor(1, 1200);
		model.addAttribute("message","updated successfully");
		return "admin";
		
	}
	
	@RequestMapping("/deleteDoctor")
	public String deleteDoctor(@RequestParam("doctorId") int doctorId, Model model) {
		System.out.println();
		iDoctorService.deleteDoctor(doctorId);
		model.addAttribute("message","deleted successfully");
		return "admin";
		
	}
	@RequestMapping("/search")
	public String searchDoctor(Doctor doctor) {
		
		return "admin";
		
	}
	
	
}
