package com.example.controllers;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Patient;
import com.example.repos.PatientRepo;

@RestController
public class PatientController {
	@Autowired
	PatientRepo patientRepo;
	
	
	@GetMapping(value="/getAllPatients")
	public List<Patient> getAllPatients(){
		return   patientRepo.getAllPatient();
		
	}
	
	@PostMapping(value="/createNewPatient")
	public void createNewPatient(Patient patient) {
		patientRepo.createNewPatient(patient);
		
	}
	
	@DeleteMapping(value = "/deletePatient")
	public boolean deletePatient(@RequestParam("id") int id) throws SQLException {
		return patientRepo.deletePatient(id);
		
	}

}
