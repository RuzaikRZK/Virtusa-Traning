package com.example.project.model;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import antlr.collections.List;

@Entity
public class AdminDetailes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String adminName;
	private String email;
	private String password;

	@OneToMany(mappedBy = "adminDetailes", cascade = CascadeType.ALL)
	private java.util.List<AdminContact> contactList;

	public AdminDetailes(int id, String adminName, String email, String password) {
		super();
		this.id = id;
		this.adminName = adminName;
		this.email = email;
		this.password = password;

	}

	public AdminDetailes() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
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

	public java.util.List<AdminContact> getContactList() {
		return contactList;
	}

	public void setContactList(java.util.List<AdminContact> contactList) {
		this.contactList = contactList;
	}

	public static java.util.List<AdminDetailes> getAllEmployees() {

		java.util.List<AdminDetailes> adminDetailesList = new ArrayList<AdminDetailes>();
		adminDetailesList.add(new AdminDetailes(1, "ruzaik", "ruzaikmohomad@gmail.com", "123"));
		adminDetailesList.add(new AdminDetailes(1, "madush", "madush@gmail.com", "123"));

		return adminDetailesList;

	}

}
