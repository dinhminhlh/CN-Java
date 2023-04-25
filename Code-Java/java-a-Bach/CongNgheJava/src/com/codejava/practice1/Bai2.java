package com.codejava.practice1;

import java.util.Scanner;

public class Bai2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int x;
		System.out.println("Nhap x: ");
		x = Integer.parseInt(sc.nextLine().trim());
		
		System.out.println("y = 2^x = " +Math.pow(2,x));
	}
	
}
