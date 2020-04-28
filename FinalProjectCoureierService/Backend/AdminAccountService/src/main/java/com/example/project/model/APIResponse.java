package com.example.project.model;

public class APIResponse {

	private Integer statusCode;
	private String message;
	private AccessToken accessToken;
	private String Role;

	public APIResponse(Integer statusCode, String message, AccessToken accessToken, String role) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.accessToken = accessToken;
		this.Role = role;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public APIResponse() {
		super();
	}

	

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public AccessToken getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(AccessToken accessToken) {
		this.accessToken = accessToken;
	}
}