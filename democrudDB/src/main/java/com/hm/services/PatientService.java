package com.hm.services;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hm.model.Patient;
import com.hm.repos.PatientRepos;

@Service
public class PatientService {
	@Autowired
	PatientRepos patientRepos;
	
	public void createPatient(Patient patient) throws SQLException {
		
		patientRepos.insertPatient(patient);
		
		
	}
	
	public List<Patient> getAllPatients() throws SQLException {
		return patientRepos.getAllPatientDetails();
	}

	public boolean deletePatient(int id) throws SQLException {
		// TODO Auto-generated method stub
		return patientRepos.deletePatient(id);
		
	}

}
