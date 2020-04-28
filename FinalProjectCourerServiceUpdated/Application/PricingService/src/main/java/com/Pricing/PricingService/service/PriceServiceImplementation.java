package com.Pricing.PricingService.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Pricing.PricingService.Repository.PackageRepository;
import com.Pricing.PricingService.Repository.PriceServiceRepositoryW;
import com.Pricing.PricingService.Repository.PriceServiceRepositroyS;
import com.Pricing.PricingService.Repository.PricingServiceRepository;

import com.Pricing.PricingService.model.DayPack;
import com.Pricing.PricingService.model.Package;
import com.Pricing.PricingService.model.StartPricing;
import com.Pricing.PricingService.model.WeightPack;

@Service
public class PriceServiceImplementation implements PriceService {

	@Autowired
	PricingServiceRepository pricingServiceRepository;

	@Autowired
	PriceServiceRepositoryW priceServiceRepositoryW;

	@Autowired
	PriceServiceRepositroyS priceServiceRepositroyS;
	
	@Autowired
	PackageRepository packageRepository;

	@Override
	public List<Double> TotalPrice(int wvalue, int pvalue) {

		DayPack d = pricingServiceRepository.findByDayPackvalue(pvalue);

		WeightPack w = priceServiceRepositoryW.findByWeightPackvalue(wvalue);

		double total = d.getPrice() + w.getPrice() + getStartPrice();

		List<Double> totalPrice = new ArrayList<Double>();
		totalPrice.add(total);

		return totalPrice;

	}

	@Override
	public double getStartPrice() {
		Integer i = 1;
		StartPricing s = priceServiceRepositroyS.getOne(i);

		double d = s.getStartprice();

		// System.out.print(d);

		return d;

	}

	@Override
	public WeightPack GetAllWeightPackDetailes(int wvalue) {
		return  priceServiceRepositoryW.findByWeightPackvalue(wvalue);
	}

	@Override
	public DayPack GetAlldayPackDetailes(int dvalue) {
	
		return  pricingServiceRepository.findByDayPackvalue(dvalue);
		
	}

	@Override
	public List<Package> BasicPackage(String Packname) {
		
		return packageRepository.findByPackagename(Packname);
	}

	@Override
	public List<Package> PremiumPackage(String Packname) {
		
		return packageRepository.findByPackagename(Packname);
	}

	@Transactional
	@Override
	public void ChangeStartPrice(double startprice, int id) {
		
		priceServiceRepositroyS.UpdateStartPrice(startprice, id);
		
	}

	@Transactional
	@Override
	public void ChangedayPackValue(double price, int id) {
		pricingServiceRepository.UpdateDayPack(price, id);
		
	}

	@Transactional
	@Override
	public void ChangeWeightPackValue(double price, int id) {
		priceServiceRepositoryW.UpdateWeightPack(price, id);
		
	}
	
	////-------------------------------------------------------------
	
	
	

}
