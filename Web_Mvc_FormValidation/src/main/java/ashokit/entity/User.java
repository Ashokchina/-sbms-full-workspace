package ashokit.entity;

import jakarta.validation.constraints.Size;

public class User {
	@Size(min = 4, message = "User name should be more than 4 chars")
	private String name;
	private String email;
	@Size(min = 10, max = 10, message = "phone no must be 10 digits")
	private String phno;

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

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", phno=" + phno + "]";
	}

}
