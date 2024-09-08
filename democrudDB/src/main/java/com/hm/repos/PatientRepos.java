package com.hm.repos;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.hm.model.Patient;

@Repository

public class PatientRepos {
	
	Logger logger = LoggerFactory.getLogger(PatientRepos.class);
	private static Connection con;
	
	public PatientRepos() throws SQLException {
		logger.info("inside PatientRepos Constructor");
		// TODO Auto-generated constructor stub
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_management_sys","root", "8540985939");
		createTable();
		
	}
	
	public void createTable() throws SQLException {
		logger.info("inside createtable method");
	    String sqlQuery = "create table if not exists Patient_JBDL61(patientId int primary key auto_increment,name varchar(50),age int,doctorName varchar(50))";
	    Statement statement= con.createStatement();
	    statement.execute(sqlQuery);
	}
	
	public  void insertPatient(Patient patient) throws SQLException {
		logger.info("inside createPatient method");
		String insertQuery = "INSERT INTO Patient_JBDL61(NAME, AGE, DOCTORNAME) VALUES(?,?,?)";
		PreparedStatement preparedStatement = con.prepareStatement(insertQuery);
		preparedStatement.setString(1, patient.getName());
		preparedStatement.setInt(2, patient.getAge());
		preparedStatement.setString(3, patient.getDoctorName());
		
		int val = preparedStatement.executeUpdate();
		logger.info("patient added with val "+  val);
		
		
	}

	public List<Patient> getAllPatientDetails() throws SQLException {
		// TODO Auto-generated method stub
		logger.info("inside getAllPateintDetails method");
		List<Patient> list = new ArrayList<>();
		String selectQuery="select * from Patient_JBDL61";
		Statement statement= con.createStatement();	
		ResultSet rSet=    statement.executeQuery(selectQuery);
		while(rSet.next()) {
			long patientId = rSet.getLong("patientId");
			String name =rSet.getString("name");
			int age=rSet.getInt("age");
			String doctorName=rSet.getString("doctorName");
			Patient patient= new Patient(patientId, name, age, doctorName);	
			list.add(patient);
		}
		return list;
		
		
		
	}

	public boolean deletePatient(int id) throws SQLException {
		// TODO Auto-generated method stub
		logger.info("inside deletePatient method");
		
		String deletQuery =  " delete * from Patient_JBDL61 where id = "+ id;
		Statement statement = con.createStatement();
		//Boolean ans=statement.execute(deletQuery);
		int val=statement.executeUpdate(deletQuery);
		
		return val==1? true:false;
		
		
	}
	
	

}
