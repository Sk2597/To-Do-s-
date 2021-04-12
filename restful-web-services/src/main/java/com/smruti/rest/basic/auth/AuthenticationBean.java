package com.smruti.rest.basic.auth;

public class AuthenticationBean {

	private String message;

	public AuthenticationBean(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}
	

	public String getmessage() {
		return message;
	}


	public void setmessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

	

}
