package com.voya.doctorproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voya.doctorproject.exception.DoctorNotFoundException;
import com.voya.doctorproject.exception.IdNotFoundException;
import com.voya.doctorproject.model.Doctor;
import com.voya.doctorproject.repository.IDoctorRepository;

@Service
public class DoctorServiceImpl implements IDoctorService{

	@Autowired
    private IDoctorRepository doctorRepository;
    
   

	@Override
	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorRepository.addDoctor(doctor);
		
	}

	@Override
	public void updateDoctor(int doctorId, double fees) {
		// TODO Auto-generated method stub
		doctorRepository.updateDoctor(doctorId, fees);
	}

	@Override
	public void deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub
		doctorRepository.deleteDoctor(doctorId);
		
	}

	@Override
	public Doctor getById(int doctorId) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return doctorRepository.findById(doctorId);
	}

	@Override
	public List<Doctor> getAll() {
		// TODO Auto-generated method stub
		return doctorRepository.findAll();
	}

	@Override
	public List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return doctorRepository.findBySpeciality(speciality);
	}

	@Override
	public List<Doctor> getBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return doctorRepository.findBySpecialityAndExp(speciality, experience);
	}

	@Override
	public List<Doctor> getBySpecialityAndLessFees(String speciality, double fees) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return getBySpecialityAndLessFees(speciality, fees);
	}

	@Override
	public List<Doctor> getBySpecialityAndRatings(String speciality, int ratings) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return getBySpecialityAndRatings(speciality, ratings);
	}

	@Override
	public List<Doctor> getBySpecialityAndNameContains(String speciality, String doctorName)
			throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return getBySpecialityAndNameContains(speciality, doctorName);
	}


    
}
