package com.tndif.jdbcdemo;

import java.sql.*;

public class Jdbcdemo {
	
	private static String DRIVERNAME="org.postgresql.Driver";
	private static String USERNAME="postgres";
	private static String PASSWORD="udaya.123";
	//private static String DBNMAE="Kprit";
	private static String URL="jdbc:postgresql://localhost:5432/Kprit";
	  

	public static void main(String[] args) {
		
//		  String DRIVERNAME="org.postgresql.Driver";
//		  String USERNAME="postgresql";
//		  String PASSWORD="udaya.123";
//		  String DBNMAE="KPRIT";
//		  String URL="jdbc:postgresql://localhost:5433/kprit"
		
		try {
			//1.Load the Driver
			Class.forName(DRIVERNAME);
			System.out.println("Driver loaded");
			
			//2.Get Connection
			Connection con=DriverManager.getConnection(URL, USERNAME, PASSWORD);
			 System.out.println("Connected to PostgreSQL successfully!");
			 
			 //3.create statement
			 String query="select * from student";
			 Statement stmt=con.createStatement();
			 
			 //4.execute query
			 ResultSet rs=stmt.executeQuery(query);
			 System.out.println("query executed");
			 
			 //5.retrieve data 
			
			 while(rs.next()) {
				 System.out.println(rs.getInt(1));
				 System.out.println(rs.getString(2));
				 System.out.println(rs.getString(3));
				 
			 }
			 //6 close resources
			 stmt.close();
			 con.close();
			 System.out.println("connection closed");
		  
		  
	}
		catch(Exception e) {
			System.out.println(e);
			
		}

}
}
