package com.Pricing.PricingService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Pricing.PricingService.model.DayPack;

public interface PricingServiceRepository extends JpaRepository<DayPack, Integer> {

	DayPack findByDayPackvalue(int dayPackvalue);
	
	@Modifying
	@Query("update DayPack u set u.price = :price where u.id = :id")
	void UpdateDayPack(@Param("price") double price,@Param("id") int id );
	
	
	
	
}



