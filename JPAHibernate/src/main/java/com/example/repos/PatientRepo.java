package com.example.repos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.dialect.unique.CreateTableUniqueDelegate;

import com.example.models.Patient;

public class PatientRepo {
	private static Connection connection;
	public PatientRepo() throws SQLException {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JPADatabase", "root", "8540985939");
		CreateTable();
	}

	private void CreateTable() throws SQLException {
		// TODO Auto-generated method stub
		String sqlQuery = "create table if not exists PatientTable(patientId int primary key auto_increment,name varchar(50),age int,doctorName varchar(50))";
		Statement statement= connection.createStatement();
		statement.execute(sqlQuery);
		
	}

	public List<Patient> getAllPatient() {
		// TODO Auto-generated method stub
		List<Patient> list = new ArrayList<>();
		return list;
	}

	public void createNewPatient(Patient patient) {
		// TODO Auto-generated method stub
		
		
	}

	public boolean deletePatient(int id) throws SQLException {
		// TODO Auto-generated method stub
		String deleteQuery = "delete from PatientTable where id = "+id;
		Statement statement= connection.createStatement();
		int val = statement.executeUpdate(deleteQuery);
		return val==1?true:false;
	}

}
