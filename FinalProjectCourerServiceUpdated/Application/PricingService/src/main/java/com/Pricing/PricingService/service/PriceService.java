package com.Pricing.PricingService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Pricing.PricingService.model.DayPack;
import com.Pricing.PricingService.model.Package;
import com.Pricing.PricingService.model.WeightPack;




public interface PriceService  {
	
	public List<Double> TotalPrice(int wvalue, int pvalue);
	
	public double getStartPrice();
	
	public WeightPack GetAllWeightPackDetailes (int wvalue);
	
	public DayPack GetAlldayPackDetailes (int dvalue);
	
	// Package Services -------------------------
	
	
	public List<Package> BasicPackage(String Packname);
	
	public List<Package> PremiumPackage(String Packname);
	
	public void ChangeStartPrice (double startprice,int id);
	
	public void ChangedayPackValue (double price, int id);
	
	
	public void ChangeWeightPackValue (double price, int id);
	
	
	

}
