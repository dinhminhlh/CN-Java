package com.codejava.practice1;

import java.util.Scanner;

public class PhuongTrinhBac2 {
static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		double a,b,c;
		System.out.println("Nhap a, b, c: ");
		a = Double.parseDouble(sc.nextLine());
		b = Double.parseDouble(sc.nextLine());
		c = Double.parseDouble(sc.nextLine());
		
		double delta = Math.pow(b, 2) - 4*a*c;
		
		
		if(delta > 0) {
			System.out.println("Nghiem cua phuong trinh la x1 = " + (b+Math.sqrt(delta))/2/a +" va x2= " + (b-Math.sqrt(delta))/2/a);
		}
		else if(delta == 0) {
			System.out.println("Phuong trinh co nghiem kep x = " + b/2/a);
		}
		else {
			System.out.println("Phuong trinh vo nghiem");
		}
	}
}
