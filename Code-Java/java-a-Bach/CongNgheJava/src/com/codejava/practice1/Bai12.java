package com.codejava.practice1;

import java.util.Scanner;

public class Bai12 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Nhap R: ");
		float r = Float.parseFloat(sc.nextLine().trim());
		
		System.out.print("Chu vi = " +2*Math.PI*r);
		System.out.print("\nDien tich = " +Math.PI*r*r);
	}
}
