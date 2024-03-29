package com.voya.doctorproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.voya.doctorproject.exception.DoctorNotFoundException;
import com.voya.doctorproject.exception.IdNotFoundException;
import com.voya.doctorproject.model.Doctor;
import com.voya.doctorproject.model.Specialization;
import com.voya.doctorproject.service.IDoctorService;

@SpringBootApplication(scanBasePackages = {"com"})
public class SpringBootDoctorApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDoctorApplication.class, args);
	}

	@Autowired
	IDoctorService iDoctorService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		
		int doctorIdToUpdate = 1;
        double newFees = 2500.0;
        iDoctorService.updateDoctor(doctorIdToUpdate, newFees);
        /*

        try {
			int doctorId = 1;
			Doctor doctor = iDoctorService.getById(doctorId);
			System.out.println(doctor);
		} catch (IdNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        // Delete doctor
        int doctorIdToDelete = 2;
        iDoctorService.deleteDoctor(doctorIdToDelete);

        // Find doctor by ID
        int doctorIdToFind = 1;
        try {
            Doctor foundDoctor = iDoctorService.getById(doctorIdToFind);
            System.out.println(" Id: " + foundDoctor);
        } catch (IdNotFoundException e) {
            System.out.println("Doctor not found.");
        }

        // Get all doctors
        List<Doctor> allDoctors = iDoctorService.getAll();
        System.out.println("All doctors:");
        for (Doctor doc : allDoctors) {
            System.out.println(doc);
        }

        // Find doctors by specialty
        String specialityToFind = Specialization.GYNAEC.getSpeciality();
        try {
            List<Doctor> doctorsBySpeciality = iDoctorService.getBySpeciality(specialityToFind);

            for (Doctor doc : doctorsBySpeciality) {
                System.out.println(doc);
            }
        } catch (DoctorNotFoundException e) {
            System.out.println("Doctors with specialty not found.");
        }

        // Find doctors by specialty and experience
        int experienceToFind = 2;
        try {
            List<Doctor> doctorsBySpecialityAndExp = iDoctorService.getBySpecialityAndExp(specialityToFind, experienceToFind);

            for (Doctor doc : doctorsBySpecialityAndExp) {
                System.out.println(doc);
            }
        } catch (DoctorNotFoundException e) {
            System.out.println("Doctors not found.");
        }

        // Find doctors by specialty and fees less than
        double maxFees = 2000.0;
        try {
            List<Doctor> doctorsBySpecialityAndLessFees = doctorService.getBySpecialityAndLessFees(specialityToFind, maxFees);

            for (Doctor doc : doctorsBySpecialityAndLessFees) {
                System.out.println(doc);
            }
        } catch (DoctorNotFoundException e) {
            System.out.println("Doctors not found.");
        }

        // Find doctors by specialty and ratings
        int minRatings = 4;
        try {
            List<Doctor> doctorsBySpecialityAndRatings = doctorService.getBySpecialityAndRatings(specialityToFind, minRatings);

            for (Doctor doc : doctorsBySpecialityAndRatings) {
                System.out.println(doc);
            }
        } catch (DoctorNotFoundException e) {
            System.out.println("Doctors  not found.");
        }

        // Find doctors by specialty and name contains
        String doctorNameContains = "Prabhakar";
        try {
            List<Doctor> doctorsBySpecialityAndNameContains = iDoctorService.getBySpecialityAndNameContains(specialityToFind, doctorNameContains);

            for (Doctor doctor1 : doctorsBySpecialityAndNameContains) {
                System.out.println(doctor1);
            }
        } catch (DoctorNotFoundException e) {
            System.out.println("Doctorsnot found.");
        }
        */

	}

}
