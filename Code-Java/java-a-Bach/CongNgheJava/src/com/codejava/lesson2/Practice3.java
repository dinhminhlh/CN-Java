package com.codejava.lesson2;

import java.util.Scanner;

public class Practice3 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int x;
		int y;
		
		System.out.print("Nhap x: ");
		x = Integer.parseInt(input.nextLine());
		System.out.print("Nhap y: ");
		y = Integer.parseInt(input.nextLine());
		
		System.out.println("x + y = " + (x+y));
		System.out.println("x - y = " + (x-y));
		System.out.println("x * y = " + (x*y));
		System.out.println("x / y = " + (double)x/(double)y);

	}
}
