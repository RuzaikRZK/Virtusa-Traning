package com.example.project.service;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.example.project.model.APIResponse;
import com.example.project.model.AccessToken;

import com.example.project.model.UserDetailes;
import com.example.project.repository.AdminAccountRepository;

@Service
public class AdminAccountServiceImplementation implements AdminSignupService {

	@Autowired
	AdminAccountRepository adminAccountRepository;

	@Autowired
	private RestTemplate restTemplate;

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Override
	public UserDetailes SaveDetailes(UserDetailes Userdetailes ) {
	

		return adminAccountRepository.save(Userdetailes);
	}

	@Override
	public APIResponse adminLogin(String username, String password) {
		UserDetailes adminDetailes = adminAccountRepository.findByUsername(username);

		if (adminDetailes != null) {
			if (adminDetailes.getPassword().equals(password)) {

				String clientID = "web";
				String clientSecret = "webpass";

				// Call and get Access Token
				String authServerURL = "http://localhost:7878/oauth/token";
				String clientCredentials = clientID + ":" + clientSecret;
				String authBasicHeaderClient = "Basic "
						+ Base64.getEncoder().encodeToString(clientCredentials.getBytes());

				HttpHeaders httpHeaders = new HttpHeaders();
				httpHeaders.set(HttpHeaders.AUTHORIZATION, authBasicHeaderClient);
				httpHeaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

				MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<>();
				multiValueMap.add("username", "krish");
				multiValueMap.add("password", "krishpass");
				multiValueMap.add("grant_type", "password");

				HttpEntity<MultiValueMap<String, String>> httpEntity = new HttpEntity<>(multiValueMap, httpHeaders);

				ResponseEntity<AccessToken> responseEntity = restTemplate.exchange(authServerURL, HttpMethod.POST,
						httpEntity, AccessToken.class);

				return new APIResponse(200, "Successfull!", responseEntity.getBody());
			}
		}
		return new APIResponse(400, "Failed!", new AccessToken());
	}
}
