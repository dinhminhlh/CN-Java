package com.codejava.practice1;

import java.util.Scanner;

public class Bai11 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Nhap day lon: ");
		float a = Float.parseFloat(sc.nextLine().trim());
		System.out.print("\nNhap day nho: ");
		float b = Float.parseFloat(sc.nextLine().trim());
		System.out.print("\nNhap day chieu cao: ");
		float h = Float.parseFloat(sc.nextLine().trim());
		
		System.out.print("\nDien tich = " + 0.5*(a+b)*h);
	}
	
}
