package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectToDB {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/mysql?useSSL=false","root","nithin2606");
//			thge second mysql in the above line is the name of the database 
			
			System.out.println("connected");
			connection.close();
			System.out.println("closed");
				
		} catch (SQLException | ClassNotFoundException e) {

			e.printStackTrace();
		}
		
		//added this line to check the git commands
		
		// a few more edits.
	}
}