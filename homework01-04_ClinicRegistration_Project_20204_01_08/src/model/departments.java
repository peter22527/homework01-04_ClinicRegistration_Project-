package model;

public class departments {
	
	//field
	private Integer id;
	private String id_card;
	private String department;
	private String doctor;
	private String date;
	private String time;
	private String number;
	
	
	
	public departments() {
		super();
	}



	public departments(String id_card, String department, String doctor, String date,String time, String number) {
		super();

		this.id_card = id_card;
		this.department = department;
		this.doctor = doctor;
		this.date = date;
		this.time = time;
		//this.number = String.valueOf(number);
		this.number = number;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}

	public String getId_card() {
		return id_card;
	}


	public void setId_card(String id_card) {
		this.id_card = id_card;
	}

	
	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public String getDoctor() {
		return doctor;
	}



	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getTime() {
		return time;
	}



	public void setTime(String time) {
		this.time = time;
	}



	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}
	
	
	
	
  
	
}