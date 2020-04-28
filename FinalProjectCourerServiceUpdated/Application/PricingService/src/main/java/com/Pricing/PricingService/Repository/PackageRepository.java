package com.Pricing.PricingService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Pricing.PricingService.model.Package;

public interface PackageRepository extends JpaRepository<Package,Integer> {

	List<Package> findByPackagename(String packname);
	
	
	
}
