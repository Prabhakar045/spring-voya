package com.voya.doctorproject.service;


import java.util.List;

import com.voya.doctorproject.exception.DoctorNotFoundException;
import com.voya.doctorproject.exception.IdNotFoundException;
import com.voya.doctorproject.model.Doctor;

public interface IDoctorService {

    void addDoctor(Doctor doctor);

    void updateDoctor(int doctorId,double fees);

    void deleteDoctor(int doctorId);

    Doctor getById(int doctorId) throws IdNotFoundException;

    List<Doctor> getAll();

    List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException;

    List<Doctor> getBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException;

    List<Doctor> getBySpecialityAndLessFees(String speciality, double fees)throws DoctorNotFoundException;

    List<Doctor> getBySpecialityAndRatings(String speciality, int ratings)throws DoctorNotFoundException;

    List<Doctor> getBySpecialityAndNameContains(String speciality, String doctorName)throws DoctorNotFoundException;

}
