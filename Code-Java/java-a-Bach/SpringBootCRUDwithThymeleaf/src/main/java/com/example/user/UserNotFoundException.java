package com.example.user;

@SuppressWarnings("serial")
public class UserNotFoundException extends Throwable {
	public UserNotFoundException(String message) {
		super(message);
	}
}
