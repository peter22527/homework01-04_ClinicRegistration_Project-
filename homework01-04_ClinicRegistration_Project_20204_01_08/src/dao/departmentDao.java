package dao;



import java.util.List;

import controller.selectDepartmentDoctor.selectInternalMedicineDepartmentUI3_1;
import controller.selectRegistrationManager.selectDepartmentsUI2;
import model.departments;
import model.patient;



public interface departmentDao {
    //create 01 新增掛號方法
	void add(departments dep);
	
	//read 01 
    
	//update 01
	
	//delete 01
	void delete (String dep); //刪除掛號抽象方法

	

    
}
