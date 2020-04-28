package com.Pricing.PricingService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Package {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String packagename;
	private int weightvalue;
	private int dayvalue;
	
	
	public Package() {
		
	}


	public Package(int id, String packagename, int weightvalue, int dayvalue) {
		super();
		this.id = id;
		this.packagename = packagename;
		this.weightvalue = weightvalue;
		this.dayvalue = dayvalue;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPackagename() {
		return packagename;
	}


	public void setPackagename(String packagename) {
		this.packagename = packagename;
	}


	public int getWeightvalue() {
		return weightvalue;
	}


	public void setWeightvalue(int weightvalue) {
		this.weightvalue = weightvalue;
	}


	public int getDayvalue() {
		return dayvalue;
	}


	public void setDayvalue(int dayvalue) {
		this.dayvalue = dayvalue;
	}
	
	
	
	
	
	
	
}
