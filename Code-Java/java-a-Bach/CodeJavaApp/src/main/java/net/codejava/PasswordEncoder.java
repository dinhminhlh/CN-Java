package net.codejava;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		String rawPasword = "123456";
		String encodedPassword = encoder.encode(rawPasword);
		
		System.out.println(encodedPassword);
	}
}
 