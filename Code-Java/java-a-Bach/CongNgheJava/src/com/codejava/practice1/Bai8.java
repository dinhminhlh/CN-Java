package com.codejava.practice1;

import java.util.Scanner;

public class Bai8 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double a,b,c;
		do {
			System.out.println("Nhap a, b, c: ");
			a = Double.parseDouble(sc.nextLine().trim());
			b = Double.parseDouble(sc.nextLine().trim());
			c = Double.parseDouble(sc.nextLine().trim());
			if(a < 0 || b<0 || c<0) {
				System.out.println("Nhap lai!!");
			}
		}while(a < 0 || b<0 || c<0);
		
		if(a+b>c && a+c>b && b+c>a) {
			System.out.print("Chu vi: "+(a+b+c));
			float p = (float) (a+b+c)/2;
			System.out.print("\nDien tich: "+Math.sqrt(p*(p-a)*(p-b)*(p-c)));
		}
		else {
			System.out.println("Khong tao thanh tam giac");
		}
	}
}
