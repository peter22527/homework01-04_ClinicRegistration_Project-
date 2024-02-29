package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection 
{
	/*******************test****************************/
	public static void main(String[] args) 
	{
		System.out.println(DbConnection.getDb());
	}
	
	
	/**************************************************/
	public static Connection getDb() {
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/clinic";
		String username="root";
		String password="1234";
		
		try {
			conn=DriverManager.getConnection(url,username,password);
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
