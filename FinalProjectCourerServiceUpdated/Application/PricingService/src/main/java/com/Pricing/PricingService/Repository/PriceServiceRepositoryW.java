package com.Pricing.PricingService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Pricing.PricingService.model.WeightPack;

public interface PriceServiceRepositoryW extends JpaRepository<WeightPack,Integer>{

	WeightPack findByWeightPackvalue(int WeightPackvalue);
	
	@Modifying
	@Query("update WeightPack u set u.price = :price where u.id = :id")
	void UpdateWeightPack(@Param("price") double price,@Param("id") int id );
	
	
	
	
}
