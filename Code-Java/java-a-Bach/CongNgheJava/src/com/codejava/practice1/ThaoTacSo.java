package com.codejava.practice1;

import java.util.Scanner;

public class ThaoTacSo {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a, b;
		System.out.print("Nhap so thu nhat: ");
		a = Integer.parseInt(sc.nextLine().trim());
		System.out.print("Nhap so thu hai: ");
		b = Integer.parseInt(sc.nextLine().trim());
		
		System.out.printf("Tong cua %d va %d la: %d",a,b,a+b);
	}
}