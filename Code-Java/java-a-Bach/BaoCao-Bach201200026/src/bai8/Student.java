package bai8;

public class Student {
	private String id;
	private String firstname;
	private String lastname;
	private String email;
	private String gender;
	private String phone;
	
	public Student() {
		super();
	}
	
	public Student(String std) {
		String[] a = std.split(",");
		id = a[0];
		firstname = a[1];
		lastname = a[2];
		email = a[3];
		gender = a[4];
		phone = a[5];
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void display() {
		System.out.printf("\n%-5s %-20s %-20s %-40s %-12s %-20s ",id, firstname, lastname, email, gender, phone);
	}
	
}
