package com.example.project.model;

public class APIResponse {

	private Integer statusCode;
	private String message;
	private AccessToken accessToken;

	public APIResponse() {
		super();
	}

	public APIResponse(Integer statusCode, String message, AccessToken accessToken) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.accessToken = accessToken;
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