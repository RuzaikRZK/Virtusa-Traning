package com.Pricing.PricingService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WeightPack {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int weightPackvalue;
	private String WeightDescription;
	private double price;

	public WeightPack() {
		super();
	}

	public WeightPack(int id, int weightPackvalue, String weightDescription, double price) {
		super();
		this.id = id;
		weightPackvalue = weightPackvalue;
		WeightDescription = weightDescription;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWeightPackvalue() {
		return weightPackvalue;
	}

	public void setWeightPackvalue(int weightPackvalue) {
		weightPackvalue = weightPackvalue;
	}

	public String getWeightDescription() {
		return WeightDescription;
	}

	public void setWeightDescription(String weightDescription) {
		WeightDescription = weightDescription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
