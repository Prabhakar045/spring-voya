package com.voya.doctorproject.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.voya.doctorproject.model.Doctor;

public class DoctorMapper implements RowMapper<Doctor>{

	@Override
	public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Doctor doctor = new Doctor();
		doctor.setDoctorId(rs.getInt("doctor_id"));
		doctor.setDoctorName(rs.getString("doctor_name"));
		doctor.setSpeciality(rs.getString("speciality"));
		doctor.setExperience(rs.getInt("experience"));
		doctor.setRatings(rs.getInt("ratings"));
		doctor.setFees(rs.getDouble("fees"));
		return doctor;
	}

}
