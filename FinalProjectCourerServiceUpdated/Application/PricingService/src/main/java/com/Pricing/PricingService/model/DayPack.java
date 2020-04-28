package com.Pricing.PricingService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DayPack {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int dayPackvalue;
	private String dayDescription;
	private double price;
	
	
	public DayPack() {
		super();
	}
	public DayPack(int id, int dayPackvalue, String dayDescription, double price) {
		super();
		this.id = id;
		this.dayPackvalue = dayPackvalue;
		this.dayDescription = dayDescription;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDayPackvalue() {
		return dayPackvalue;
	}
	public void setDayPackvalue(int dayPackvalue) {
		this.dayPackvalue = dayPackvalue;
	}
	public String getDayDescription() {
		return dayDescription;
	}
	public void setDayDescription(String dayDescription) {
		this.dayDescription = dayDescription;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
	
}
