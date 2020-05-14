package mybatisSpringApplication.entity;

public class Student {

	private int id;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + ", phone=" + phone + ", email="
				+ email + "]";
	}





	private String name;
	private int percentage;
	private int phone;
	private String email;
	
	
	public Student() {
		
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public int getPercentage() {
		return percentage;
	}


	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}




	
	public Student(int id,String name,int percentage, int phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		this.phone = phone;
		this.email = email;
	}
	
}
