package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DbConnection;

import dao.patientDao;
import model.Registration;

import model.patient;

public class patientDaoimpl implements patientDao
{

	public static void main(String[] args) 
	
	/*********************test*******************************/
	{
	  /********************執行新增指令*******************************/
	  /*patient p=new patient("嘉惠","P115542750","19740522","female",31,"0912780753","新北市萬里區萬里路43號");
	  new patientDaoimpl().add(p); //newimpl，add則來自Dao的方法*/
		
	/********************查詢帳號（身分證）與密碼（出生年月日）是否再資料庫中*******************************/
		//System.out.println(new patientDaoimpl().queryPatient("N123456789","20001010"));
		
    /********************判斷註冊帳號(身分證)是否與資料庫重複，有則true/否則false*******************************/
	   //System.out.println(new patientDaoimpl().queryPatient("N123456789"));
		
	  /********************執行讀取指令1*******************************/
	 /* List<patient> l = new patientDaoimpl().queryAll();
	  for(patient p:l) {
		  System.out.println("id："+p.getId()+
				  "\n姓名："+p.getName()+
				  "\n身分證："+p.getId_card()+
				  "\n出生日期："+p.getDate_of_birth()+
				  "\n性別："+p.getGender()+
				  "\n年齡："+p.getAge()+
				  "\n手機："+p.getMobile()+
				  "\n地址："+p.getAddress());
	  }*/
	 /*********************執行讀取指令2*************************************/
	 /* List<patient> l = new patientDaoimpl().query("P116342750", "19941414");
	  
	  for(patient p:l) 
	  {
		  System.out.println("id："+p.getId()+
				  "\n姓名："+p.getName()+
				  "\n身分證："+p.getId_card()+
				  "\n出生日期："+p.getDate_of_birth()+
				  "\n性別："+p.getGender()+
				  "\n年齡："+p.getAge()+
				  "\n手機："+p.getMobile()+
				  "\n地址："+p.getAddress());
	 }*/
	 
	  /**********************執行更新指令******************************************/
		/*List<patient> l = new patientDaoimpl().query("P116342750", "19941414");
		for(patient p:l) {
			p.setName("華美");
		    p.setAge(28);
		    new patientDaoimpl().update(p);
		}*/
	/**********************執行刪除指令******************************************/
	//new patientDaoimpl().delete("P115542750");
	}
	

	@Override
	public void add(patient p) {
		Connection conn= DbConnection.getDb();
		String SQL="insert into patient(name,id_card,date_of_birth,gender,age,mobile,address) values(?,?,?,?,?,?,?)"; 
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1,p.getName());
			ps.setString(2,p.getId_card());
			ps.setString(3,p.getDate_of_birth());
			ps.setString(4,p.getGender());
			ps.setInt(5,p.getAge());
			ps.setString(6,p.getMobile());
			ps.setString(7, p.getAddress());
			
