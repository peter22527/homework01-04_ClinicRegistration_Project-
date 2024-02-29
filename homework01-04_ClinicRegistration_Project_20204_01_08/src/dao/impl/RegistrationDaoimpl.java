package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DbConnection;
import dao.RegistrationDao;
import model.Registration;

public class RegistrationDaoimpl implements RegistrationDao
{
	public static void main(String[] args)
	{
	/******************************************************************************************/
		/*List<Registration> l = new RegistrationDaoimpl().QueryRegistration("N123456789");
		
		  for(Registration r:l) 
		  {
			  System.out.println(  
					  "\n姓名："+r.getName()+
					  "\n出生日期："+r.getDate_of_birth()+
					  "\n年齡："+r.getAge()+	
					  "\n身分證："+r.getId_card()+				  		
					  "\n科別："+r.getDepartment()+
					  "\n醫師："+r.getDoctor()+
					  "\n日期："+r.getDate()+
					  "\n時間："+r.getTime()+
					  "\n掛號號碼："+r.getNumber());
		  }
	/******************************************************************************************/

	}    
	
	
	
	
	
	
	
	
    //read 01
	@Override 
	public List<Registration> QueryRegistration(String id_card) {
		Connection conn = DbConnection.getDb();
		String SQL="select*from QueryRegistration where id_card=?";
		
		List<Registration> l = new ArrayList();		
		
		try {
			
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, id_card);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{
				Registration r = new Registration();
				r.setName(rs.getString("name"));
				r.setDate_of_birth(rs.getString("date_of_birth"));
				r.setAge(rs.getInt("age"));
				r.setId_card(rs.getString("id_card"));
				r.setDepartment(rs.getString("department"));
				r.setDoctor(rs.getString("doctor"));
				r.setDate(rs.getString("date"));
				r.setTime(rs.getString("time"));
				r.setNumber(rs.getString("number"));
				
				l.add(r);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;
	}
	
	

}
