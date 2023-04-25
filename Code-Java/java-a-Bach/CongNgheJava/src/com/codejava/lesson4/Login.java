package com.codejava.lesson4;

import java.util.Scanner;

public class Login {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String userame;
		String password;
		
		System.out.print("Ten dang nhap: ");
		userame = sc.nextLine();
		System.out.print("Mat khau: ");
		password = sc.nextLine();
		
		if(userame.equalsIgnoreCase("hello") && password.length() >6) {
			System.out.println("Success !!!");
		}
		else {
			System.out.println("Username or password is not formatted correctly !");
		}
	}
}
