package com.Pricing.PricingService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StartPricing {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private int id;
	
	
	public StartPricing() {
		super();
	}
	private double startprice;
	
	
	public StartPricing(int id, double startprice) {
		super();
		this.id = id;
		this.startprice = startprice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getStartprice() {
		return startprice;
	}
	public void setStartprice(double startprice) {
		this.startprice = startprice;
	}
	
	

}
