package com.codejava.practice1;

import java.util.Scanner;

public class Bai9 {
	private double x, n;
	static Scanner sc = new Scanner(System.in);
	
	public void input() {
		System.out.print("Nhap x: ");
		x = Double.parseDouble(sc.nextLine().trim());
		do {
			System.out.print("Nhap n: ");
			n = Double.parseDouble(sc.nextLine().trim());
		}while(n<=0);
	}
	long factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));
	}    
	public static void main(String[] args) { 
		Bai9 bai9 = new Bai9();
		bai9.input();
		double sum = 0;
		for(int i=1;i<=bai9.n;i++) {
			sum += Math.pow(bai9.x, i)/bai9.factorial(i);
		}
		
		System.out.printf("S(%.0f,%.0f) = %.3f",bai9.x, bai9.n, sum);
	}
}
