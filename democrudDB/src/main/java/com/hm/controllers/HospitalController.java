package com.hm.controllers;


import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hm.model.Patient;
import com.hm.services.PatientService;

@RestController
public class HospitalController {
	
	@Autowired
	PatientService patientService;

	@GetMapping(value="/getAllPatient")
	public List<Patient> getAllPatient() throws SQLException {
		return patientService.getAllPatients();
	}
	
	
	@GetMapping(value="/getPatientById/{id}")
	public Patient getPatientById(@PathVariable long id) {
		return null;
		
		
		
	}
	
	@PostMapping(value="/createPatient")
	public void createPatient(@RequestBody Patient patient) throws SQLException {
		if(patient!=null) {
		patientService.createPatient(patient);
		}
		//return patient;
		
	}
	
	@DeleteMapping(value="/deletePatient")
	public boolean deletePatient(@RequestParam("id") int id) throws SQLException {
		return patientService.deletePatient(id);
		
	}
	
	
}
