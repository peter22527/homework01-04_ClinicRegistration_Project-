package model;

public class patient {
	
	//field
	private Integer id;
	private String name;
	private String id_card;
	private String date_of_birth;
	private String gender;
	private Integer age;
	private String mobile;
	private String address;
	
	
	
	//constructor
	public patient() {
		super();
	}


	public patient(String name, String id_card, String date_of_birth, String gender, Integer age, String mobile,
			String address) {
		super();
		this.name = name;
		this.id_card = id_card;
		this.date_of_birth = date_of_birth;
		this.gender = gender;
		this.age = age;
		this.mobile = mobile;
		this.address = address;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getId_card() {
		return id_card;
	}



	public void setId_card(String id_card) {
		this.id_card = id_card;
	}



	public String getDate_of_birth() {
		return date_of_birth;
	}



	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public String getMobile() {
		return mobile;
	}



	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}




	
	
	//method
	
	
	

}
