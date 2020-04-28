package com.Courier.CourierService.Controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
public class WebSecurityConfiguartion extends WebSecurityConfigurerAdapter {
	
	@Override
	public void configure(WebSecurity web) throws Exception {

	
		web.ignoring().antMatchers(HttpMethod.GET,"/CourierService/GetallCourierDetailesByTrackID/*");
	//	web.ignoring().antMatchers(HttpMethod.PUT,"/CourierService/Updatecourier/*/*/*");
		

	}

}
