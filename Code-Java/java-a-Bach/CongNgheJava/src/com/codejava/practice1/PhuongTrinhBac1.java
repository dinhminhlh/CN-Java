package com.codejava.practice1;

import java.util.Scanner;

public class PhuongTrinhBac1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a, b;
		System.out.print("Nhap a: ");
		a = Integer.parseInt(sc.nextLine().trim());
		System.out.print("Nhap b: ");
		b = Integer.parseInt(sc.nextLine().trim());
		if(a==0 && b!=0) {
			System.out.println("Phuong trinh vo nghiem");
		}
		else if(a==0 && b==0) {
			System.out.println("Phuong trinh vo so nghiem");
		}
		else {
			System.out.println("Phuong trinh co nghiem la x = " + -b/a);
		}
	}
}
