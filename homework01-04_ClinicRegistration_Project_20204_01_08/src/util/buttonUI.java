package util;

import controller.patient.loginUI;
import controller.patient.addPatientErrorUI;
import controller.patient.addPatientSuccessUI;
import controller.patient.addPatientUI;
import controller.patient.loginErrorUI;
import controller.patient.registrationManagerUI;
import controller.selectDepartmentDoctor.selectDrematologyDepartemntUI3_4;
import controller.selectDepartmentDoctor.selectGastroenterologyClinicUI3_6;
import controller.selectDepartmentDoctor.selectInternalMedicineDepartmentUI3_1;
import controller.selectDepartmentDoctor.selectOrthopedicsDepartmentUI3_5;
import controller.selectDepartmentDoctor.selectOtorhinolaryngologyClinicUI3_3;
import controller.selectDepartmentDoctor.selectSurgicalDepartmentUI3_2;
import controller.selectRegistrationManager.selectDepartmentsUI2;
import controller.selectRegistrationManager.enterId_cardUI1;
import controller.selectRegistrationManager.selectSuccessUI6;
import controller.selectRegistrationManager.selectTimeUI5;
import editPatient.deletePatinetUI3;
import editPatient.queryPatientUI1;
import editPatient.updatePatientUI2;


public class buttonUI {
	
	//進入掛號系統頁面
	public static void addregistrationManagerUI() 
	{
		registrationManagerUI addregistrationManagerUI=new registrationManagerUI();
		addregistrationManagerUI.setVisible(true);
	}
	//進入登入錯誤頁面
	public static void addloginErrorUI()
	{
		loginErrorUI addloginErrorUI=new loginErrorUI();
		addloginErrorUI.setVisible(true);
	}
	
	
	//回查詢掛號頁面
	public static void addQueryRegistrationUI1() 
	{
		controller.queryRegistration.QueryRegistrationUI addQueryRegistrationUI1=new controller.queryRegistration.QueryRegistrationUI();
		addQueryRegistrationUI1.setVisible(true);
	}
	
	//回取消掛號頁面
	public static void addCancelRegistration()
	{
		controller.queryRegistration.CancelRegistrationUI addCancelRegistration=new controller.queryRegistration.CancelRegistrationUI();
		addCancelRegistration.setVisible(true);
	}
	
	//回大城小醫診所網路掛號系統頁 
	public static void addregistrationSuccessUI() 
	{
		registrationManagerUI addregistrationSuccessUI=new registrationManagerUI();
		addregistrationSuccessUI.setVisible(true);
	}

	//回初診資料填寫
	public static void addaddPatientUI() {
		addPatientUI addaddPatientUI=new addPatientUI();
		addaddPatientUI.setVisible(true);
	}
	
	//返回登入頁面
	public static void addLoginUI() 
	{
		loginUI addLoginUI=new loginUI();
		addLoginUI.setVisible(true);
	}
	//顯示填寫初診資料失敗頁面
	public static void addaddPatientErrorUI() 
	{
		addPatientErrorUI addaddPatientErrorUI=new addPatientErrorUI();
		addaddPatientErrorUI.setVisible(true);
	}
	
	//顯示填寫初診資料成功頁面
	public static void addaddPatientSuccessUI() 
	{
		addPatientSuccessUI addaddPatientSuccessUI=new addPatientSuccessUI();
		addaddPatientSuccessUI.setVisible(true);
	}
	
	
	
	//查詢個人資料
	public static void addqueryPatientUI1()
	{
		queryPatientUI1 addqueryPatientUI1=new queryPatientUI1();	
		addqueryPatientUI1.setVisible(true);
	}
	
	//修改個人資料
	public static void addupdatePatientUI2()
	{
		updatePatientUI2 addupdatePatientUI2= new updatePatientUI2();
		addupdatePatientUI2.setVisible(true);
	}
	
	//刪除個人資料
	public static void adddeletePatinetUI3() 
	{
		deletePatinetUI3 adddeletePatinetUI3=new deletePatinetUI3();
		adddeletePatinetUI3.setVisible(true);
	}
	
	
	
	//回填網路掛號：1.身分頁
	public static void addselectId_cardUI()
	{
		enterId_cardUI1 addselectId_cardUI=new enterId_cardUI1();
		addselectId_cardUI.setVisible(true);
	}
	
	//回網路掛號：2.科別頁
	public static void addregistrationUI() 
    {
		selectDepartmentsUI2 addregistrationUI=new selectDepartmentsUI2();
		addregistrationUI.setVisible(true);
	}
	//進入一般內科醫師頁面UI1
	public static void addInternalMedicineDepartmentUI1()
	{
		selectInternalMedicineDepartmentUI3_1 addInternalMedicineDepartmentUI1=new selectInternalMedicineDepartmentUI3_1();
		addInternalMedicineDepartmentUI1.setVisible(true);
	}
		
	//進入一般外科醫師頁面UI2
	public static void addSurgicalDepartmentUI2()
	{
		selectSurgicalDepartmentUI3_2 addSurgicalDepartmentUI2=new selectSurgicalDepartmentUI3_2();
		addSurgicalDepartmentUI2.setVisible(true);
	}
		
	//進入耳鼻喉科醫師頁面UI3
	public static void addOtorhinolaryngologyClinicUI3()
	{
		selectOtorhinolaryngologyClinicUI3_3 addOtorhinolaryngologyClinicUI3=new selectOtorhinolaryngologyClinicUI3_3();
		addOtorhinolaryngologyClinicUI3.setVisible(true);
	}
		
	//進入皮膚科醫師頁面UI4
	public static void addDrematologyDepartemntUI4() 
	{
		selectDrematologyDepartemntUI3_4 addDrematologyDepartemntUI4=new selectDrematologyDepartemntUI3_4();
		addDrematologyDepartemntUI4.setVisible(true);
	}
	//進入骨科醫師頁面UI5
	public static void addOrthopedicsDepartmentUI5()
	{
		selectOrthopedicsDepartmentUI3_5 addOrthopedicsDepartmentUI5=new selectOrthopedicsDepartmentUI3_5();
		addOrthopedicsDepartmentUI5.setVisible(true);
	}
	//進入肝膽腸胃科醫師頁面UI6
	public static void addGastroenterologyClinicUI6() 
	{
		selectGastroenterologyClinicUI3_6 addGastroenterologyClinicUI6=new selectGastroenterologyClinicUI3_6();
		addGastroenterologyClinicUI6.setVisible(true);
	}	
		
	//回網路掛號：3.日期頁
	public static void addregistrationDate() 
	{
		controller.selectRegistrationManager.selectRegistrationDateUI4 addregistrationDate=new controller.selectRegistrationManager.selectRegistrationDateUI4();
		addregistrationDate.setVisible(true);
	}	

   //回網路掛號：4.時間頁
	public static void addselectTimeUI() 
	{
		selectTimeUI5 addselectTimeUI=new selectTimeUI5();
		addselectTimeUI.setVisible(true);
	}	
		
	//回網路掛號：5.掛號成功頁
	public static void addselectSuccessUI() 
	{
		selectSuccessUI6 addselectSuccessUI = new selectSuccessUI6();
		addselectSuccessUI.setVisible(true);
	}
	
}
