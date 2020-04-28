package com.Pricing.PricingService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Pricing.PricingService.model.StartPricing;

public interface PriceServiceRepositroyS extends JpaRepository<StartPricing,Integer> {
	
	@Modifying
	@Query("update StartPricing u set u.startprice = :startprice where u.id = :id")
	void UpdateStartPrice(@Param("startprice") double startprice,@Param("id") int id );
	
	

}
