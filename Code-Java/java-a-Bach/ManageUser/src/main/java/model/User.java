package model;

public class User {
	String name;
	String email;
	String birthday;
	String address;
	String password;
	String confirmpass;
	
	public User() {
	}

	
	public User(String name, String email, String address) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
	}


	public User(String name, String email, String birthday, String password, String confirmpass, String address) {
		super();
		this.name = name;
		this.email = email;
		this.birthday = birthday;
		this.password = password;
		this.confirmpass = confirmpass;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpass() {
		return confirmpass;
	}

	public void setConfirmpass(String confirmpass) {
		this.confirmpass = confirmpass;
	}

	@Override
	public String toString() {
		return "user [name=" + name + ", email=" + email + ", birthday=" + birthday + ", address=" + address
				+ ", password=" + password + ", confirmpass=" + confirmpass + "]";
	
	}
}
