package dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import controller.selectDepartmentDoctor.selectInternalMedicineDepartmentUI3_1;
import controller.selectRegistrationManager.selectDepartmentsUI2;
import dao.DbConnection;
import dao.departmentDao;
import model.departments;
import model.patient;

public class departmentDaoimpl implements departmentDao {

	
	public static void main(String[] args) 
	{
	   //test:新增測試
      /*departments dep = new departments("骨科","陳醫師","2023-10-12","11:00","5號");
      new departmentDaoimpl().add(dep);*/
		
	  //test:刪除測試
	  new departmentDaoimpl().delete("N123456789");
	}
	
	
	
	

	@Override
	//create 01 
	public void add(departments dep) {
		Connection conn=DbConnection.getDb();
		String SQL="insert into departments(id_card,department,doctor,date,time,number) values(?,?,?,?,?,?)";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			
			ps.setString(1, dep.getId_card());
			ps.setString(2, dep.getDepartment());
			ps.setString(3, dep.getDoctor());
			ps.setString(4, dep.getDate());
			ps.setString(5, dep.getTime());
			ps.setString(6, dep.getNumber());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}





	@Override
	public void delete (String id_card) {
		Connection conn=DbConnection.getDb();
		String SQL="delete from departments where id_card=?";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, id_card);
			ps.executeUpdate();			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

		
	









	
				
			
			
		
	}





	





	

    
   
    


 


	
	
	
	
