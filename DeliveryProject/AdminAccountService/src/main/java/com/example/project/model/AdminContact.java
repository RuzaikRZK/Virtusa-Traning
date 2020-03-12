package com.example.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GeneratorType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class AdminContact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String number;

	@ManyToOne
	@JoinColumn
	@JsonIgnore
	private AdminDetailes adminDetailes;

	public AdminContact() {

	}

	

	public AdminContact(int id, String number) {
		super();
		this.id = id;
		this.number = number;
	}



	public AdminContact(int id, String number, AdminDetailes adminDetailes) {
		super();
		this.id = id;
		this.number = number;
		this.adminDetailes = adminDetailes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public AdminDetailes getAdminDetailes() {
		return adminDetailes;
	}

	public void setAdminDetailes(AdminDetailes adminDetailes) {
		this.adminDetailes = adminDetailes;
	}

}
