package com.stream.streamline.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Users")

public class SignUpModel {
	
	@Id 
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	private int id;
	private String name;
	private String DOB;
	private String email;
	private String password;
	
	public SignUpModel() {
	super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String DOB) {
		this.DOB = DOB;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "SignUpModel [name="+ name + ", DOB="+ DOB + ", email=" + email + ", password=" + password + "]";
	}
}
