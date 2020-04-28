package com.Pricing.PricingService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Pricing.PricingService.model.DayPack;
import com.Pricing.PricingService.model.Package;
import com.Pricing.PricingService.model.WeightPack;
import com.Pricing.PricingService.service.PriceService;
import com.Pricing.PricingService.service.PriceServiceImplementation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/PricingService")
public class PriceCalculator {

	@Autowired
	PriceService priceService;

	// Authorized Price Calculation Service
	
	@GetMapping(value = "/GetTotal/{Weightvalue}/{Dayvalue}")
	public List<Double> PriceCalculator(@PathVariable int Weightvalue, @PathVariable int Dayvalue) {

		return priceService.TotalPrice(Weightvalue, Dayvalue);

	}
	
	//UnAuhorized Price Calculation Service
	@GetMapping(value = "/GetTotalWithUnothorized/{Weightvalue}/{Dayvalue}")
	public List<Double> PriceCalculatorUnAutorized(@PathVariable int Weightvalue, @PathVariable int Dayvalue){
		
		return priceService.TotalPrice(Weightvalue, Dayvalue);
	}
	
	
	// Price Planing Section -----------------------------------------------------------------------
	
	@GetMapping(value = "/GetWeightDetaile/{WeightValue}")
	public WeightPack GetWeightPack(@PathVariable int WeightValue){
		
		return priceService.GetAllWeightPackDetailes(WeightValue);
	}
	
	@GetMapping(value = "/GetDayDetaile/{dayValue}")
	public DayPack GetDayPack(@PathVariable int dayValue) {
		
		return priceService.GetAlldayPackDetailes(dayValue);
		
	}
	
	@GetMapping(value = "/GetStartPrice")
	public Double GetStartPrice() {
		
		return priceService.getStartPrice();
		
	}
	
	//Package controller -----------------------------------------------------------
	
	@GetMapping(value = "/GetBasicPackage")
	public List<Package> GetBasicPackage (){
		
		return priceService.BasicPackage("Basic");
		
	}
	
	@GetMapping(value = "/GetPremiumPackage")
	public List<Package> GetPremiumPackage (){
		
		return priceService.BasicPackage("Premium");
		
	}
	
	@RequestMapping(method = RequestMethod.PUT , value = "/UpdateStartPrice/{price}/{id}")
	public void UpdateStartPrice(@PathVariable double price,@PathVariable int id) {
		
		priceService.ChangeStartPrice(price, id);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT , value = "/UpdatedayPack/{price}/{id}")
	public void UpdateDaypack(@PathVariable double price,@PathVariable int id) {
		
		priceService.ChangedayPackValue(price, id);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT , value = "/UpdateWeightPack/{price}/{id}")
	public void UpdateWeightpack(@PathVariable double price,@PathVariable int id) {
		
		priceService.ChangeWeightPackValue(price, id);
		
	}
	

}
