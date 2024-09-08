package com.examples.maven;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MvenExamples {
	
	

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		//maven 3.6.0
		//mysql workbench 
		//java jdk
		//postman
		
		System.out.println("creating connection with db and adding table");
		//Connection conn = DriverManager.getConnection()
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306", "root", "8540985939");
		Statement stmt = conn.createStatement();
		stmt.execute("create database if not exists studentDetails");
		stmt.execute("use studentDetails");
		stmt.execute("create table if not exists jbdl29Au(id int, name varchar(25), address varchar(50))");
		stmt.execute("INSERT INTO jbdl29Au (id, name, address) VALUES (1, 'Sonu', 'Godda')");
		System.out.println(stmt.execute("select * from jbdl29Au"));
		//stmt.execute("select * from jbdl29Au");
		

	}

}
