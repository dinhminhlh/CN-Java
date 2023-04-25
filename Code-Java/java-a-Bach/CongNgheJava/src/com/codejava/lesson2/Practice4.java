package com.codejava.lesson2;

import java.util.Scanner;

public class Practice4 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int x;
		int y;
		
		System.out.print("Nhap x: ");
		x = Integer.parseInt(input.nextLine());
		System.out.print("Nhap y: ");
		y = Integer.parseInt(input.nextLine());
		
		System.out.println("S = " + x*y);
		System.out.println("P = " + (x+y)*2);
		System.out.println("Chieu rong la: " + Math.min(x, y));

	}
}
