package com.Pricing.PricingService.Controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
public class WebSecurityConfiguartion extends WebSecurityConfigurerAdapter {
	
	@Override
	public void configure(WebSecurity web) throws Exception {

	
		web.ignoring().antMatchers(HttpMethod.GET,"/PricingService/GetTotalWithUnothorized/**");
		
		web.ignoring().antMatchers(HttpMethod.GET,"/PricingService/GetWeightDetaile/**");
		web.ignoring().antMatchers(HttpMethod.GET,"/PricingService/GetDayDetaile/**");
		web.ignoring().antMatchers(HttpMethod.GET,"/PricingService/GetStartPrice");
		
		web.ignoring().antMatchers(HttpMethod.GET,"/PricingService/GetBasicPackage");
		web.ignoring().antMatchers(HttpMethod.GET,"/PricingService/GetPremiumPackage");
		

	}

}