			ps.executeUpdate(); //確認執行新增
			
			
		} catch (SQLException e) {
			System.out.println("no");
			e.printStackTrace();
		}
		
	}
	
	/**********************查詢身分證與出生年月日是否符合，符合才可登入******************************/
	@Override
	public patient queryPatient(String id_card, String date_of_birth) 
	{
		Connection conn=DbConnection.getDb(); //連接資料庫
		String SQL="select * from patient where id_card=? and date_of_birth=?"; //查詢資料庫的資料
		patient p=null;
		
		try {
			PreparedStatement ps=conn.prepareStatement(SQL); //將找資料的需求提交給資料庫
			ps.setString(1,id_card);
			ps.setString(2, date_of_birth);
			ResultSet rs=ps.executeQuery(); //資料庫將找資料需求的結果，提交
			
			if(rs.next()) {
				p=new patient();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setId_card(rs.getString("id_card"));
				p.setDate_of_birth(rs.getString("date_of_birth"));
				p.setGender(rs.getString("gender"));
				p.setAge(rs.getInt("age"));
				p.setMobile(rs.getString("mobile"));
				p.setAddress(rs.getString("address"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return p;
	}
	/**********************判斷用身分證註冊帳號時，是否有與資料庫重複******************************/

	@Override
	public boolean queryPatient(String id_card) {
		Connection conn=DbConnection.getDb();
		String SQL="select * from patient where id_card=?";
		boolean x=false;
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, id_card);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {x=true;}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}

	/*********************查詢全部資料*******************************/
	@Override
	public List<patient> queryAll() {
		Connection conn=DbConnection.getDb(); //連接資料庫
		String SQL="select *from patient"; //查詢資料庫的資料
		List<patient> l=new ArrayList<patient>(); //利用動態陣列的方式來找資料
		try {
			PreparedStatement ps=conn.prepareStatement(SQL); //將找資料的需求提交給資料庫
			ResultSet rs=ps.executeQuery(); //資料庫將找資料需求的結果，提交
			
			while(rs.next()) 
			{
				patient p=new patient();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setId_card(rs.getString("id_card"));
				p.setDate_of_birth(rs.getString("date_of_birth"));
				p.setGender(rs.getString("gender"));
				p.setAge(rs.getInt("age"));
				p.setMobile(rs.getString("mobile"));
				p.setAddress(rs.getString("address"));
				
				l.add(p); //設定好資料的patient（p）物件，添加到名為 l 的集合中。
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return l;
	}
	/*********************查詢以身分證找資料*******************************/

	@Override
	public List<patient> queryId_card(String id_card) {
		Connection conn=DbConnection.getDb();
		String SQL="select *from patient where id_card=?";
		
		List<patient> l=new ArrayList<patient>(); 
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, id_card);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{
				patient p = new patient();
				p.setName(rs.getString("name"));
				p.setId_card(rs.getString("id_card"));
				p.setDate_of_birth(rs.getString("date_of_birth"));
				p.setGender(rs.getString("gender"));
				p.setAge(rs.getInt("age"));
				p.setMobile(rs.getString("mobile"));
				p.setAddress(rs.getString("address"));
			
				l.add(p);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return l;
	}
		
	
	/**********************查詢並更新身分證與出生日期******************************/
	@Override
	public List<patient> query(String id_card, String date_of_birth) {
		Connection conn=DbConnection.getDb();
		String SQL="select*from patient where id_card=? and date_of_birth=?"; 
		List<patient> l=new ArrayList<patient>();
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, id_card);
			ps.setString(2, date_of_birth);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				patient p=new patient();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setId_card(rs.getString("id_card"));
				p.setDate_of_birth(rs.getString("date_of_birth"));
				p.setGender(rs.getString("gender"));
				p.setAge(rs.getInt("age"));
				p.setMobile(rs.getString("mobile"));
				p.setAddress(rs.getString("address"));
				
				l.add(p);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;
	}
	/************************查詢身分證並更新****************************/	
	@Override
	public patient queryPatientAndUpdate(String id_card) {
		Connection conn=DbConnection.getDb();
		String SQL = "SELECT * FROM patient WHERE id_card=?";

		patient p=null;
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1,id_card);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) 
			{
				p=new patient();
				p.setName(rs.getString("name"));
				p.setId_card(rs.getString("id_card"));
				p.setDate_of_birth(rs.getString("date_of_birth"));
				p.setGender(rs.getString("gender"));
				p.setAge(rs.getInt("age"));
				p.setMobile(rs.getString("mobile"));
				p.setAddress(rs.getString("address"));
				
			
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
	/************************查詢並更新身分證與出生日期****************************/
	@Override
	public void update(patient p) {
		Connection conn=DbConnection.getDb();
		String SQL="update patient set name=?,id_card=?,date_of_birth=?,gender=?,age=?,mobile=?,"
				+ "address=? where id_card=? and date_of_birth=?";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1,p.getName());
			ps.setString(2,p.getId_card());
			ps.setString(3,p.getDate_of_birth());
			ps.setString(4,p.getGender());
			ps.setInt   (5,p.getAge());
			ps.setString(6,p.getMobile());
			ps.setString(7, p.getAddress());
			ps.setString(8, p.getId_card());        // 第8個參數，因為指定以身分證(8)與生日來進行篩選
	        ps.setString(9, p.getDate_of_birth());  // 第9個參數，因為指定以身分證與生日(9)來進行篩選
			
			ps.executeUpdate(); //確認執行更新操作，並更新資料庫
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}

	/**********************查詢並刪除資料******************************/
	@Override
	public void delete(String id_card) {
		Connection conn=DbConnection.getDb();
		String SQL="delete from patient where id_card=?";
		
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1,id_card);
			ps.executeUpdate(); //確認執行刪除操作，並更新資料庫
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}






	


	


	
	
	
	
	
	

}
