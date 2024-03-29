package com.voya.doctorproject.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.voya.doctorproject.model.Doctor;
import com.voya.doctorproject.util.Queries;

@Repository
public class DoctorRepositoryImpl implements IDoctorRepository {

	private JdbcTemplate jdbcTemplate;
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	@Override
	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		Object[] doctorArr = {doctor.getDoctorName(),doctor.getSpeciality(),doctor.getExperience(),doctor.getRatings(),doctor.getFees()};
		jdbcTemplate.update(Queries.InsertQuery,doctorArr);
		
	}

	@Override
	public void updateDoctor(int doctorId, double fees) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(Queries.UpdateQuery,doctorId,fees);
		
	}

	@Override
	public void deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(Queries.DeleteQuery,doctorId);
	}

	@Override
	public Doctor findById(int doctorId) {
		// TODO Auto-generated method stub
		Doctor doctor= jdbcTemplate.queryForObject(Queries.FindById, new DoctorMapper(),doctorId);
		return doctor;
	
	}

	@Override
	public List<Doctor> findAll() {
		// TODO Auto-generated method stub
		DoctorMapper mapper = new DoctorMapper();
		List<Doctor> doctor = jdbcTemplate.query(Queries.FindAllQuery,mapper);
		return doctor;
	
	}

	@Override
	public List<Doctor> findBySpeciality(String speciality) {
		// TODO Auto-generated method stub
		DoctorMapper mapper = new DoctorMapper();
		List<Doctor> doctor = jdbcTemplate.query(Queries.FindBySpeciality,mapper,speciality);
		return doctor;
	
	}

	@Override
	public List<Doctor> findBySpecialityAndExp(String speciality, int experience) {
		// TODO Auto-generated method stub
		DoctorMapper mapper = new DoctorMapper();
		List<Doctor> doctor = jdbcTemplate.query(Queries.FindBYSpecialityAndExperience,mapper,speciality,experience);
		return doctor;
	}

	@Override
	public List<Doctor> findBySpecialityAndLessFees(String speciality, double fees) {
		// TODO Auto-generated method stub
		DoctorMapper mapper = new DoctorMapper();
		List<Doctor> doctor = jdbcTemplate.query(Queries.FindBySpecialityAndFees,mapper,speciality,fees);
		return doctor;
	}

	@Override
	public List<Doctor> findBySpecialityAndRatings(String speciality, int ratings) {
		// TODO Auto-generated method stub
		DoctorMapper mapper = new DoctorMapper();
		List<Doctor> doctor = jdbcTemplate.query(Queries.FindBySpecialityAndRatings,mapper,speciality,ratings);
		return doctor;
	}

	@Override
	public List<Doctor> findBySpecialityAndNameContains(String speciality, String doctorName) {
		// TODO Auto-generated method stub
		DoctorMapper mapper = new DoctorMapper();
		List<Doctor> doctor = jdbcTemplate.query(Queries.FindBySpecialityAndName,mapper,speciality,doctorName);
		return doctor;
	}


}
