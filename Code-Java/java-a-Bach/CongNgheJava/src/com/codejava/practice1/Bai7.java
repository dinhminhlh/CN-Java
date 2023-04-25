package com.codejava.practice1;

import java.util.Scanner;

public class Bai7 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Nhap goc: ");
		double a = Double.parseDouble(sc.nextLine().trim());
		
		double b = a*Math.PI/180;
		System.out.printf("Sin(%.0f) = %f",a,Math.sin(b));
		
		if(b==0) {
			double tan = 0;
			String cot = "Infinty";
			System.out.printf("\nTan(%.0f) = %f",a,tan);
			System.out.printf("\nCot(%.0f) = %s",a,cot);
		}
		else {
			System.out.printf("\nTan(%.0f) = %f",a,Math.tan(b));
			System.out.printf("\nCot(%.0f) = %s",a,1/Math.tan(b));
		}
	}
}
