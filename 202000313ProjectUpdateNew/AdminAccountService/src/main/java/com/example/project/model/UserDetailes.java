package com.example.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserDetailes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Firstname;
	private String LastName;
	private String username;
	private String Password;
	private String nic;
	private String Address;
	private String email;
	private String PhoneNumber;
	private String Role;

	


	public UserDetailes() {
		super();
	}
	
	public UserDetailes(int id, String firstname, String lastName, String username, String password, String nic,
			String address, String email, String phoneNumber, String role) {
		super();
		this.id = id;
		Firstname = firstname;
		LastName = lastName;
		this.username = username;
		Password = password;
		this.nic = nic;
		Address = address;
		this.email = email;
		PhoneNumber = phoneNumber;
		Role = role;
	}
	

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

}
