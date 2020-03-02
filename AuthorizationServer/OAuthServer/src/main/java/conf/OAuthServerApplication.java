package conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

// -------------------- settings ----------------------------------------------------------

// GET :localhost:7878/oauth/check_token?token=a3ac43c7-b13f-4d85-b809-60f0fc7d5c49
// POST : localhost:7878/oauth/token

// set grant type (Form -> Form URL Encoded , grant type , username ,password)and Basic OAuth 

//--------------------------------------------------------------------------------------


@SpringBootApplication
@EnableAuthorizationServer
public class OAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuthServerApplication.class, args);
	}

}
