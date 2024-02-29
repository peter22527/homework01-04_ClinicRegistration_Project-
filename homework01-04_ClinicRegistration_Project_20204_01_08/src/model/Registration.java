package model;

public class Registration {
	
	//field
	private String name;
	private String date_of_birth;
	private Integer age;
	private String id_card;
	private String department;
	private String doctor;
	private String date;
	private String time;
	private String number;
	
	
	
	//constructor
	public Registration() {
		super();
	}

	public Registration(String name, String date_of_birth, Integer age, String id_card, String department,
			String doctor, String date, String time, String number) {
		super();
		this.name = name;
		this.date_of_birth = date_of_birth;
		this.age = age;
		this.id_card = id_card;
		this.department = department;
		this.doctor = doctor;
		this.date = date;
		this.time = time;
		this.number = number;
	}
	
	
	
	//methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
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
