package dao;

import java.util.List;

import model.patient;

public interface patientDao 
{
	
	//create 01
	void add(patient p); //新增基本病歷資料
	
	
	
	//read 01
	patient queryPatient(String id_card,String date_of_birth); //查詢身分證與生日是否符合，符合才可以登入的方法
	boolean queryPatient(String id_card);
	List<patient> queryAll(); //查詢全部資料的方法
	List<patient> query(String id_card,String date_of_birth); //輸入"身分證字號"+"出生年月日"，查詢資料的方法
	List<patient> queryId_card(String id_card); //輸入"身分證字號"查詢資料的方法
	patient queryPatientAndUpdate(String id_card); 
	
	
	
	//update 01
	void update (patient p); //更新資料方法
	
	
	
	
	
	//delete 01
	void delete(String id_card); //刪除資料方法
	


}
