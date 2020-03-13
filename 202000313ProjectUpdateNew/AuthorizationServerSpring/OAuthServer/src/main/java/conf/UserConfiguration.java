package conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
@Configuration
public class UserConfiguration extends GlobalAuthenticationConfigurerAdapter  {
	
	PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
	
	@Override
	public void init(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication().withUser("krish").password(passwordEncoder.encode("krishpass")).roles("ADMIN","USER","MANAGER")
		.authorities("CAN_READ","CAN_WRITE","CAN_DELETE").and().withUser("ruzaik").password(passwordEncoder.encode("ruzaikpass")).roles("USER")
		.authorities("CAN_READ","CAN_WRITE");
		
		
		
	}

	

}
